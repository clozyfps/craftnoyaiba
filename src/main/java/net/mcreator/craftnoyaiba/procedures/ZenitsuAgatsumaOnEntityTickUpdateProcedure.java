package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnoyaiba.init.CraftnoyaibaModMobEffects;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModEntities;
import net.mcreator.craftnoyaiba.entity.TCAFProjectileEntity;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import java.util.List;
import java.util.Comparator;

public class ZenitsuAgatsumaOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (!(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CraftnoyaibaModMobEffects.COOLDOWN.get()))) {
				if (Mth.nextInt(RandomSource.create(), 1, 80) == 2) {
					TCAFActiveEffectStartedappliedProcedure.execute(world, entity);
					CraftnoyaibaMod.queueServerWork(10, () -> {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.TCAF_ACTIVE.get(), 30, 0));
					});
					entity.getPersistentData().putDouble("activelimbtimer", 35);
					entity.getPersistentData().putString("activelimbtarget", "Head");
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 35, 0));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7l\u00A76Zenitsu: " + "Thunder Breathing, First Form: Thunderclap and Flash.")), false);
						}
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
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.COOLDOWN.get(), 30, 0, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 80) == 3) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.COOLDOWN.get(), 1, 0, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 80) == 10) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.COOLDOWN.get(), 1, 0, false, false));
				} else if (Mth.nextInt(RandomSource.create(), 1, 80) >= 70) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.COOLDOWN.get(), 1, 0, false, false));
				}
			}
		}
	}
}
