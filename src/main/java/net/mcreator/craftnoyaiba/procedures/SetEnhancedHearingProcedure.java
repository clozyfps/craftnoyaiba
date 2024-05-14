package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class SetEnhancedHearingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double cooldown = 0;
		{
			String _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Trait + ", Enhanced Hearing";
			entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Trait = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
