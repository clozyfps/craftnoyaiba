package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

public class BasicNichirinSwordEntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("swingtimer", 3);
	}
}
