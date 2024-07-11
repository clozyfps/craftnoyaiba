package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class BloodItemInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("bloodamount") > 0) {
			itemstack.setHoverName(Component.literal(("Demon Blood [\u00A74" + new java.text.DecimalFormat("#").format(itemstack.getOrCreateTag().getDouble("bloodamount")) + " Power\u00A7r]")));
		} else if (itemstack.getOrCreateTag().getDouble("bloodamount") <= 0) {
			itemstack.setHoverName(Component.literal("Demon Blood"));
		}
	}
}
