package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class RockWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 1, 0.01, 0.01, 0.01, 0);
	}
}
