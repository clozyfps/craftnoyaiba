package net.mcreator.craftnoyaiba.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModItems;

import java.util.HashMap;

public class TakeBloodButtonProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		ItemStack demonpower = ItemStack.EMPTY;
		if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).DemonPower >= new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(guistate.containsKey("text:BloodAmount") ? ((EditBox) guistate.get("text:BloodAmount")).getValue() : "")) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				double _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).DemonPower - new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:BloodAmount") ? ((EditBox) guistate.get("text:BloodAmount")).getValue() : "");
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DemonPower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			demonpower = new ItemStack(CraftnoyaibaModItems.BLOOD.get());
			demonpower.getOrCreateTag().putDouble("bloodamount", new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:BloodAmount") ? ((EditBox) guistate.get("text:BloodAmount")).getValue() : ""));
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = demonpower.copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
