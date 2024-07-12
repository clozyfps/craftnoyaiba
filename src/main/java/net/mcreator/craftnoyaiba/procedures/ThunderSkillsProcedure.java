package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModMobEffects;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModEntities;
import net.mcreator.craftnoyaiba.entity.TCAFProjectileEntity;
import net.mcreator.craftnoyaiba.entity.GodspeedTCAFEntity;
import net.mcreator.craftnoyaiba.entity.FlamingThunderGodEntity;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class ThunderSkillsProcedure {
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
			if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Breathing).equals("Thunder")) {
				if (((entity instanceof LivingEntity _entity) ? _entity.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem
						|| (entity instanceof LivingEntity _entity ? _entity.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem) {
					if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CraftnoyaibaModMobEffects.COOLDOWN.get()))) {
						if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
								.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form1)) {
							TCAFActiveEffectStartedappliedProcedure.execute(world, entity);
							CraftnoyaibaMod.queueServerWork(10, () -> {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.TCAF_ACTIVE.get(), 30, 0));
							});
							{
								double _setval = 35;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTimer = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form1LimbTarget;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTarget = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 60;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Cooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 35, 0));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7l\u00A76" + "Thunder Breathing, First Form: Thunderclap and Flash.")), true);
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							{
								String _setval = "";
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveMove = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
								.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form2)) {
							{
								String _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form2LimbTarget;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTarget = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 300;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Cooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.PRE_SIX_FOLD.get(), 35, 0));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 225, 0));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7l\u00A76" + "Thunder Breathing, First Form: Thunderclap and Flash | Sixfold")), true);
							CraftnoyaibaMod.queueServerWork(35, () -> {
								{
									double _setval = 180;
									entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ActiveLimbTimer = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									Entity _shootFrom = entity;
									Level projectileLevel = _shootFrom.level();
									if (!projectileLevel.isClientSide()) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
												AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.setPierceLevel(piercing);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
										_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
										_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
								}
								CraftnoyaibaMod.queueServerWork(10, () -> {
									{
										Entity _shootFrom = entity;
										Level projectileLevel = _shootFrom.level();
										if (!projectileLevel.isClientSide()) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
													AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
													entityToSpawn.setOwner(shooter);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													entityToSpawn.setPierceLevel(piercing);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
											_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
											_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
									}
									CraftnoyaibaMod.queueServerWork(10, () -> {
										{
											Entity _shootFrom = entity;
											Level projectileLevel = _shootFrom.level();
											if (!projectileLevel.isClientSide()) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
														AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.setPierceLevel(piercing);
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
												_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
												_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
										}
										CraftnoyaibaMod.queueServerWork(10, () -> {
											{
												Entity _shootFrom = entity;
												Level projectileLevel = _shootFrom.level();
												if (!projectileLevel.isClientSide()) {
													Projectile _entityToSpawn = new Object() {
														public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
															AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
															entityToSpawn.setOwner(shooter);
															entityToSpawn.setBaseDamage(damage);
															entityToSpawn.setKnockback(knockback);
															entityToSpawn.setSilent(true);
															entityToSpawn.setPierceLevel(piercing);
															return entityToSpawn;
														}
													}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
													_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
													_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
													projectileLevel.addFreshEntity(_entityToSpawn);
												}
											}
											CraftnoyaibaMod.queueServerWork(10, () -> {
												{
													Entity _shootFrom = entity;
													Level projectileLevel = _shootFrom.level();
													if (!projectileLevel.isClientSide()) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.setPierceLevel(piercing);
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
														_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
														_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
												}
												CraftnoyaibaMod.queueServerWork(10, () -> {
													{
														Entity _shootFrom = entity;
														Level projectileLevel = _shootFrom.level();
														if (!projectileLevel.isClientSide()) {
															Projectile _entityToSpawn = new Object() {
																public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																	AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
																	entityToSpawn.setOwner(shooter);
																	entityToSpawn.setBaseDamage(damage);
																	entityToSpawn.setKnockback(knockback);
																	entityToSpawn.setSilent(true);
																	entityToSpawn.setPierceLevel(piercing);
																	return entityToSpawn;
																}
															}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
															_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
															_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
															projectileLevel.addFreshEntity(_entityToSpawn);
														}
													}
												});
											});
										});
									});
								});
							});
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
								double _setval = 80;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTimer = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form3LimbTarget;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTarget = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 350;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Cooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 80, 0));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7l\u00A76" + "Thunder Breathing, First Form: Thunderclap and Flash | Eightfold")), true);
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							CraftnoyaibaMod.queueServerWork(10, () -> {
								{
									Entity _shootFrom = entity;
									Level projectileLevel = _shootFrom.level();
									if (!projectileLevel.isClientSide()) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
												AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.setPierceLevel(piercing);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
										_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
										_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
								}
								CraftnoyaibaMod.queueServerWork(10, () -> {
									{
										Entity _shootFrom = entity;
										Level projectileLevel = _shootFrom.level();
										if (!projectileLevel.isClientSide()) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
													AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
													entityToSpawn.setOwner(shooter);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													entityToSpawn.setPierceLevel(piercing);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
											_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
											_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
									}
									CraftnoyaibaMod.queueServerWork(10, () -> {
										{
											Entity _shootFrom = entity;
											Level projectileLevel = _shootFrom.level();
											if (!projectileLevel.isClientSide()) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
														AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.setPierceLevel(piercing);
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
												_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
												_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
										}
										CraftnoyaibaMod.queueServerWork(10, () -> {
											{
												Entity _shootFrom = entity;
												Level projectileLevel = _shootFrom.level();
												if (!projectileLevel.isClientSide()) {
													Projectile _entityToSpawn = new Object() {
														public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
															AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
															entityToSpawn.setOwner(shooter);
															entityToSpawn.setBaseDamage(damage);
															entityToSpawn.setKnockback(knockback);
															entityToSpawn.setSilent(true);
															entityToSpawn.setPierceLevel(piercing);
															return entityToSpawn;
														}
													}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
													_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
													_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
													projectileLevel.addFreshEntity(_entityToSpawn);
												}
											}
											CraftnoyaibaMod.queueServerWork(10, () -> {
												{
													Entity _shootFrom = entity;
													Level projectileLevel = _shootFrom.level();
													if (!projectileLevel.isClientSide()) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.setPierceLevel(piercing);
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
														_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
														_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
												}
												CraftnoyaibaMod.queueServerWork(10, () -> {
													{
														Entity _shootFrom = entity;
														Level projectileLevel = _shootFrom.level();
														if (!projectileLevel.isClientSide()) {
															Projectile _entityToSpawn = new Object() {
																public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																	AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
																	entityToSpawn.setOwner(shooter);
																	entityToSpawn.setBaseDamage(damage);
																	entityToSpawn.setKnockback(knockback);
																	entityToSpawn.setSilent(true);
																	entityToSpawn.setPierceLevel(piercing);
																	return entityToSpawn;
																}
															}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
															_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
															_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
															projectileLevel.addFreshEntity(_entityToSpawn);
														}
													}
													CraftnoyaibaMod.queueServerWork(10, () -> {
														{
															Entity _shootFrom = entity;
															Level projectileLevel = _shootFrom.level();
															if (!projectileLevel.isClientSide()) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																		AbstractArrow entityToSpawn = new TCAFProjectileEntity(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.setPierceLevel(piercing);
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
																_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
																_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
														}
													});
												});
											});
										});
									});
								});
							});
							{
								String _setval = "";
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveMove = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
								.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form4)) {
							{
								double _setval = 60;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTimer = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form4LimbTarget;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTarget = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 200;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Cooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 80, 0));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7l\u00A76" + "Thunder Breathing, First Form: Thunderclap and Flash | Godspeed")), true);
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new GodspeedTCAFEntity(CraftnoyaibaModEntities.GODSPEED_TCAF.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 0, 0, (byte) 6);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
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
						if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
								.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form5)) {
							{
								double _setval = 20;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTimer = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form5LimbTarget;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTarget = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 250;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Cooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 40, 0));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, (float) 1.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, (float) 1.5, false);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftnoyaiba:breathingbegun")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftnoyaiba:breathingbegun")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7l\u00A76" + "Thunder Breathing, Seventh Form: Flaming Thunder God")), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/particle minecraft:flash ~ ~1 ~ 0.1 0.1 0.1 0 1");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 7, 0.1, 0.1, 0.1, 0);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CraftnoyaibaModEntities.FLAMING_THUNDER_GOD.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
							if (!world.getEntitiesOfClass(FlamingThunderGodEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
								if (((Entity) world.getEntitiesOfClass(FlamingThunderGodEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.FLAMING_THUNDER_GOD_ACTIVE.get(), 18, 0, false, false));
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
			} else if (!((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Breathing).equals("Thunder")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("dont have"), false);
			}
		}
	}
}
