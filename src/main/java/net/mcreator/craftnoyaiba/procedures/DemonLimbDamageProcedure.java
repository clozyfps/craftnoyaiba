package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModMobEffects;
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
public class DemonLimbDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, x, y, z, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Race).equals("Demon")) {
			if (((sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveLimbTarget).equals("Right Arm")
					|| (sourceentity.getPersistentData().getString("activelimbtarget")).equals("Right Arm")) {
				if (!(entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostRightArm) {
					{
						double _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).RightArmHealth - amount;
						entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RightArmHealth = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).RightArmHealth <= 0) {
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
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Cut Right Arm Off"), false);
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Right Arm Cut Off"), false);
						world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.RED_TERRACOTTA.defaultBlockState()));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.REGEN_STUN.get(),
									(int) (80 - (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 3), 0, false, false));
						{
							boolean _setval = true;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.LostRightArm = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if (((sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveLimbTarget).equals("Left Arm")
					|| (sourceentity.getPersistentData().getString("activelimbtarget")).equals("Left Arm")) {
				if (!(entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostLeftArm) {
					{
						double _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LeftArmHealth - amount;
						entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.LeftArmHealth = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LeftArmHealth <= 0) {
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
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.REGEN_STUN.get(),
									(int) (80 - (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 3), 0, false, false));
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Cut Left Arm Off"), false);
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Left Arm Cut Off"), false);
						world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.RED_TERRACOTTA.defaultBlockState()));
						{
							boolean _setval = true;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.LostLeftArm = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if (((sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveLimbTarget).equals("Right Leg")
					|| (sourceentity.getPersistentData().getString("activelimbtarget")).equals("Right Leg")) {
				if (!(entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostRightLeg) {
					{
						double _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).RightLegHealth - amount;
						entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RightLegHealth = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).RightLegHealth <= 0) {
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
						world.levelEvent(2001, BlockPos.containing(x, y - 0.5, z), Block.getId(Blocks.RED_TERRACOTTA.defaultBlockState()));
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Cut Right Leg Off"), false);
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Right Leg Cut Off"), false);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.REGEN_STUN.get(),
									(int) (80 - (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 3), 0, false, false));
						{
							boolean _setval = true;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.LostRightLeg = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if (((sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveLimbTarget).equals("Left Leg")
					|| (sourceentity.getPersistentData().getString("activelimbtarget")).equals("Left Leg")) {
				if (!(entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostLeftLeg) {
					{
						double _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LeftLegHealth - amount;
						entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.LeftLegHealth = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LeftLegHealth <= 0) {
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
						world.levelEvent(2001, BlockPos.containing(x, y - 0.5, z), Block.getId(Blocks.RED_TERRACOTTA.defaultBlockState()));
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Cut Left Leg Off"), false);
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Left Leg Cut Off"), false);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.REGEN_STUN.get(),
									(int) (80 - (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 3), 0, false, false));
						{
							boolean _setval = true;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.LostLeftLeg = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if (((sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveLimbTarget).equals("Head")
					|| (sourceentity.getPersistentData().getString("activelimbtarget")).equals("Head")) {
				if (!(entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).LostHead) {
					{
						double _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).HeadHealth - amount / 3;
						entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.HeadHealth = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).HeadHealth <= 0) {
						world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(Blocks.RED_TERRACOTTA.defaultBlockState()));
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
						{
							boolean _setval = true;
							entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.LostHead = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (!(entity instanceof ServerPlayer _plr27 && _plr27.level() instanceof ServerLevel
								&& _plr27.getAdvancements().getOrStartProgress(_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("craftnoyaiba:head_regeneration"))).isDone())) {
							if (event != null && event.isCancelable()) {
								event.setCanceled(true);
							}
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK), sourceentity), (float) 0.1);
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(0);
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK), sourceentity), (float) 0.1);
						} else {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.REGEN_STUN.get(),
										(int) (80 - (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood / 3), 0, false, false));
						}
					}
				}
			}
		}
	}
}
