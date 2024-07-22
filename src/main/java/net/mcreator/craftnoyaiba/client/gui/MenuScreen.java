package net.mcreator.craftnoyaiba.client.gui;

public class MenuScreen extends AbstractContainerScreen<MenuMenu> {

	private final static HashMap<String, Object> guistate = MenuMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_ssl;

	public MenuScreen(MenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftnoyaiba:textures/screens/menu.png");

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
	}

	@Override
	public void init() {
		super.init();

		button_ssl = new PlainTextButton(this.leftPos + 179, this.topPos + -29, 46, 20, Component.translatable("gui.craftnoyaiba.menu.button_ssl"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(0, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);

		guistate.put("button:button_ssl", button_ssl);
		this.addRenderableWidget(button_ssl);

	}

}
