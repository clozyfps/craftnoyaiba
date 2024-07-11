package net.mcreator.craftnoyaiba.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnoyaiba.world.inventory.CreateAbilityMenu;
import net.mcreator.craftnoyaiba.procedures.DisplayMove5Procedure;
import net.mcreator.craftnoyaiba.procedures.DisplayMove4Procedure;
import net.mcreator.craftnoyaiba.procedures.DisplayMove3Procedure;
import net.mcreator.craftnoyaiba.procedures.DisplayMove2Procedure;
import net.mcreator.craftnoyaiba.procedures.DisplayMove1Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckX5Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckX4Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckX3Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckX2Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckX1Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckAdd5Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckAdd4Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckAdd3Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckAdd2Procedure;
import net.mcreator.craftnoyaiba.procedures.CheckAdd1Procedure;
import net.mcreator.craftnoyaiba.network.CreateAbilityButtonMessage;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CreateAbilityScreen extends AbstractContainerScreen<CreateAbilityMenu> {
	private final static HashMap<String, Object> guistate = CreateAbilityMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_ssl;
	Button button_ssl1;
	Button button_ssl2;
	Button button_empty;
	Button button_ssl3;
	Button button_empty1;
	Button button_sslx;
	Button button_sslx1;
	Button button_sslx2;
	Button button_sslx3;
	Button button_sslx4;

	public CreateAbilityScreen(CreateAbilityMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftnoyaiba:textures/screens/create_ability.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
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

				DisplayMove1Procedure.execute(entity), -127, -20, -1, false);
		guiGraphics.drawString(this.font,

				DisplayMove2Procedure.execute(entity), -127, 16, -1, false);
		guiGraphics.drawString(this.font,

				DisplayMove3Procedure.execute(entity), -127, 52, -1, false);
		guiGraphics.drawString(this.font,

				DisplayMove4Procedure.execute(entity), -127, 94, -1, false);
		guiGraphics.drawString(this.font,

				DisplayMove5Procedure.execute(entity), -127, 133, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_ssl = new PlainTextButton(this.leftPos + -168, this.topPos + -20, 40, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_ssl"), e -> {
			if (CheckAdd1Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(0, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckAdd1Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_ssl", button_ssl);
		this.addRenderableWidget(button_ssl);
		button_ssl1 = new PlainTextButton(this.leftPos + -168, this.topPos + 16, 40, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_ssl1"), e -> {
			if (CheckAdd2Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(1, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckAdd2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_ssl1", button_ssl1);
		this.addRenderableWidget(button_ssl1);
		button_ssl2 = new PlainTextButton(this.leftPos + -168, this.topPos + 52, 40, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_ssl2"), e -> {
			if (CheckAdd3Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(2, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckAdd3Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_ssl2", button_ssl2);
		this.addRenderableWidget(button_ssl2);
		button_empty = new PlainTextButton(this.leftPos + -168, this.topPos + 92, 30, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_empty"), e -> {
			if (CheckAdd4Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(3, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckAdd4Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_ssl3 = new PlainTextButton(this.leftPos + -168, this.topPos + 133, 40, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_ssl3"), e -> {
			if (CheckAdd5Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(4, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckAdd5Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_ssl3", button_ssl3);
		this.addRenderableWidget(button_ssl3);
		button_empty1 = new PlainTextButton(this.leftPos + 183, this.topPos + -31, 35, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_empty1"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(5, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_sslx = new PlainTextButton(this.leftPos + -207, this.topPos + -20, 40, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_sslx"), e -> {
			if (CheckX1Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(6, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckX1Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_sslx", button_sslx);
		this.addRenderableWidget(button_sslx);
		button_sslx1 = new PlainTextButton(this.leftPos + -207, this.topPos + 16, 40, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_sslx1"), e -> {
			if (CheckX2Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(7, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckX2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_sslx1", button_sslx1);
		this.addRenderableWidget(button_sslx1);
		button_sslx2 = new PlainTextButton(this.leftPos + -206, this.topPos + 93, 40, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_sslx2"), e -> {
			if (CheckX4Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(8, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckX4Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_sslx2", button_sslx2);
		this.addRenderableWidget(button_sslx2);
		button_sslx3 = new PlainTextButton(this.leftPos + -206, this.topPos + 133, 40, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_sslx3"), e -> {
			if (CheckX5Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(9, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckX5Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_sslx3", button_sslx3);
		this.addRenderableWidget(button_sslx3);
		button_sslx4 = new PlainTextButton(this.leftPos + -207, this.topPos + 52, 40, 20, Component.translatable("gui.craftnoyaiba.create_ability.button_sslx4"), e -> {
			if (CheckX3Procedure.execute(entity)) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new CreateAbilityButtonMessage(10, x, y, z));
				CreateAbilityButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}, this.font) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CheckX3Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:button_sslx4", button_sslx4);
		this.addRenderableWidget(button_sslx4);
	}
}
