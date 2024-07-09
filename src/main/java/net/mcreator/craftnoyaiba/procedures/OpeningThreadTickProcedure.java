package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class OpeningThreadTickProcedure {
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
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("craftnoyaiba:opening_thread"))).isDone()) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator) && (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craftnoyaiba:demon")))
							|| ((entityiterator.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Race).equals("Demon"))) {
						if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Kendo
								|| (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 8
										&& (entityiterator.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood <= (entityiterator
												.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).BloodMax / 5) {
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
													_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, Xa, Ya, Za, 1, 0, 0, 0, 0);
												Za = 0.2 + Za;
											}
										} else {
											Za = Math.floor(entityiterator.getZ()) + 0.2;
											while (Za <= Math.floor(entity.getZ())) {
												T = (Za - entity.getZ()) / Zo;
												Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
												Xa = entity.getX() + Xo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, Xa, Ya, Za, 1, 0, 0, 0, 0);
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
													_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, Xa, Ya, Za, 1, 0, 0, 0, 0);
												Ya = 0.2 + Ya;
											}
										} else {
											Ya = Math.floor(entityiterator.getY()) + 0.2;
											while (Ya <= Math.floor(entity.getY())) {
												T = (Ya - entity.getY()) / Yo;
												Xa = entity.getX() + Xo * T;
												Za = entity.getZ() + Zo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, Xa, Ya, Za, 1, 0, 0, 0, 0);
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
											_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, Xa, Ya, Za, 1, 0, 0, 0, 0);
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
										_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, Xa, Ya, Za, 1, 0, 0, 0, 0);
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
