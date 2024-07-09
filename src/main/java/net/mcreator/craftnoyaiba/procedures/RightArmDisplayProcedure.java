package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class RightArmDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Right Arm: " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).RightArmHealth) + "/"
				+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).RightArmHealthMax);
	}
}
