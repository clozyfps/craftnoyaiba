
package net.mcreator.craftnoyaiba.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbilitySelectionButtonMessage {

	private final int buttonID, x, y, z;

	public AbilitySelectionButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AbilitySelectionButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AbilitySelectionButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AbilitySelectionButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;

			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = AbilitySelectionMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			OpenAbilityMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			Skill1PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			Skill2PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Skill3PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Skill4PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			Skill5PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			Skill6PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			Skill7PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			Skill8PressedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftnoyaibaMod.addNetworkMessage(AbilitySelectionButtonMessage.class, AbilitySelectionButtonMessage::buffer, AbilitySelectionButtonMessage::new, AbilitySelectionButtonMessage::handler);
	}

}
