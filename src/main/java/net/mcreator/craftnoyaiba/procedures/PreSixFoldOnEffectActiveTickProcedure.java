package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnoyaiba.init.CraftnoyaibaModParticleTypes;

public class PreSixFoldOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("sixfoldx", (Mth.nextInt(RandomSource.create(), -4, 4)));
		entity.getPersistentData().putDouble("sixfoldz", (Mth.nextInt(RandomSource.create(), -4, 4)));
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
			entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + entity.getPersistentData().getDouble("sixfoldx"), y, z + entity.getPersistentData().getDouble("sixfoldz"))));
			entityToSpawn.setVisualOnly(true);
			_level.addFreshEntity(entityToSpawn);
		}
		entity.getPersistentData().putDouble("rockx", (Mth.nextInt(RandomSource.create(), -4, 4)));
		entity.getPersistentData().putDouble("rockz", (Mth.nextInt(RandomSource.create(), -4, 4)));
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftnoyaibaModParticleTypes.FLOATING_ROCK.get()), (x + entity.getPersistentData().getDouble("rockx")), y, (z + entity.getPersistentData().getDouble("rockz")), 10, 3, 3, 3, 0.2);
	}
}
