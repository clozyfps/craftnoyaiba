package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Iterator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

@Mod.EventBusSubscriber
public class DemonLimbTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).RightLegHealth <= 0
				&& (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostRightLeg) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "rightleggone"))));
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
								CraftnoyaibaMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.CraftnoyaibaModAnimationMessage(Component.literal("rightleggone"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
		} else if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LeftLegHealth <= 0
				&& (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostLeftLeg) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "leftleggone"))));
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
								CraftnoyaibaMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.CraftnoyaibaModAnimationMessage(Component.literal("leftleggone"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
		} else if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).RightArmHealth <= 0
				&& (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostRightArm) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "rightarmgone"))));
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
								CraftnoyaibaMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.CraftnoyaibaModAnimationMessage(Component.literal("rightarmgone"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
		} else if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LeftArmHealth <= 0
				&& (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostLeftArm) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "leftarmgone"))));
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
								CraftnoyaibaMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.CraftnoyaibaModAnimationMessage(Component.literal("leftarmgone"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
		} else if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).HeadHealth <= 0
				&& (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostHead) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "headgone"))));
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
								CraftnoyaibaMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.CraftnoyaibaModAnimationMessage(Component.literal("headgone"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
		}
	}
}
