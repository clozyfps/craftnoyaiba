
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftnoyaibaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraftnoyaibaMod.MODID);
	public static final RegistryObject<CreativeModeTab> YAIBA_TRAINERS = REGISTRY.register("yaiba_trainers",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craftnoyaiba.yaiba_trainers")).icon(() -> new ItemStack(CraftnoyaibaModItems.JIGORO_KUWAJIMA_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftnoyaibaModItems.JIGORO_KUWAJIMA_SPAWN_EGG.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> YAIBA_NICHIRINS = REGISTRY.register("yaiba_nichirins",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craftnoyaiba.yaiba_nichirins")).icon(() -> new ItemStack(CraftnoyaibaModItems.BASIC_NICHIRIN_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftnoyaibaModItems.BASIC_NICHIRIN_SWORD.get());
				tabData.accept(CraftnoyaibaModItems.THUNDER_NICHIRIN_SWORD.get());
				tabData.accept(CraftnoyaibaModItems.WATER_NICHIRIN_SWORD.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> YAIBA_HUMANS = REGISTRY.register("yaiba_humans",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craftnoyaiba.yaiba_humans")).icon(() -> new ItemStack(CraftnoyaibaModItems.KAIGAKU_HUMAN_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftnoyaibaModItems.KAIGAKU_HUMAN_SPAWN_EGG.get());
				tabData.accept(CraftnoyaibaModItems.KIRIYA_UBUYASHIKI_SPAWN_EGG.get());
				tabData.accept(CraftnoyaibaModItems.KANATA_UBUYASHIKI_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CraftnoyaibaModItems.DEMON_SLAYER_UNIFORM_CHESTPLATE.get());
			tabData.accept(CraftnoyaibaModItems.DEMON_SLAYER_UNIFORM_LEGGINGS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CraftnoyaibaModItems.GOURD.get());
			tabData.accept(CraftnoyaibaModItems.BLADE.get());
		}
	}
}
