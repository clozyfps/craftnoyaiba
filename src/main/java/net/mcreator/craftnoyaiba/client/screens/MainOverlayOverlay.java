
package net.mcreator.craftnoyaiba.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnoyaiba.procedures.MoveDisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.MainOverlayDisplayOverlayIngame2Procedure;
import net.mcreator.craftnoyaiba.procedures.BreatheBar7Procedure;
import net.mcreator.craftnoyaiba.procedures.BreatheBar6Procedure;
import net.mcreator.craftnoyaiba.procedures.BreatheBar5Procedure;
import net.mcreator.craftnoyaiba.procedures.BreatheBar4Procedure;
import net.mcreator.craftnoyaiba.procedures.BreatheBar3Procedure;
import net.mcreator.craftnoyaiba.procedures.BreatheBar2Procedure;
import net.mcreator.craftnoyaiba.procedures.BreatheBar1Procedure;
import net.mcreator.craftnoyaiba.procedures.BreatheBar0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MainOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (MainOverlayDisplayOverlayIngame2Procedure.execute(entity)) {
			if (BreatheBar0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_00.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BreatheBar1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_0.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BreatheBar2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_1.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BreatheBar3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_2.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BreatheBar4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_3.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BreatheBar5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_4.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BreatheBar7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_full.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BreatheBar6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_5.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MoveDisplayProcedure.execute(entity), 28, h - 43, -1, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
