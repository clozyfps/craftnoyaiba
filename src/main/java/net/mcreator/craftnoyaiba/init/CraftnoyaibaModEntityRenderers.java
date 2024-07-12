
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.craftnoyaiba.client.renderer.ZenitsuAgatsumaRenderer;
import net.mcreator.craftnoyaiba.client.renderer.ThunderClapAndFlashMobRenderer;
import net.mcreator.craftnoyaiba.client.renderer.KiriyaUbuyashikiRenderer;
import net.mcreator.craftnoyaiba.client.renderer.KanataUbuyashikiRenderer;
import net.mcreator.craftnoyaiba.client.renderer.KaigakuHumanRenderer;
import net.mcreator.craftnoyaiba.client.renderer.JigoroKuwajimaRenderer;
import net.mcreator.craftnoyaiba.client.renderer.InfinityCastleDoorUpsideDownRenderer;
import net.mcreator.craftnoyaiba.client.renderer.InfinityCastleDoorRenderer;
import net.mcreator.craftnoyaiba.client.renderer.FlamingThunderGodRenderer;
import net.mcreator.craftnoyaiba.client.renderer.FlameFirstFormRenderer;
import net.mcreator.craftnoyaiba.client.renderer.FinalSelectionDemonRenderer;

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
		event.registerEntityRenderer(CraftnoyaibaModEntities.FINAL_SELECTION_DEMON.get(), FinalSelectionDemonRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.KIRIYA_UBUYASHIKI.get(), KiriyaUbuyashikiRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.KANATA_UBUYASHIKI.get(), KanataUbuyashikiRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.INFINITY_CASTLE_DOOR.get(), InfinityCastleDoorRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.INFINITY_CASTLE_DOOR_UPSIDE_DOWN.get(), InfinityCastleDoorUpsideDownRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.RIFLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.FLAME_FIRST_FORM.get(), FlameFirstFormRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.GODSPEED_TCAF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.FLAMING_THUNDER_GOD.get(), FlamingThunderGodRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.TCAF_THUNDER_GOD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftnoyaibaModEntities.ZENITSU_AGATSUMA.get(), ZenitsuAgatsumaRenderer::new);
	}
}
