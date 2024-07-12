
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.craftnoyaiba.block.WisteriaBlock;
import net.mcreator.craftnoyaiba.block.Tatami2Block;
import net.mcreator.craftnoyaiba.block.Tatami1Block;
import net.mcreator.craftnoyaiba.block.PillarMiddleBlock;
import net.mcreator.craftnoyaiba.block.PillarBlockTopBlock;
import net.mcreator.craftnoyaiba.block.PillarBlockBottomBlock;
import net.mcreator.craftnoyaiba.block.MuzanSpawnPointBlock;
import net.mcreator.craftnoyaiba.block.DemonSpawnPointBlock;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class CraftnoyaibaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftnoyaibaMod.MODID);
	public static final RegistryObject<Block> WISTERIA = REGISTRY.register("wisteria", () -> new WisteriaBlock());
	public static final RegistryObject<Block> DEMON_SPAWN_POINT = REGISTRY.register("demon_spawn_point", () -> new DemonSpawnPointBlock());
	public static final RegistryObject<Block> MUZAN_SPAWN_POINT = REGISTRY.register("muzan_spawn_point", () -> new MuzanSpawnPointBlock());
	public static final RegistryObject<Block> PILLAR_MIDDLE = REGISTRY.register("pillar_middle", () -> new PillarMiddleBlock());
	public static final RegistryObject<Block> PILLAR_BLOCK_BOTTOM = REGISTRY.register("pillar_block_bottom", () -> new PillarBlockBottomBlock());
	public static final RegistryObject<Block> PILLAR_BLOCK_TOP = REGISTRY.register("pillar_block_top", () -> new PillarBlockTopBlock());
	public static final RegistryObject<Block> TATAMI_1 = REGISTRY.register("tatami_1", () -> new Tatami1Block());
	public static final RegistryObject<Block> TATAMI_2 = REGISTRY.register("tatami_2", () -> new Tatami2Block());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
