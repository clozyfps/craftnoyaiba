
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class CraftnoyaibaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CraftnoyaibaMod.MODID);
	public static final RegistryObject<SoundEvent> CLASH = REGISTRY.register("clash", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "clash")));
	public static final RegistryObject<SoundEvent> HEARTBEAT = REGISTRY.register("heartbeat", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "heartbeat")));
	public static final RegistryObject<SoundEvent> BREATHINGBEGUN = REGISTRY.register("breathingbegun", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "breathingbegun")));
	public static final RegistryObject<SoundEvent> SHOCK = REGISTRY.register("shock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "shock")));
	public static final RegistryObject<SoundEvent> STAB = REGISTRY.register("stab", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "stab")));
}
