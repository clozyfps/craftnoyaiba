
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftnoyaibaModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> CNY_AUTO_PARRY = GameRules.register("cnyAutoParry", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> ASSIGNED_RANKS = GameRules.register("assignedRanks", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
