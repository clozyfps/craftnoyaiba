package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

public class FinalSelectionDemonDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("demontype") == 1) {
			return true;
		}
		return false;
	}
}
