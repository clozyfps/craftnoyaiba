package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class Skill7TooltipProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u2726 Targets " + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form7 + " \u2726";
	}
}
