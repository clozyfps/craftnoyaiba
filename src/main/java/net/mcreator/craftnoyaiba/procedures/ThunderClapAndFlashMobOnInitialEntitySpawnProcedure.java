package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class ThunderClapAndFlashMobOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftnoyaibaMod.queueServerWork(15, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
