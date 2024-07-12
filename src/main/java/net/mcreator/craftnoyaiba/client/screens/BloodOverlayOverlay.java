
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

import net.mcreator.craftnoyaiba.procedures.BloodDisplayConditionProcedure;
import net.mcreator.craftnoyaiba.procedures.BloodBar7Procedure;
import net.mcreator.craftnoyaiba.procedures.BloodBar6Procedure;
import net.mcreator.craftnoyaiba.procedures.BloodBar5Procedure;
import net.mcreator.craftnoyaiba.procedures.BloodBar4Procedure;
import net.mcreator.craftnoyaiba.procedures.BloodBar3Procedure;
import net.mcreator.craftnoyaiba.procedures.BloodBar2Procedure;
import net.mcreator.craftnoyaiba.procedures.BloodBar1Procedure;
import net.mcreator.craftnoyaiba.procedures.BloodBar0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class BloodOverlayOverlay {
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
		if (BloodDisplayConditionProcedure.execute(entity)) {
			if (BloodBar1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/demon_ui_2.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BloodBar0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/demon_ui_1.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BloodBar2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/demon_ui_3.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BloodBar3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/demon_ui_4.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BloodBar4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/demon_ui_5.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BloodBar5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/demon_ui_6.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BloodBar6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/demon_ui_7.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (BloodBar7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/demon_ui_full.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
