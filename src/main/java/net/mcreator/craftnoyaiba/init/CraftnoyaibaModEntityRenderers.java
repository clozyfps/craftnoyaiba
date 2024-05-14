
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.craftnoyaiba.client.renderer.ThunderClapAndFlashMobRenderer;
import net.mcreator.craftnoyaiba.client.renderer.KaigakuHumanRenderer;
import net.mcreator.craftnoyaiba.client.renderer.JigoroKuwajimaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftnoyaibaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CraftnoyaibaModEntities.JIGORO_KUWAJIMA.get(), JigoroKuwajimaRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.ROCK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.KAIGAKU_HUMAN.get(), KaigakuHumanRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.TCAF_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.THUNDER_CLAP_AND_FLASH_MOB.get(), ThunderClapAndFlashMobRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.HEAT_LIGHTNING_START.get(), ThrownItemRenderer::new);
	}
}
