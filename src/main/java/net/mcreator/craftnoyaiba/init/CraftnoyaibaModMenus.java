
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftnoyaiba.world.inventory.TakeBloodMenu;
import net.mcreator.craftnoyaiba.world.inventory.MenuMenu;
import net.mcreator.craftnoyaiba.world.inventory.CreateAbilityMenu;
import net.mcreator.craftnoyaiba.world.inventory.AbilitySelectionMenu;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class CraftnoyaibaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftnoyaibaMod.MODID);
	public static final RegistryObject<MenuType<CreateAbilityMenu>> CREATE_ABILITY = REGISTRY.register("create_ability", () -> IForgeMenuType.create(CreateAbilityMenu::new));
	public static final RegistryObject<MenuType<MenuMenu>> MENU = REGISTRY.register("menu", () -> IForgeMenuType.create(MenuMenu::new));
	public static final RegistryObject<MenuType<AbilitySelectionMenu>> ABILITY_SELECTION = REGISTRY.register("ability_selection", () -> IForgeMenuType.create(AbilitySelectionMenu::new));
	public static final RegistryObject<MenuType<TakeBloodMenu>> TAKE_BLOOD = REGISTRY.register("take_blood", () -> IForgeMenuType.create(TakeBloodMenu::new));
}
