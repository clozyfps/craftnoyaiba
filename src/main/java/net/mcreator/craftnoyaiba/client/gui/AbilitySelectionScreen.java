package net.mcreator.craftnoyaiba.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnoyaiba.world.inventory.AbilitySelectionMenu;
import net.mcreator.craftnoyaiba.procedures.Skill8TooltipProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill8DisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill7TooltipProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill7DisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill6TooltipProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill6DisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill5TooltipProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill5DisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill4TooltipProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill4DisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill3TooltipProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill3DisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill2TooltipProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill2DisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill1TooltipProcedure;
import net.mcreator.craftnoyaiba.procedures.Skill1DisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.LimbTargetConditionProcedure;
import net.mcreator.craftnoyaiba.network.AbilitySelectionButtonMessage;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilitySelectionScreen extends AbstractContainerScreen<AbilitySelectionMenu> {
	private final static HashMap<String, Object> guistate = AbilitySelectionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	ImageButton imagebutton_invisbutton;
	ImageButton imagebutton_invisbutton1;
	ImageButton imagebutton_invisbutton2;
	ImageButton imagebutton_invisbutton3;
	ImageButton imagebutton_invisbutton4;
	ImageButton imagebutton_invisbutton5;
	ImageButton imagebutton_invisbutton6;
	ImageButton imagebutton_invisbutton7;

	public AbilitySelectionScreen(AbilitySelectionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftnoyaiba:textures/screens/ability_selection.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (LimbTargetConditionProcedure.execute(entity))
			if (mouseX > leftPos + -163 && mouseX < leftPos + -139 && mouseY > topPos + -29 && mouseY < topPos + -5)
				guiGraphics.renderTooltip(font, Component.literal(Skill1TooltipProcedure.execute(entity)), mouseX, mouseY);
		if (LimbTargetConditionProcedure.execute(entity))
			if (mouseX > leftPos + -163 && mouseX < leftPos + -139 && mouseY > topPos + -11 && mouseY < topPos + 13)
				guiGraphics.renderTooltip(font, Component.literal(Skill2TooltipProcedure.execute(entity)), mouseX, mouseY);
		if (LimbTargetConditionProcedure.execute(entity))
			if (mouseX > leftPos + -163 && mouseX < leftPos + -139 && mouseY > topPos + 7 && mouseY < topPos + 31)
				guiGraphics.renderTooltip(font, Component.literal(Skill3TooltipProcedure.execute(entity)), mouseX, mouseY);
		if (LimbTargetConditionProcedure.execute(entity))
			if (mouseX > leftPos + -163 && mouseX < leftPos + -139 && mouseY > topPos + 25 && mouseY < topPos + 49)
				guiGraphics.renderTooltip(font, Component.literal(Skill4TooltipProcedure.execute(entity)), mouseX, mouseY);
		if (LimbTargetConditionProcedure.execute(entity))
			if (mouseX > leftPos + -163 && mouseX < leftPos + -139 && mouseY > topPos + 43 && mouseY < topPos + 67)
				guiGraphics.renderTooltip(font, Component.literal(Skill5TooltipProcedure.execute(entity)), mouseX, mouseY);
		if (LimbTargetConditionProcedure.execute(entity))
			if (mouseX > leftPos + -163 && mouseX < leftPos + -139 && mouseY > topPos + 61 && mouseY < topPos + 85)
				guiGraphics.renderTooltip(font, Component.literal(Skill6TooltipProcedure.execute(entity)), mouseX, mouseY);
		if (LimbTargetConditionProcedure.execute(entity))
			if (mouseX > leftPos + -163 && mouseX < leftPos + -139 && mouseY > topPos + 79 && mouseY < topPos + 103)
				guiGraphics.renderTooltip(font, Component.literal(Skill7TooltipProcedure.execute(entity)), mouseX, mouseY);
		if (LimbTargetConditionProcedure.execute(entity))
			if (mouseX > leftPos + -163 && mouseX < leftPos + -139 && mouseY > topPos + 97 && mouseY < topPos + 121)
				guiGraphics.renderTooltip(font, Component.literal(Skill8TooltipProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				Skill1DisplayProcedure.execute(entity), -181, -20, -1, false);
		guiGraphics.drawString(this.font,

				Skill2DisplayProcedure.execute(entity), -181, -2, -1, false);
		guiGraphics.drawString(this.font,

				Skill3DisplayProcedure.execute(entity), -181, 16, -1, false);
		guiGraphics.drawString(this.font,

				Skill4DisplayProcedure.execute(entity), -181, 34, -1, false);
		guiGraphics.drawString(this.font,

				Skill5DisplayProcedure.execute(entity), -181, 52, -1, false);
		guiGraphics.drawString(this.font,

				Skill6DisplayProcedure.execute(entity), -181, 70, -1, false);
		guiGraphics.drawString(this.font,

				Skill7DisplayProcedure.execute(entity), -181, 88, -1, false);
		guiGraphics.drawString(this.font,

				Skill8DisplayProcedure.execute(entity), -181, 106, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = new PlainTextButton(this.leftPos + 179, this.topPos + -29, 35, 20, Component.translatable("gui.craftnoyaiba.ability_selection.button_empty"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new AbilitySelectionButtonMessage(0, x, y, z));
				AbilitySelectionButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		imagebutton_invisbutton = new ImageButton(this.leftPos + -190, this.topPos + -20, 80, 16, 0, 0, 16, new ResourceLocation("craftnoyaiba:textures/screens/atlas/imagebutton_invisbutton.png"), 80, 32, e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new AbilitySelectionButtonMessage(1, x, y, z));
				AbilitySelectionButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisbutton", imagebutton_invisbutton);
		this.addRenderableWidget(imagebutton_invisbutton);
		imagebutton_invisbutton1 = new ImageButton(this.leftPos + -190, this.topPos + -2, 80, 16, 0, 0, 16, new ResourceLocation("craftnoyaiba:textures/screens/atlas/imagebutton_invisbutton1.png"), 80, 32, e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new AbilitySelectionButtonMessage(2, x, y, z));
				AbilitySelectionButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisbutton1", imagebutton_invisbutton1);
		this.addRenderableWidget(imagebutton_invisbutton1);
		imagebutton_invisbutton2 = new ImageButton(this.leftPos + -190, this.topPos + 16, 80, 16, 0, 0, 16, new ResourceLocation("craftnoyaiba:textures/screens/atlas/imagebutton_invisbutton2.png"), 80, 32, e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new AbilitySelectionButtonMessage(3, x, y, z));
				AbilitySelectionButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisbutton2", imagebutton_invisbutton2);
		this.addRenderableWidget(imagebutton_invisbutton2);
		imagebutton_invisbutton3 = new ImageButton(this.leftPos + -190, this.topPos + 34, 80, 16, 0, 0, 16, new ResourceLocation("craftnoyaiba:textures/screens/atlas/imagebutton_invisbutton3.png"), 80, 32, e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new AbilitySelectionButtonMessage(4, x, y, z));
				AbilitySelectionButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisbutton3", imagebutton_invisbutton3);
		this.addRenderableWidget(imagebutton_invisbutton3);
		imagebutton_invisbutton4 = new ImageButton(this.leftPos + -190, this.topPos + 52, 80, 16, 0, 0, 16, new ResourceLocation("craftnoyaiba:textures/screens/atlas/imagebutton_invisbutton4.png"), 80, 32, e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new AbilitySelectionButtonMessage(5, x, y, z));
				AbilitySelectionButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisbutton4", imagebutton_invisbutton4);
		this.addRenderableWidget(imagebutton_invisbutton4);
		imagebutton_invisbutton5 = new ImageButton(this.leftPos + -190, this.topPos + 70, 80, 16, 0, 0, 16, new ResourceLocation("craftnoyaiba:textures/screens/atlas/imagebutton_invisbutton5.png"), 80, 32, e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new AbilitySelectionButtonMessage(6, x, y, z));
				AbilitySelectionButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisbutton5", imagebutton_invisbutton5);
		this.addRenderableWidget(imagebutton_invisbutton5);
		imagebutton_invisbutton6 = new ImageButton(this.leftPos + -190, this.topPos + 88, 80, 16, 0, 0, 16, new ResourceLocation("craftnoyaiba:textures/screens/atlas/imagebutton_invisbutton6.png"), 80, 32, e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new AbilitySelectionButtonMessage(7, x, y, z));
				AbilitySelectionButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisbutton6", imagebutton_invisbutton6);
		this.addRenderableWidget(imagebutton_invisbutton6);
		imagebutton_invisbutton7 = new ImageButton(this.leftPos + -190, this.topPos + 106, 80, 16, 0, 0, 16, new ResourceLocation("craftnoyaiba:textures/screens/atlas/imagebutton_invisbutton7.png"), 80, 32, e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new AbilitySelectionButtonMessage(8, x, y, z));
				AbilitySelectionButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisbutton7", imagebutton_invisbutton7);
		this.addRenderableWidget(imagebutton_invisbutton7);
	}
}
