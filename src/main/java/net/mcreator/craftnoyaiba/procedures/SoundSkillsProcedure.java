package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModMobEffects;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import javax.annotation.Nullable;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

@Mod.EventBusSubscriber
public class SoundSkillsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove).isEmpty()) {
			if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Breathing).equals("Sound")) {
				if (((entity instanceof LivingEntity _entity) ? _entity.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem
						|| (entity instanceof LivingEntity _entity ? _entity.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem) {
					if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CraftnoyaibaModMobEffects.COOLDOWN.get()))) {
						if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
								.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form1)) {
							{
								double _setval = 35;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTimer = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form1LimbTarget;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTarget = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 60;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Cooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world.isClientSide()) {
								if (entity instanceof AbstractClientPlayer player) {
									var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
									if (animation != null && !animation.isActive()) {
										animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "roar"))));
									}
								}
							}
							CraftnoyaibaMod.queueServerWork(15, () -> {
								RoarProcedure.execute(world, x, y, z, entity);
							});
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 20, 0));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7l\u00A76" + "Sound Breathing, First Form: Roar")), true);
							{
								String _setval = "";
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveMove = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
								.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form2)) {
							{
								double _setval = 85;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTimer = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form2LimbTarget;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTarget = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 160;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Cooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.CONSTANT_RESOUNDING_SLASHES.get(), 60, 0));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 80, 0));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world.isClientSide()) {
								if (entity instanceof AbstractClientPlayer player) {
									var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
									if (animation != null && !animation.isActive()) {
										animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "constantresoundingslashes"))));
									}
								}
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7l\u00A76" + "Sound Breathing, Second Form: Constant Resounding Slash")), true);
							{
								String _setval = "";
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveMove = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).ActiveMove)
								.equals((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form3)) {
							{
								double _setval = 70;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTimer = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Form3LimbTarget;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveLimbTarget = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 220;
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Cooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STRING_PERFORMANCE_MOVE.get(), 70, 0));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.CONSTANT_RESOUNDING_SLASHES.get(), 70, 0));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftnoyaibaModMobEffects.STUNNED.get(), 70, 0));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world.isClientSide()) {
								if (entity instanceof AbstractClientPlayer player) {
									var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
									if (animation != null && !animation.isActive()) {
										animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "stringperformance"))));
									}
								}
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7l\u00A76" + "Sound Breathing, Third Form: String Performance")), true);
							{
								String _setval = "";
								entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ActiveMove = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			}
		}
	}
}
