package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnoyaiba.init.CraftnoyaibaModBlocks;

public class FinalSelectionDemonEntityDiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(entity.getPersistentData().getDouble("xfspos"), entity.getPersistentData().getDouble("yfspos"), entity.getPersistentData().getDouble("zfspos")),
				CraftnoyaibaModBlocks.DEMON_SPAWN_POINT.get().defaultBlockState(), 3);
	}
}
