
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class CraftnoyaibaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CraftnoyaibaMod.MODID);
	public static final RegistryObject<SimpleParticleType> CLASH_PARTICLE = REGISTRY.register("clash_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BLOOD_SPLASH = REGISTRY.register("blood_splash", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> ELECTRICITY = REGISTRY.register("electricity", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BLOOD_CRITICAL = REGISTRY.register("blood_critical", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> YELLOW_ELECTRICITY = REGISTRY.register("yellow_electricity", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BLUE_ELECTRICITY = REGISTRY.register("blue_electricity", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> FLOATING_ROCK = REGISTRY.register("floating_rock", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> STONE_PARTICLE_PRE = REGISTRY.register("stone_particle_pre", () -> new SimpleParticleType(false));
}
