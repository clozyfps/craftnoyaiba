package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class MoveDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).MoveCurrent;
	}
}
