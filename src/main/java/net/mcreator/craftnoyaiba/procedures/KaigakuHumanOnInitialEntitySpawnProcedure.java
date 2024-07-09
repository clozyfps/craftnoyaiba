package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

public class KaigakuHumanOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("activelimbtarget", "Right Arm");
	}
}
