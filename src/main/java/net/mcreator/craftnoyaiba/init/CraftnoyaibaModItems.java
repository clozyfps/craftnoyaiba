
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.craftnoyaiba.item.TrainingSwordItem;
import net.mcreator.craftnoyaiba.item.ThunderNichirinSwordItem;
import net.mcreator.craftnoyaiba.item.TestItem;
import net.mcreator.craftnoyaiba.item.SpecialThunderNichirinItem;
import net.mcreator.craftnoyaiba.item.SoundNichirinSwordItem;
import net.mcreator.craftnoyaiba.item.RifleItem;
import net.mcreator.craftnoyaiba.item.PistolItem;
import net.mcreator.craftnoyaiba.item.KhakkharaItem;
import net.mcreator.craftnoyaiba.item.GourdItem;
import net.mcreator.craftnoyaiba.item.DemonSlayerUniformItem;
import net.mcreator.craftnoyaiba.item.BloodItem;
import net.mcreator.craftnoyaiba.item.BladeItem;
import net.mcreator.craftnoyaiba.item.BasicNichirinSwordItem;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class CraftnoyaibaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftnoyaibaMod.MODID);
	public static final RegistryObject<Item> BASIC_NICHIRIN_SWORD = REGISTRY.register("basic_nichirin_sword", () -> new BasicNichirinSwordItem());
	public static final RegistryObject<Item> JIGORO_KUWAJIMA_SPAWN_EGG = REGISTRY.register("jigoro_kuwajima_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.JIGORO_KUWAJIMA, -2171275, -1, new Item.Properties()));
	public static final RegistryObject<Item> GOURD = REGISTRY.register("gourd", () -> new GourdItem());
	public static final RegistryObject<Item> KAIGAKU_HUMAN_SPAWN_EGG = REGISTRY.register("kaigaku_human_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.KAIGAKU_HUMAN, -16777216, -8998192, new Item.Properties()));
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	public static final RegistryObject<Item> THUNDER_NICHIRIN_SWORD = REGISTRY.register("thunder_nichirin_sword", () -> new ThunderNichirinSwordItem());
	public static final RegistryObject<Item> BLOOD = REGISTRY.register("blood", () -> new BloodItem());
	public static final RegistryObject<Item> DEMON_SLAYER_UNIFORM_CHESTPLATE = REGISTRY.register("demon_slayer_uniform_chestplate", () -> new DemonSlayerUniformItem.Chestplate());
	public static final RegistryObject<Item> DEMON_SLAYER_UNIFORM_LEGGINGS = REGISTRY.register("demon_slayer_uniform_leggings", () -> new DemonSlayerUniformItem.Leggings());
	public static final RegistryObject<Item> BLADE = REGISTRY.register("blade", () -> new BladeItem());
	public static final RegistryObject<Item> WISTERIA = block(CraftnoyaibaModBlocks.WISTERIA);
	public static final RegistryObject<Item> DEMON_SPAWN_POINT = block(CraftnoyaibaModBlocks.DEMON_SPAWN_POINT);
	public static final RegistryObject<Item> FINAL_SELECTION_DEMON_SPAWN_EGG = REGISTRY.register("final_selection_demon_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.FINAL_SELECTION_DEMON, -2373462, -13948374, new Item.Properties()));
	public static final RegistryObject<Item> KIRIYA_UBUYASHIKI_SPAWN_EGG = REGISTRY.register("kiriya_ubuyashiki_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.KIRIYA_UBUYASHIKI, -8363899, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> KANATA_UBUYASHIKI_SPAWN_EGG = REGISTRY.register("kanata_ubuyashiki_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.KANATA_UBUYASHIKI, -8363899, -1, new Item.Properties()));
	public static final RegistryObject<Item> MUZAN_SPAWN_POINT = block(CraftnoyaibaModBlocks.MUZAN_SPAWN_POINT);
	public static final RegistryObject<Item> RIFLE = REGISTRY.register("rifle", () -> new RifleItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> KHAKKHARA = REGISTRY.register("khakkhara", () -> new KhakkharaItem());
	public static final RegistryObject<Item> TRAINING_SWORD = REGISTRY.register("training_sword", () -> new TrainingSwordItem());
	public static final RegistryObject<Item> SPECIAL_THUNDER_NICHIRIN = REGISTRY.register("special_thunder_nichirin", () -> new SpecialThunderNichirinItem());
	public static final RegistryObject<Item> FLAMING_THUNDER_GOD_SPAWN_EGG = REGISTRY.register("flaming_thunder_god_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.FLAMING_THUNDER_GOD, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SOUND_NICHIRIN_SWORD = REGISTRY.register("sound_nichirin_sword", () -> new SoundNichirinSwordItem());
	public static final RegistryObject<Item> PILLAR_BLOCK_TOP = block(CraftnoyaibaModBlocks.PILLAR_BLOCK_TOP);
	public static final RegistryObject<Item> PILLAR_BLOCK_BOTTOM = block(CraftnoyaibaModBlocks.PILLAR_BLOCK_BOTTOM);
	public static final RegistryObject<Item> PILLAR_MIDDLE = block(CraftnoyaibaModBlocks.PILLAR_MIDDLE);
	public static final RegistryObject<Item> TATAMI_1 = block(CraftnoyaibaModBlocks.TATAMI_1);
	public static final RegistryObject<Item> TATAMI_2 = block(CraftnoyaibaModBlocks.TATAMI_2);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
