package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

public class FinalSelectionDemonDisplayCondition2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("demontype") == 2) {
			return true;
		}
		return false;
	}
}
