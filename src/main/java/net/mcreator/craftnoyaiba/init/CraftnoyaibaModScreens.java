
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.craftnoyaiba.client.gui.TakeBloodScreen;
import net.mcreator.craftnoyaiba.client.gui.MenuScreen;
import net.mcreator.craftnoyaiba.client.gui.CreateAbilityScreen;
import net.mcreator.craftnoyaiba.client.gui.AbilitySelectionScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftnoyaibaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CraftnoyaibaModMenus.CREATE_ABILITY.get(), CreateAbilityScreen::new);
			MenuScreens.register(CraftnoyaibaModMenus.MENU.get(), MenuScreen::new);
			MenuScreens.register(CraftnoyaibaModMenus.ABILITY_SELECTION.get(), AbilitySelectionScreen::new);
			MenuScreens.register(CraftnoyaibaModMenus.TAKE_BLOOD.get(), TakeBloodScreen::new);
		});
	}
}
