package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModMobEffects;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import java.util.List;
import java.util.Comparator;

public class TCAFThunderGodWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		CraftnoyaibaMod.queueServerWork(40, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(immediatesourceentity == entityiterator)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 50, 0, false, false));
					}
				}
			}
		}
		{
			Entity _ent = entity;
			_ent.teleportTo((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), _ent.getYRot(), _ent.getXRot());
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/particle craftnoyaiba:yellow_electricity ~ ~1 ~ 3 3 3 0 25");
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftnoyaiba:shock")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftnoyaiba:shock")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		immediatesourceentity.setNoGravity(true);
		entity.getPersistentData().putDouble("dragonattacktimer", (entity.getPersistentData().getDouble("dragonattacktimer") + 1));
		if (entity.getPersistentData().getDouble("dragonattacktimer") >= 15) {
			entity.getPersistentData().putDouble("dragonattacktimer", 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (!(immediatesourceentity == entityiterator)) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, (y + 1), z, 3, 0.01, 0.01, 0.01, 0);
							entityiterator.hurt(
									new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craftnoyaiba:breathing_damage"))),
											immediatesourceentity, entity),
									(float) (10 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Kendo / 4
											+ (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).DamageModifier));
							if (entityiterator instanceof LivingEntity _entity)
								_entity.removeEffect(CraftnoyaibaModMobEffects.STUNNED.get());
						}
					}
				}
			}
		}
	}
}
