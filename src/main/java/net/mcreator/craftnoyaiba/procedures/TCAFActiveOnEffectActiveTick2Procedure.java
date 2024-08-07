package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.network.NetworkDirection;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftnoyaiba.entity.ZenitsuAgatsumaEntity;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import java.util.List;
import java.util.Iterator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

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
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
					synchronized (connections) {
						Iterator<Connection> iterator = connections.iterator();
						while (iterator.hasNext()) {
							Connection connection = iterator.next();
							if (!connection.isConnecting() && connection.isConnected())
								CraftnoyaibaMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.CraftnoyaibaModAnimationMessage(Component.literal("thunderclapandflashactive"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
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
