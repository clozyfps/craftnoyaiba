package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MobSwordSwingProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craftnoyaiba:swordmobs")))) {
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				if (sourceentity instanceof ZenitsuAgatsumaEntity) {
					((ZenitsuAgatsumaEntity) sourceentity).setAnimation("basicattackone");
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
				if (sourceentity instanceof ZenitsuAgatsumaEntity) {
					((ZenitsuAgatsumaEntity) sourceentity).setAnimation("basicattacktwo");
				}
			}
		}
	}
}
