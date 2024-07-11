package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

import java.util.List;
import java.util.Comparator;

public class ConstantResoundingSlashesOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("fireworkx", (Mth.nextInt(RandomSource.create(), -5, 5)));
		entity.getPersistentData().putDouble("fireworkz", (Mth.nextInt(RandomSource.create(), -5, 5)));
		entity.getPersistentData().putDouble("fireworky", (Mth.nextInt(RandomSource.create(), 1, 3)));
		entity.getPersistentData().putDouble("fireworkstartcolorint", (Mth.nextInt(RandomSource.create(), 1, 5)));
		entity.getPersistentData().putDouble("fireworkfadecolorint", (Mth.nextInt(RandomSource.create(), 1, 3)));
		if (entity.getPersistentData().getDouble("fireworkstartcolorint") == 1) {
			entity.getPersistentData().putDouble("fireworkstartcolor", 6719955);
		} else if (entity.getPersistentData().getDouble("fireworkstartcolorint") == 2) {
			entity.getPersistentData().putDouble("fireworkstartcolor", 11743532);
		} else if (entity.getPersistentData().getDouble("fireworkstartcolorint") == 3) {
			entity.getPersistentData().putDouble("fireworkstartcolor", 15435844);
		} else if (entity.getPersistentData().getDouble("fireworkstartcolorint") == 4) {
			entity.getPersistentData().putDouble("fireworkstartcolor", 8073150);
		} else if (entity.getPersistentData().getDouble("fireworkstartcolorint") == 5) {
			entity.getPersistentData().putDouble("fireworkstartcolor", 15790320);
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craftnoyaiba:breathing_damage"))), entity),
							(float) (6 + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Kendo / 4
									+ (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).DamageModifier));
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLASH, x, y, z, 5, 5, 5, 5, 0.2);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 3, 5, 5, 5, 0.2);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, y, z, 3, 5, 5, 5, 0);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("/summon firework_rocket ~" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworkx")) + " ~" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworky")) + " ~"
							+ new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworkz"))
							+ " {LifeTime:3,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:1,Explosions:[{Type:4,Flicker:0,Trail:0,Colors:[I;"
							+ new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworkstartcolor")) + "],FadeColors:[I;"
							+ new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworkstartcolor")) + "]}]}}}}"));
		entity.getPersistentData().putString("examplecommand",
				("/summon firework_rocket ~" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworkx")) + " ~" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworky")) + " ~"
						+ new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworkz")) + " {LifeTime:3,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:1,Explosions:[{Type:4,Flicker:0,Trail:0,Colors:["
						+ new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworkstartcolor")) + "],FadeColors:[" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("fireworkstartcolor"))
						+ "]}]}}}}"));
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 5, 0, false, false));
	}
}
