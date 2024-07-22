
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftnoyaiba.potion.TeslaActiveMobEffect;
import net.mcreator.craftnoyaiba.potion.TcafendMobEffect;
import net.mcreator.craftnoyaiba.potion.TCAFActiveMobEffect;
import net.mcreator.craftnoyaiba.potion.StunnedMobEffect;
import net.mcreator.craftnoyaiba.potion.StringPerformanceMoveMobEffect;
import net.mcreator.craftnoyaiba.potion.RegenerationTimerMobEffect;
import net.mcreator.craftnoyaiba.potion.RegenStunMobEffect;
import net.mcreator.craftnoyaiba.potion.PreSixFoldMobEffect;
import net.mcreator.craftnoyaiba.potion.OutwardsPoofMobEffect;
import net.mcreator.craftnoyaiba.potion.NewGodspeedMobEffect;
import net.mcreator.craftnoyaiba.potion.ImpactFrameMobEffect;
import net.mcreator.craftnoyaiba.potion.HeadRegenerationTimerMobEffect;
import net.mcreator.craftnoyaiba.potion.GroundSlamMobEffect;
import net.mcreator.craftnoyaiba.potion.FlamingThunderGodActiveMobEffect;
import net.mcreator.craftnoyaiba.potion.ElectrifiedMobEffect;
import net.mcreator.craftnoyaiba.potion.DecayingMobEffect;
import net.mcreator.craftnoyaiba.potion.CooldownMobEffect;
import net.mcreator.craftnoyaiba.potion.ConstantResoundingSlashesMobEffect;
import net.mcreator.craftnoyaiba.potion.AwakenBreathMobEffect;
import net.mcreator.craftnoyaiba.potion.AsleepMobEffect;
import net.mcreator.craftnoyaiba.potion.AirComboMobEffect;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class CraftnoyaibaModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftnoyaibaMod.MODID);
	public static final RegistryObject<MobEffect> AIR_COMBO = REGISTRY.register("air_combo", () -> new AirComboMobEffect());
	public static final RegistryObject<MobEffect> STUNNED = REGISTRY.register("stunned", () -> new StunnedMobEffect());
	public static final RegistryObject<MobEffect> AWAKEN_BREATH = REGISTRY.register("awaken_breath", () -> new AwakenBreathMobEffect());
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> TCAF_ACTIVE = REGISTRY.register("tcaf_active", () -> new TCAFActiveMobEffect());
	public static final RegistryObject<MobEffect> ELECTRIFIED = REGISTRY.register("electrified", () -> new ElectrifiedMobEffect());
	public static final RegistryObject<MobEffect> ASLEEP = REGISTRY.register("asleep", () -> new AsleepMobEffect());
	public static final RegistryObject<MobEffect> DECAYING = REGISTRY.register("decaying", () -> new DecayingMobEffect());
	public static final RegistryObject<MobEffect> REGEN_STUN = REGISTRY.register("regen_stun", () -> new RegenStunMobEffect());
	public static final RegistryObject<MobEffect> TESLA_ACTIVE = REGISTRY.register("tesla_active", () -> new TeslaActiveMobEffect());
	public static final RegistryObject<MobEffect> GROUND_SLAM = REGISTRY.register("ground_slam", () -> new GroundSlamMobEffect());
	public static final RegistryObject<MobEffect> HEAD_REGENERATION_TIMER = REGISTRY.register("head_regeneration_timer", () -> new HeadRegenerationTimerMobEffect());
	public static final RegistryObject<MobEffect> REGENERATION_TIMER = REGISTRY.register("regeneration_timer", () -> new RegenerationTimerMobEffect());
	public static final RegistryObject<MobEffect> IMPACT_FRAME = REGISTRY.register("impact_frame", () -> new ImpactFrameMobEffect());
	public static final RegistryObject<MobEffect> PRE_SIX_FOLD = REGISTRY.register("pre_six_fold", () -> new PreSixFoldMobEffect());
	public static final RegistryObject<MobEffect> FLAMING_THUNDER_GOD_ACTIVE = REGISTRY.register("flaming_thunder_god_active", () -> new FlamingThunderGodActiveMobEffect());
	public static final RegistryObject<MobEffect> OUTWARDS_POOF = REGISTRY.register("outwards_poof", () -> new OutwardsPoofMobEffect());
	public static final RegistryObject<MobEffect> CONSTANT_RESOUNDING_SLASHES = REGISTRY.register("constant_resounding_slashes", () -> new ConstantResoundingSlashesMobEffect());
	public static final RegistryObject<MobEffect> STRING_PERFORMANCE_MOVE = REGISTRY.register("string_performance_move", () -> new StringPerformanceMoveMobEffect());
	public static final RegistryObject<MobEffect> TCAFEND = REGISTRY.register("tcafend", () -> new TcafendMobEffect());
	public static final RegistryObject<MobEffect> NEW_GODSPEED = REGISTRY.register("new_godspeed", () -> new NewGodspeedMobEffect());
}
