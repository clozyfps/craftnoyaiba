
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftnoyaiba.client.particle.YellowElectricityParticle;
import net.mcreator.craftnoyaiba.client.particle.StoneParticlePreParticle;
import net.mcreator.craftnoyaiba.client.particle.FloatingRockParticle;
import net.mcreator.craftnoyaiba.client.particle.ElectricityParticle;
import net.mcreator.craftnoyaiba.client.particle.ClashParticleParticle;
import net.mcreator.craftnoyaiba.client.particle.BlueElectricityParticle;
import net.mcreator.craftnoyaiba.client.particle.BloodSplashParticle;
import net.mcreator.craftnoyaiba.client.particle.BloodCriticalParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftnoyaibaModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CraftnoyaibaModParticleTypes.CLASH_PARTICLE.get(), ClashParticleParticle::provider);
		event.registerSpriteSet(CraftnoyaibaModParticleTypes.BLOOD_SPLASH.get(), BloodSplashParticle::provider);
		event.registerSpriteSet(CraftnoyaibaModParticleTypes.ELECTRICITY.get(), ElectricityParticle::provider);
		event.registerSpriteSet(CraftnoyaibaModParticleTypes.BLOOD_CRITICAL.get(), BloodCriticalParticle::provider);
		event.registerSpriteSet(CraftnoyaibaModParticleTypes.YELLOW_ELECTRICITY.get(), YellowElectricityParticle::provider);
		event.registerSpriteSet(CraftnoyaibaModParticleTypes.BLUE_ELECTRICITY.get(), BlueElectricityParticle::provider);
		event.registerSpriteSet(CraftnoyaibaModParticleTypes.FLOATING_ROCK.get(), FloatingRockParticle::provider);
		event.registerSpriteSet(CraftnoyaibaModParticleTypes.STONE_PARTICLE_PRE.get(), StoneParticlePreParticle::provider);
	}
}
