package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class RandomClanProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double randomclan = 0;
		randomclan = Mth.nextInt(RandomSource.create(), 1, 7);
		if (randomclan == 1) {
			{
				String _setval = "Kamado";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Clan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("You are born into the" + "\u00A7lKamado" + " \u00A7rclan.")), true);
		} else if (randomclan == 2) {
			{
				String _setval = "Tomioka";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Clan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("You are born into the" + "\u00A7lTomioka" + " \u00A7rclan.")), true);
		} else if (randomclan == 3) {
			{
				String _setval = "Rengoku";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Clan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("You are born into the" + "\u00A7lRengoku" + " \u00A7rclan.")), true);
		} else if (randomclan == 4) {
			{
				String _setval = "Kanroji";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Clan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("You are born into the" + "\u00A7lKanroji" + " \u00A7rclan.")), true);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Kanroji Buff: Strength" + "\u00A7l(5)" + " \u00A7rJump Boost" + "\u00A7l(1)")), false);
			{
				double _setval = 5;
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StrengthStat = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 600;
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StrengthMastery = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (randomclan == 5) {
			{
				String _setval = "Kocho";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Clan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("You are born into the" + "\u00A7lKocho" + " \u00A7rclan.")), true);
		} else if (randomclan == 6) {
			{
				String _setval = "Uzui";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Clan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("You are born into the" + "\u00A7lUzui" + " \u00A7rclan.")), true);
		} else if (randomclan == 7) {
			{
				String _setval = "Agatsuma";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Clan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("You are born into the" + "\u00A7lAgatsuma" + " \u00A7rclan.")), true);
		}
	}
}
