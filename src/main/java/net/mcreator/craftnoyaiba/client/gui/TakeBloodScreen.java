package net.mcreator.craftnoyaiba.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnoyaiba.world.inventory.TakeBloodMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TakeBloodScreen extends AbstractContainerScreen<TakeBloodMenu> {
	private final static HashMap<String, Object> guistate = TakeBloodMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox BloodAmount;
	Button button_take;

	public TakeBloodScreen(TakeBloodMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftnoyaiba:textures/screens/take_blood.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		BloodAmount.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (BloodAmount.isFocused())
			return BloodAmount.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		BloodAmount.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		BloodAmount = new EditBox(this.font, this.leftPos + -63, this.topPos + 71, 118, 18, Component.translatable("gui.craftnoyaiba.take_blood.BloodAmount")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftnoyaiba.take_blood.BloodAmount").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftnoyaiba.take_blood.BloodAmount").getString());
				else
					setSuggestion(null);
			}
		};
		BloodAmount.setSuggestion(Component.translatable("gui.craftnoyaiba.take_blood.BloodAmount").getString());
		BloodAmount.setMaxLength(32767);
		guistate.put("text:BloodAmount", BloodAmount);
		this.addWidget(this.BloodAmount);
		button_take = Button.builder(Component.translatable("gui.craftnoyaiba.take_blood.button_take"), e -> {
		}).bounds(this.leftPos + -28, this.topPos + 97, 46, 20).build();
		guistate.put("button:button_take", button_take);
		this.addRenderableWidget(button_take);
	}
}
