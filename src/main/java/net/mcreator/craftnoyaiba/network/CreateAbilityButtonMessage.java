
package net.mcreator.craftnoyaiba.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreateAbilityButtonMessage {

	private final int buttonID, x, y, z;

	public CreateAbilityButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CreateAbilityButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CreateAbilityButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CreateAbilityButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = CreateAbilityMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			OnePressProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			TwoPressProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ThreePressProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			FourPressProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			FivePressProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			XPress1Procedure.execute(entity);
		}
		if (buttonID == 7) {

			XPress2Procedure.execute(entity);
		}
		if (buttonID == 8) {

			XPress4Procedure.execute(entity);
		}
		if (buttonID == 9) {

			XPress5Procedure.execute(entity);
		}
		if (buttonID == 10) {

			XPress3Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftnoyaibaMod.addNetworkMessage(CreateAbilityButtonMessage.class, CreateAbilityButtonMessage::buffer, CreateAbilityButtonMessage::new, CreateAbilityButtonMessage::handler);
	}

}
