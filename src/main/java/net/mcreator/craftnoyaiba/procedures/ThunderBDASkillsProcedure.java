package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModMobEffects;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModItems;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class ThunderBDASkillsProcedure {
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
		if (!((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove).isEmpty()) {
			if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).BloodDemonArt).equals("Thunder")) {
				if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftnoyaibaModMobEffects.COOLDOWN.get()))) {
					if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
							.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form1)) {
						{
							double _setval = 60;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftnoyaibaModItems.KHAKKHARA.get()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							CraftnoyaibaMod.queueServerWork(15, () -> {
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX(),
											entity.getY(), entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ())));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								{
									final Vec3 _center = new Vec3(
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getY()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (!(entity == entityiterator)) {
												entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LIGHTNING_BOLT), entity),
														(float) (8 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 5));
												if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 15, 0, false, false));
											}
										}
									}
								}
							});
						} else if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftnoyaibaModItems.KHAKKHARA.get())) {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
										entity.getY(), entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ())));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
							{
								final Vec3 _center = new Vec3(
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (!(entity == entityiterator)) {
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LIGHTNING_BOLT), entity),
													(float) (10 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 5));
											if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
												_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 20, 0, false, false));
										}
									}
								}
							}
							CraftnoyaibaMod.queueServerWork(3, () -> {
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX(),
											entity.getY(), entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ())));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								{
									final Vec3 _center = new Vec3(
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getY()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (!(entity == entityiterator)) {
												entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LIGHTNING_BOLT), entity),
														(float) (10 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 5));
												if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 20, 0, false, false));
											}
										}
									}
								}
								CraftnoyaibaMod.queueServerWork(3, () -> {
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
										entityToSpawn
												.moveTo(Vec3
														.atBottomCenterOf(
																BlockPos.containing(
																		entity.level()
																				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																						entity))
																				.getBlockPos().getX(),
																		entity.getY(),
																		entity.level().clip(
																				new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getZ())));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									{
										final Vec3 _center = new Vec3(
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ()));
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
												if (!(entity == entityiterator)) {
													entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LIGHTNING_BOLT), entity),
															(float) (10 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 5));
													if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
														_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 20, 0, false, false));
												}
											}
										}
									}
									CraftnoyaibaMod.queueServerWork(3, () -> {
										if (world instanceof ServerLevel _level) {
											LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
											entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(
													entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX(),
													entity.getY(),
													entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getZ())));
											entityToSpawn.setVisualOnly(true);
											_level.addFreshEntity(entityToSpawn);
										}
										{
											final Vec3 _center = new Vec3(
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getY()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getZ()));
											List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
													.toList();
											for (Entity entityiterator : _entfound) {
												if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
													if (!(entity == entityiterator)) {
														entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LIGHTNING_BOLT), entity),
																(float) (10 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 5));
														if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
															_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 20, 0, false, false));
													}
												}
											}
										}
										CraftnoyaibaMod.queueServerWork(3, () -> {
											if (world instanceof ServerLevel _level) {
												LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
												entityToSpawn
														.moveTo(Vec3
																.atBottomCenterOf(BlockPos.containing(
																		entity.level()
																				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																						entity))
																				.getBlockPos().getX(),
																		entity.getY(),
																		entity.level().clip(
																				new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getZ())));
												entityToSpawn.setVisualOnly(true);
												_level.addFreshEntity(entityToSpawn);
											}
											{
												final Vec3 _center = new Vec3(
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(7)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()));
												List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream()
														.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
												for (Entity entityiterator : _entfound) {
													if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
														if (!(entity == entityiterator)) {
															entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LIGHTNING_BOLT), entity),
																	(float) (10 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 5));
															if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
																_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 20, 0, false, false));
														}
													}
												}
											}
										});
									});
								});
							});
						}
						{
							double _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood
									- (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).AbsoluteCost;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Blood = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ActiveMove = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
							.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form2)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftnoyaibaModItems.KHAKKHARA.get()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							CraftnoyaibaMod.queueServerWork(15, () -> {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.TESLA_ACTIVE.get(), 40, 0, false, false));
							});
						}
						{
							double _setval = 100;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.TESLA_ACTIVE.get(), 40, 0, false, false));
						{
							double _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood
									- (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).AbsoluteCost;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Blood = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						{
							String _setval = "";
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ActiveMove = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
							.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form3)) {
						{
							double _setval = 100;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood
									- (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).AbsoluteCost;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Blood = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftnoyaibaModItems.KHAKKHARA.get()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							CraftnoyaibaMod.queueServerWork(15, () -> {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (!(entity == entityiterator)) {
											if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
												if (world instanceof ServerLevel _level) {
													LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
													entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())));
													entityToSpawn.setVisualOnly(true);
													_level.addFreshEntity(entityToSpawn);
												}
												entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LIGHTNING_BOLT), entity),
														(float) (10 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 4));
											}
										}
									}
								}
							});
						} else {
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!(entity == entityiterator)) {
										if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (world instanceof ServerLevel _level) {
												LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
												entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())));
												entityToSpawn.setVisualOnly(true);
												_level.addFreshEntity(entityToSpawn);
											}
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LIGHTNING_BOLT), entity),
													(float) (8 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 5));
										}
									}
								}
							}
						}
						{
							String _setval = "";
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ActiveMove = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
	}
}
