
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.craftnoyaiba.block.WisteriaBlock;
import net.mcreator.craftnoyaiba.block.MuzanSpawnPointBlock;
import net.mcreator.craftnoyaiba.block.DemonSpawnPointBlock;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class CraftnoyaibaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftnoyaibaMod.MODID);
	public static final RegistryObject<Block> WISTERIA = REGISTRY.register("wisteria", () -> new WisteriaBlock());
	public static final RegistryObject<Block> DEMON_SPAWN_POINT = REGISTRY.register("demon_spawn_point", () -> new DemonSpawnPointBlock());
	public static final RegistryObject<Block> MUZAN_SPAWN_POINT = REGISTRY.register("muzan_spawn_point", () -> new MuzanSpawnPointBlock());
}
