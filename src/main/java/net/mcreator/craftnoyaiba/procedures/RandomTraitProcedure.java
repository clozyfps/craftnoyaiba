package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class RandomTraitProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double randomtrait = 0;
		randomtrait = Mth.nextInt(RandomSource.create(), 1, 9);
		if (randomtrait == 1) {
			{
				String _setval = "Your trait is " + "\u00A7lEnhanced Smell";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Trait = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (randomtrait == 2) {
			{
				String _setval = "Your trait is " + "\u00A7lHard Head";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Trait = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (randomtrait == 3) {
			{
				String _setval = "Your trait is " + "\u00A7lSleepy Head";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Trait = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (randomtrait == 4) {
			{
				String _setval = "Your trait is " + "\u00A7lGifted Physical Prowess";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Trait = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 10;
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StrengthStat = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (randomtrait == 5) {
			{
				String _setval = "Your trait is " + "\u00A7lMarechi Blood";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Trait = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (randomtrait == 6) {
			{
				String _setval = "Your trait is " + "\u00A7lFlashiness";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Trait = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (randomtrait == 7) {
			{
				String _setval = "Your trait is " + "\u00A7lShinobi";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Trait = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (randomtrait == 8) {
			{
				String _setval = "Your trait is " + "\u00A7lGluton";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Trait = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (randomtrait == 9) {
			{
				String _setval = "Your trait is " + "\u00A7lProdigy";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Trait = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
