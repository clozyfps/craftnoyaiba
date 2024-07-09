package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.entity.FlameFirstFormEntity;

public class FlameFirstFormOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("formtextureincrease", (entity.getPersistentData().getDouble("formtextureincrease") + 1));
		if (entity.getPersistentData().getDouble("formtextureincrease") < 1.25) {
			if (entity instanceof FlameFirstFormEntity animatable)
				animatable.setTexture("form1first");
		} else if (entity.getPersistentData().getDouble("formtextureincrease") >= 1.25 && entity.getPersistentData().getDouble("formtextureincrease") < 2.5) {
			if (entity instanceof FlameFirstFormEntity animatable)
				animatable.setTexture("form1second");
		} else if (entity.getPersistentData().getDouble("formtextureincrease") >= 2.5 && entity.getPersistentData().getDouble("formtextureincrease") < 3.75) {
			if (entity instanceof FlameFirstFormEntity animatable)
				animatable.setTexture("form1third");
		} else if (entity.getPersistentData().getDouble("formtextureincrease") < 3.75 && entity.getPersistentData().getDouble("formtextureincrease") >= 5) {
			if (entity instanceof FlameFirstFormEntity animatable)
				animatable.setTexture("form1fourth");
		}
	}
}
