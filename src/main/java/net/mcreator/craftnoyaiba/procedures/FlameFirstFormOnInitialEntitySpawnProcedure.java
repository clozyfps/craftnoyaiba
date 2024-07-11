package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class FlameFirstFormOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().invulnerable = true;
			_player.onUpdateAbilities();
		}
		CraftnoyaibaMod.queueServerWork(5, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
