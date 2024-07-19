package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftnoyaiba.entity.ZenitsuAgatsumaEntity;

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
