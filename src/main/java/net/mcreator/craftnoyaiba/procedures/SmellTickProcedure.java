package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModParticleTypes;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class SmellTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		double WebPower = 0;
		double T = 0;
		double Zo = 0;
		double Yo = 0;
		double Za = 0;
		double Xo = 0;
		double Ya = 0;
		double Xa = 0;
		double mag = 0;
		double deltaz = 0;
		double distance = 0;
		double deltax = 0;
		double deltay = 0;
		if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Trait).equals("Enhanced Smell")) {
			entity.getPersistentData().putDouble("smelltimer", (entity.getPersistentData().getDouble("smelltimer") + 1));
			if (entity.getPersistentData().getDouble("smelltimer") >= 300) {
				entity.getPersistentData().putDouble("smelltimer", 0);
				raytrace_distance = 2;
				for (int index0 = 0; index0 < 14; index0++) {
					if (!world.getBlockState(new BlockPos(
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getX(),
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getY(),
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getZ()))
							.canOcclude() || raytrace_distance < 14) {
						raytrace_distance = raytrace_distance + 1;
						world.addParticle((SimpleParticleType) (CraftnoyaibaModParticleTypes.BLOOD_CRITICAL.get()), x, (y + 1), z, ((Math.sin(Math.toRadians(entity.getYRot() + 180)) * raytrace_distance) / 2),
								((Math.sin(Math.toRadians(0 - entity.getXRot())) * raytrace_distance) / 2), ((Math.cos(Math.toRadians(entity.getYRot())) * raytrace_distance) / 2));
					}
				}
				WebPower = 20;
				raytrace_distance = (x - entity.getX()) / WebPower;
				raytrace_distance = (y - entity.getY()) / WebPower;
				raytrace_distance = (z - entity.getZ()) / WebPower;
				raytrace_distance = 5;
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entity == entityiterator) && !(entityiterator instanceof Player)) {
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craftnoyaiba:demons")))
									|| ((entityiterator.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Race).equals("Demon")) {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("\u00A74I smell a demon nearby.."), false);
								Xo = entity.getX() - entityiterator.getX();
								Yo = entity.getY() - entityiterator.getY();
								Zo = entity.getZ() - entityiterator.getZ();
								if (Math.floor(entity.getX()) <= Math.floor(entityiterator.getX())) {
									if (Math.floor(entity.getX()) == Math.floor(entityiterator.getX())) {
										if (Math.floor(entity.getY()) == Math.floor(entityiterator.getY())) {
											if (Math.floor(entity.getZ()) <= Math.floor(entityiterator.getZ())) {
												Za = Math.floor(entity.getZ()) + 0.2;
												while (Za <= Math.floor(entityiterator.getZ())) {
													T = (Za - entity.getZ()) / Zo;
													Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
													Xa = entity.getX() + Xo * T;
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (CraftnoyaibaModParticleTypes.BLOOD_CRITICAL.get()), Xa, Ya, Za, 1, 0, 0, 0, 0);
													Za = 0.2 + Za;
												}
											} else {
												Za = Math.floor(entityiterator.getZ()) + 0.2;
												while (Za <= Math.floor(entity.getZ())) {
													T = (Za - entity.getZ()) / Zo;
													Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
													Xa = entity.getX() + Xo * T;
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (CraftnoyaibaModParticleTypes.BLOOD_CRITICAL.get()), Xa, Ya, Za, 1, 0, 0, 0, 0);
													Za = 0.2 + Za;
												}
											}
										} else {
											if (Math.floor(entity.getY()) <= Math.floor(entityiterator.getY())) {
												Ya = Math.floor(entity.getY()) + 0.2;
												while (Ya <= Math.floor(entityiterator.getY())) {
													T = (Ya - entity.getY()) / Yo;
													Xa = entity.getX() + Xo * T;
													Za = entity.getZ() + Zo * T;
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (CraftnoyaibaModParticleTypes.BLOOD_CRITICAL.get()), Xa, Ya, Za, 1, 0, 0, 0, 0);
													Ya = 0.2 + Ya;
												}
											} else {
												Ya = Math.floor(entityiterator.getY()) + 0.2;
												while (Ya <= Math.floor(entity.getY())) {
													T = (Ya - entity.getY()) / Yo;
													Xa = entity.getX() + Xo * T;
													Za = entity.getZ() + Zo * T;
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (CraftnoyaibaModParticleTypes.BLOOD_CRITICAL.get()), Xa, Ya, Za, 1, 0, 0, 0, 0);
													Ya = 0.2 + Ya;
												}
											}
										}
									} else {
										Xa = Math.floor(entity.getX()) + 0.2;
										while (Xa <= Math.floor(entityiterator.getX())) {
											T = (Xa - entity.getX()) / Xo;
											Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
											Za = entity.getZ() + Zo * T;
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (CraftnoyaibaModParticleTypes.BLOOD_CRITICAL.get()), Xa, Ya, Za, 1, 0, 0, 0, 0);
											Xa = 0.2 + Xa;
										}
									}
								} else {
									Xa = entityiterator.getX() + 0.2;
									while (Xa < Math.floor(entity.getX())) {
										T = (Xa - entity.getX()) / Xo;
										Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
										Za = entity.getZ() + Zo * T;
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (CraftnoyaibaModParticleTypes.BLOOD_CRITICAL.get()), Xa, Ya, Za, 1, 0, 0, 0, 0);
										Xa = 0.2 + Xa;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
