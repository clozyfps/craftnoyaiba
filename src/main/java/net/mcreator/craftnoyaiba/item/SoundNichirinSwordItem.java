
package net.mcreator.craftnoyaiba.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SoundNichirinSwordItem extends SwordItem {
	public SoundNichirinSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2f, new Item.Properties());
	}
}
