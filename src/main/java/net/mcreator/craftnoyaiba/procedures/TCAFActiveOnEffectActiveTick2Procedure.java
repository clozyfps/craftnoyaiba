package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TCAFActiveOnEffectActiveTick2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "thunderclapandflashactive"))));
					}
				}
			}
		} else {
			if (entity instanceof ZenitsuAgatsumaEntity) {
				((ZenitsuAgatsumaEntity) entity).setAnimation("thunderclapandflashactive");
			}
		}
		if (world instanceof ServerLevel _level) {
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"execute as " + entity.getStringUUID() + " at " + entity.getStringUUID() + " anchored feet run particle " + "CUSTOM:YellowElectricity".replaceAll("(?i)CUSTOM:", "craftnoyaiba:").toLowerCase() + " ~ ~1 ~ 0 0 0 0.00001 10");
		}
	}
}
