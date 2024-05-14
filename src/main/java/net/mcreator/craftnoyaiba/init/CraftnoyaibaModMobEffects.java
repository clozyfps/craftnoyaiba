
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftnoyaiba.potion.TCAFActiveMobEffect;
import net.mcreator.craftnoyaiba.potion.StunnedMobEffect;
import net.mcreator.craftnoyaiba.potion.RegenStunMobEffect;
import net.mcreator.craftnoyaiba.potion.ElectrifiedMobEffect;
import net.mcreator.craftnoyaiba.potion.DecayingMobEffect;
import net.mcreator.craftnoyaiba.potion.CooldownMobEffect;
import net.mcreator.craftnoyaiba.potion.AwakenBreathMobEffect;
import net.mcreator.craftnoyaiba.potion.AsleepMobEffect;
import net.mcreator.craftnoyaiba.potion.AirComboMobEffect;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class CraftnoyaibaModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftnoyaibaMod.MODID);
	public static final RegistryObject<MobEffect> STUNNED = REGISTRY.register("stunned", () -> new StunnedMobEffect());
	public static final RegistryObject<MobEffect> AIR_COMBO = REGISTRY.register("air_combo", () -> new AirComboMobEffect());
	public static final RegistryObject<MobEffect> AWAKEN_BREATH = REGISTRY.register("awaken_breath", () -> new AwakenBreathMobEffect());
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> TCAF_ACTIVE = REGISTRY.register("tcaf_active", () -> new TCAFActiveMobEffect());
	public static final RegistryObject<MobEffect> ELECTRIFIED = REGISTRY.register("electrified", () -> new ElectrifiedMobEffect());
	public static final RegistryObject<MobEffect> ASLEEP = REGISTRY.register("asleep", () -> new AsleepMobEffect());
	public static final RegistryObject<MobEffect> DECAYING = REGISTRY.register("decaying", () -> new DecayingMobEffect());
	public static final RegistryObject<MobEffect> REGEN_STUN = REGISTRY.register("regen_stun", () -> new RegenStunMobEffect());
}
