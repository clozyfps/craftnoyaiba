package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModBlocks;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class InfinityFortressPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftnoyaiba:biwa")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftnoyaiba:biwa")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (!CraftnoyaibaModVariables.WorldVariables.get(world).InfinityCastleSpawned) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftnoyaiba", "infinitycastle"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y - 30, z), BlockPos.containing(x, y - 30, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			CraftnoyaibaMod.queueServerWork(35, () -> {
				int horizontalRadiusHemiTop = (int) 65 - 1;
				int verticalRadiusHemiTop = (int) 65;
				int yIterationsHemiTop = verticalRadiusHemiTop;
				for (int i = 0; i < yIterationsHemiTop; i++) {
					if (i == verticalRadiusHemiTop) {
						continue;
					}
					for (int xi = -horizontalRadiusHemiTop; xi <= horizontalRadiusHemiTop; xi++) {
						for (int zi = -horizontalRadiusHemiTop; zi <= horizontalRadiusHemiTop; zi++) {
							double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop) + (i * i) / (double) (verticalRadiusHemiTop * verticalRadiusHemiTop)
									+ (zi * zi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop);
							if (distanceSq <= 1.0) {
								if ((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == CraftnoyaibaModBlocks.MUZAN_SPAWN_POINT.get()) {
									{
										Entity _ent = entity;
										_ent.teleportTo(x + xi, y + i, z + zi);
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport(x + xi, y + i, z + zi, _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					}
				}
			});
			CraftnoyaibaModVariables.WorldVariables.get(world).InfinityCastleSpawned = true;
			CraftnoyaibaModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
