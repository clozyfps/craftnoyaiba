package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class CheckX4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).AbilityFour).isEmpty()) {
			return true;
		}
		return false;
	}
}
