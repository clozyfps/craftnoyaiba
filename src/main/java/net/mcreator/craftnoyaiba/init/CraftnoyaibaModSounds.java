
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
	public static final RegistryObject<SoundEvent> BIWA = REGISTRY.register("biwa", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "biwa")));
	public static final RegistryObject<SoundEvent> INFINITYCASTLESUMMON = REGISTRY.register("infinitycastlesummon", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "infinitycastlesummon")));
	public static final RegistryObject<SoundEvent> UPPERMOONMEETING = REGISTRY.register("uppermoonmeeting", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "uppermoonmeeting")));
	public static final RegistryObject<SoundEvent> LIMBCUT = REGISTRY.register("limbcut", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "limbcut")));
	public static final RegistryObject<SoundEvent> SWORDBLOCK = REGISTRY.register("swordblock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "swordblock")));
	public static final RegistryObject<SoundEvent> WOODENBLOCK = REGISTRY.register("woodenblock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "woodenblock")));
	public static final RegistryObject<SoundEvent> LEVEL = REGISTRY.register("level", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "level")));
	public static final RegistryObject<SoundEvent> WATERBREATHING = REGISTRY.register("waterbreathing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craftnoyaiba", "waterbreathing")));
}
