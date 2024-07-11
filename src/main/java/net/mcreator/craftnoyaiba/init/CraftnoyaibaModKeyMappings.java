
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.craftnoyaiba.network.UseSkillMessage;
import net.mcreator.craftnoyaiba.network.SwitchSkillMessage;
import net.mcreator.craftnoyaiba.network.ParryKeyMessage;
import net.mcreator.craftnoyaiba.network.MenuOpenMessage;
import net.mcreator.craftnoyaiba.network.BreatheMessage;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftnoyaibaModKeyMappings {
	public static final KeyMapping BREATHE = new KeyMapping("key.craftnoyaiba.breathe", GLFW.GLFW_KEY_X, "key.categories.cny") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new BreatheMessage(0, 0));
				BreatheMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				BREATHE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - BREATHE_LASTPRESS);
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new BreatheMessage(1, dt));
				BreatheMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MENU_OPEN = new KeyMapping("key.craftnoyaiba.menu_open", GLFW.GLFW_KEY_M, "key.categories.cny") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new MenuOpenMessage(0, 0));
				MenuOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PARRY_KEY = new KeyMapping("key.craftnoyaiba.parry_key", GLFW.GLFW_KEY_F, "key.categories.cny") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new ParryKeyMessage(0, 0));
				ParryKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				PARRY_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - PARRY_KEY_LASTPRESS);
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new ParryKeyMessage(1, dt));
				ParryKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SWITCH_SKILL = new KeyMapping("key.craftnoyaiba.switch_skill", GLFW.GLFW_KEY_R, "key.categories.cny") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new SwitchSkillMessage(0, 0));
				SwitchSkillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_SKILL = new KeyMapping("key.craftnoyaiba.use_skill", GLFW.GLFW_KEY_Z, "key.categories.cny") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new UseSkillMessage(0, 0));
				UseSkillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long BREATHE_LASTPRESS = 0;
	private static long PARRY_KEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(BREATHE);
		event.register(MENU_OPEN);
		event.register(PARRY_KEY);
		event.register(SWITCH_SKILL);
		event.register(USE_SKILL);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				BREATHE.consumeClick();
				MENU_OPEN.consumeClick();
				PARRY_KEY.consumeClick();
				SWITCH_SKILL.consumeClick();
				USE_SKILL.consumeClick();
			}
		}
	}
}
