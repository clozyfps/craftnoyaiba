package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class RandomBreathingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("breathingrandom", (Mth.nextInt(RandomSource.create(), 1, 1)));
		if (entity.getPersistentData().getDouble("breathingrandom") == 1) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("You are born with a " + "\u00A7l\u00A76Thunder Breathing" + " \u00A7rAffinity.")), true);
			{
				String _setval = "Thunder";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.BreathingAffinity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
