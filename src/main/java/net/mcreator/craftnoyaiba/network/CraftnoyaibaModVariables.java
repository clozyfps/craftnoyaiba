package net.mcreator.craftnoyaiba.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftnoyaibaModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CraftnoyaibaMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.AbilityOne = original.AbilityOne;
			clone.AbilityTwo = original.AbilityTwo;
			clone.AbilityThree = original.AbilityThree;
			clone.AbilityFour = original.AbilityFour;
			clone.AbilityFive = original.AbilityFive;
			clone.Level = original.Level;
			clone.Job = original.Job;
			clone.SlayerExp = original.SlayerExp;
			clone.SlayerExpCap = original.SlayerExpCap;
			clone.Rank = original.Rank;
			clone.Race = original.Race;
			clone.Kendo = original.Kendo;
			clone.Regeneration = original.Regeneration;
			clone.Breath = original.Breath;
			clone.BreathMax = original.BreathMax;
			clone.TotalConcentrationMastery = original.TotalConcentrationMastery;
			clone.JoinedWorld = original.JoinedWorld;
			clone.breathmaxtemp = original.breathmaxtemp;
			clone.Breathing = original.Breathing;
			clone.MovesUnlocked = original.MovesUnlocked;
			clone.Clan = original.Clan;
			clone.StrengthStat = original.StrengthStat;
			clone.StrengthMastery = original.StrengthMastery;
			clone.StrengthMasteryCap = original.StrengthMasteryCap;
			clone.AgilityStat = original.AgilityStat;
			clone.AgilityMastery = original.AgilityMastery;
			clone.AgilityMasteryCap = original.AgilityMasteryCap;
			clone.DefenseMastery = original.DefenseMastery;
			clone.DefenseMasteryCap = original.DefenseMasteryCap;
			clone.ParryTime = original.ParryTime;
			clone.ThunderProgress = original.ThunderProgress;
			clone.ThunderRunProgress = original.ThunderRunProgress;
			clone.BreathingAffinity = original.BreathingAffinity;
			clone.GetStruck = original.GetStruck;
			clone.GetStruckTimer = original.GetStruckTimer;
			clone.ParryCount = original.ParryCount;
			clone.Exp = original.Exp;
			clone.ExpMax = original.ExpMax;
			clone.Form1 = original.Form1;
			clone.Form2 = original.Form2;
			clone.Form3 = original.Form3;
			clone.Form4 = original.Form4;
			clone.Form5 = original.Form5;
			clone.Form6 = original.Form6;
			clone.Form7 = original.Form7;
			clone.Form8 = original.Form8;
			clone.Form9 = original.Form9;
			clone.Form10 = original.Form10;
			clone.Form11 = original.Form11;
			clone.Form12 = original.Form12;
			clone.Form13 = original.Form13;
			clone.Form14 = original.Form14;
			clone.Form15 = original.Form15;
			clone.Form16 = original.Form16;
			clone.ColorCode = original.ColorCode;
			clone.MoveSwitch = original.MoveSwitch;
			clone.MoveCurrent = original.MoveCurrent;
			clone.ActiveMove = original.ActiveMove;
			clone.Cost1 = original.Cost1;
			clone.Cost2 = original.Cost2;
			clone.Cost3 = original.Cost3;
			clone.Cost4 = original.Cost4;
			clone.Cost5 = original.Cost5;
			clone.Cost6 = original.Cost6;
			clone.Cost7 = original.Cost7;
			clone.Cost8 = original.Cost8;
			clone.AbsoluteCost = original.AbsoluteCost;
			clone.Trait = original.Trait;
			clone.RankNumber = original.RankNumber;
			clone.DamageModifier = original.DamageModifier;
			clone.DemonPower = original.DemonPower;
			clone.DemonPowerMasteryMax = original.DemonPowerMasteryMax;
			clone.DemonPowerMastery = original.DemonPowerMastery;
			clone.BloodDemonArt = original.BloodDemonArt;
			clone.Blood = original.Blood;
			clone.BloodMax = original.BloodMax;
			if (!event.isWasDeath()) {
				clone.Slot = original.Slot;
				clone.ParryTimer = original.ParryTimer;
				clone.ComboMeter = original.ComboMeter;
				clone.BreathingActive = original.BreathingActive;
				clone.DefenseStat = original.DefenseStat;
				clone.ThunderRunQuest = original.ThunderRunQuest;
				clone.Cooldown = original.Cooldown;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("craftnoyaiba", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String AbilityOne = "";
		public String AbilityTwo = "";
		public String AbilityThree = "";
		public String AbilityFour = "";
		public String AbilityFive = "";
		public String Slot = "";
		public double Level = 0.0;
		public String Job = "";
		public double SlayerExp = 0;
		public double SlayerExpCap = 0;
		public String Rank = "";
		public String Race = "";
		public double ParryTimer = 0;
		public double ComboMeter = 0;
		public double Kendo = 0;
		public double Regeneration = 0;
		public boolean BreathingActive = false;
		public double Breath = 0;
		public double BreathMax = 0;
		public double TotalConcentrationMastery = 0;
		public boolean JoinedWorld = false;
		public double breathmaxtemp = 0;
		public String Breathing = "";
		public String MovesUnlocked = "";
		public String Clan = "";
		public double StrengthStat = 0;
		public double StrengthMastery = 0;
		public double StrengthMasteryCap = 100.0;
		public double AgilityStat = 0.0;
		public double AgilityMastery = 0.0;
		public double AgilityMasteryCap = 0.0;
		public double DefenseStat = 0;
		public double DefenseMastery = 0.0;
		public double DefenseMasteryCap = 100.0;
		public boolean ParryTime = false;
		public double ThunderProgress = 0;
		public boolean ThunderRunQuest = false;
		public double ThunderRunProgress = 0;
		public String BreathingAffinity = "";
		public boolean GetStruck = false;
		public double GetStruckTimer = 0;
		public double ParryCount = 0;
		public double Exp = 0;
		public double ExpMax = 0;
		public String Form1 = "";
		public String Form2 = "";
		public String Form3 = "";
		public String Form4 = "";
		public String Form5 = "";
		public String Form6 = "";
		public String Form7 = "";
		public String Form8 = "";
		public String Form9 = "";
		public String Form10 = "";
		public String Form11 = "";
		public String Form12 = "";
		public String Form13 = "";
		public String Form14 = "";
		public String Form15 = "";
		public String Form16 = "";
		public String ColorCode = "";
		public double MoveSwitch = 0;
		public String MoveCurrent = "";
		public String ActiveMove = "";
		public double Cost1 = 0;
		public double Cost2 = 0;
		public double Cost3 = 0;
		public double Cost4 = 0;
		public double Cost5 = 0;
		public double Cost6 = 0;
		public double Cost7 = 0;
		public double Cost8 = 0;
		public double AbsoluteCost = 0;
		public double Cooldown = 0;
		public String Trait = "\"\"";
		public double RankNumber = 0;
		public double DamageModifier = 0;
		public double DemonPower = 0;
		public double DemonPowerMasteryMax = 0;
		public double DemonPowerMastery = 0;
		public String BloodDemonArt = "";
		public double Blood = 0;
		public double BloodMax = 0.0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CraftnoyaibaMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("AbilityOne", AbilityOne);
			nbt.putString("AbilityTwo", AbilityTwo);
			nbt.putString("AbilityThree", AbilityThree);
			nbt.putString("AbilityFour", AbilityFour);
			nbt.putString("AbilityFive", AbilityFive);
			nbt.putString("Slot", Slot);
			nbt.putDouble("Level", Level);
			nbt.putString("Job", Job);
			nbt.putDouble("SlayerExp", SlayerExp);
			nbt.putDouble("SlayerExpCap", SlayerExpCap);
			nbt.putString("Rank", Rank);
			nbt.putString("Race", Race);
			nbt.putDouble("ParryTimer", ParryTimer);
			nbt.putDouble("ComboMeter", ComboMeter);
			nbt.putDouble("Kendo", Kendo);
			nbt.putDouble("Regeneration", Regeneration);
			nbt.putBoolean("BreathingActive", BreathingActive);
			nbt.putDouble("Breath", Breath);
			nbt.putDouble("BreathMax", BreathMax);
			nbt.putDouble("TotalConcentrationMastery", TotalConcentrationMastery);
			nbt.putBoolean("JoinedWorld", JoinedWorld);
			nbt.putDouble("breathmaxtemp", breathmaxtemp);
			nbt.putString("Breathing", Breathing);
			nbt.putString("MovesUnlocked", MovesUnlocked);
			nbt.putString("Clan", Clan);
			nbt.putDouble("StrengthStat", StrengthStat);
			nbt.putDouble("StrengthMastery", StrengthMastery);
			nbt.putDouble("StrengthMasteryCap", StrengthMasteryCap);
			nbt.putDouble("AgilityStat", AgilityStat);
			nbt.putDouble("AgilityMastery", AgilityMastery);
			nbt.putDouble("AgilityMasteryCap", AgilityMasteryCap);
			nbt.putDouble("DefenseStat", DefenseStat);
			nbt.putDouble("DefenseMastery", DefenseMastery);
			nbt.putDouble("DefenseMasteryCap", DefenseMasteryCap);
			nbt.putBoolean("ParryTime", ParryTime);
			nbt.putDouble("ThunderProgress", ThunderProgress);
			nbt.putBoolean("ThunderRunQuest", ThunderRunQuest);
			nbt.putDouble("ThunderRunProgress", ThunderRunProgress);
			nbt.putString("BreathingAffinity", BreathingAffinity);
			nbt.putBoolean("GetStruck", GetStruck);
			nbt.putDouble("GetStruckTimer", GetStruckTimer);
			nbt.putDouble("ParryCount", ParryCount);
			nbt.putDouble("Exp", Exp);
			nbt.putDouble("ExpMax", ExpMax);
			nbt.putString("Form1", Form1);
			nbt.putString("Form2", Form2);
			nbt.putString("Form3", Form3);
			nbt.putString("Form4", Form4);
			nbt.putString("Form5", Form5);
			nbt.putString("Form6", Form6);
			nbt.putString("Form7", Form7);
			nbt.putString("Form8", Form8);
			nbt.putString("Form9", Form9);
			nbt.putString("Form10", Form10);
			nbt.putString("Form11", Form11);
			nbt.putString("Form12", Form12);
			nbt.putString("Form13", Form13);
			nbt.putString("Form14", Form14);
			nbt.putString("Form15", Form15);
			nbt.putString("Form16", Form16);
			nbt.putString("ColorCode", ColorCode);
			nbt.putDouble("MoveSwitch", MoveSwitch);
			nbt.putString("MoveCurrent", MoveCurrent);
			nbt.putString("ActiveMove", ActiveMove);
			nbt.putDouble("Cost1", Cost1);
			nbt.putDouble("Cost2", Cost2);
			nbt.putDouble("Cost3", Cost3);
			nbt.putDouble("Cost4", Cost4);
			nbt.putDouble("Cost5", Cost5);
			nbt.putDouble("Cost6", Cost6);
			nbt.putDouble("Cost7", Cost7);
			nbt.putDouble("Cost8", Cost8);
			nbt.putDouble("AbsoluteCost", AbsoluteCost);
			nbt.putDouble("Cooldown", Cooldown);
			nbt.putString("Trait", Trait);
			nbt.putDouble("RankNumber", RankNumber);
			nbt.putDouble("DamageModifier", DamageModifier);
			nbt.putDouble("DemonPower", DemonPower);
			nbt.putDouble("DemonPowerMasteryMax", DemonPowerMasteryMax);
			nbt.putDouble("DemonPowerMastery", DemonPowerMastery);
			nbt.putString("BloodDemonArt", BloodDemonArt);
			nbt.putDouble("Blood", Blood);
			nbt.putDouble("BloodMax", BloodMax);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			AbilityOne = nbt.getString("AbilityOne");
			AbilityTwo = nbt.getString("AbilityTwo");
			AbilityThree = nbt.getString("AbilityThree");
			AbilityFour = nbt.getString("AbilityFour");
			AbilityFive = nbt.getString("AbilityFive");
			Slot = nbt.getString("Slot");
			Level = nbt.getDouble("Level");
			Job = nbt.getString("Job");
			SlayerExp = nbt.getDouble("SlayerExp");
			SlayerExpCap = nbt.getDouble("SlayerExpCap");
			Rank = nbt.getString("Rank");
			Race = nbt.getString("Race");
			ParryTimer = nbt.getDouble("ParryTimer");
			ComboMeter = nbt.getDouble("ComboMeter");
			Kendo = nbt.getDouble("Kendo");
			Regeneration = nbt.getDouble("Regeneration");
			BreathingActive = nbt.getBoolean("BreathingActive");
			Breath = nbt.getDouble("Breath");
			BreathMax = nbt.getDouble("BreathMax");
			TotalConcentrationMastery = nbt.getDouble("TotalConcentrationMastery");
			JoinedWorld = nbt.getBoolean("JoinedWorld");
			breathmaxtemp = nbt.getDouble("breathmaxtemp");
			Breathing = nbt.getString("Breathing");
			MovesUnlocked = nbt.getString("MovesUnlocked");
			Clan = nbt.getString("Clan");
			StrengthStat = nbt.getDouble("StrengthStat");
			StrengthMastery = nbt.getDouble("StrengthMastery");
			StrengthMasteryCap = nbt.getDouble("StrengthMasteryCap");
			AgilityStat = nbt.getDouble("AgilityStat");
			AgilityMastery = nbt.getDouble("AgilityMastery");
			AgilityMasteryCap = nbt.getDouble("AgilityMasteryCap");
			DefenseStat = nbt.getDouble("DefenseStat");
			DefenseMastery = nbt.getDouble("DefenseMastery");
			DefenseMasteryCap = nbt.getDouble("DefenseMasteryCap");
			ParryTime = nbt.getBoolean("ParryTime");
			ThunderProgress = nbt.getDouble("ThunderProgress");
			ThunderRunQuest = nbt.getBoolean("ThunderRunQuest");
			ThunderRunProgress = nbt.getDouble("ThunderRunProgress");
			BreathingAffinity = nbt.getString("BreathingAffinity");
			GetStruck = nbt.getBoolean("GetStruck");
			GetStruckTimer = nbt.getDouble("GetStruckTimer");
			ParryCount = nbt.getDouble("ParryCount");
			Exp = nbt.getDouble("Exp");
			ExpMax = nbt.getDouble("ExpMax");
			Form1 = nbt.getString("Form1");
			Form2 = nbt.getString("Form2");
			Form3 = nbt.getString("Form3");
			Form4 = nbt.getString("Form4");
			Form5 = nbt.getString("Form5");
			Form6 = nbt.getString("Form6");
			Form7 = nbt.getString("Form7");
			Form8 = nbt.getString("Form8");
			Form9 = nbt.getString("Form9");
			Form10 = nbt.getString("Form10");
			Form11 = nbt.getString("Form11");
			Form12 = nbt.getString("Form12");
			Form13 = nbt.getString("Form13");
			Form14 = nbt.getString("Form14");
			Form15 = nbt.getString("Form15");
			Form16 = nbt.getString("Form16");
			ColorCode = nbt.getString("ColorCode");
			MoveSwitch = nbt.getDouble("MoveSwitch");
			MoveCurrent = nbt.getString("MoveCurrent");
			ActiveMove = nbt.getString("ActiveMove");
			Cost1 = nbt.getDouble("Cost1");
			Cost2 = nbt.getDouble("Cost2");
			Cost3 = nbt.getDouble("Cost3");
			Cost4 = nbt.getDouble("Cost4");
			Cost5 = nbt.getDouble("Cost5");
			Cost6 = nbt.getDouble("Cost6");
			Cost7 = nbt.getDouble("Cost7");
			Cost8 = nbt.getDouble("Cost8");
			AbsoluteCost = nbt.getDouble("AbsoluteCost");
			Cooldown = nbt.getDouble("Cooldown");
			Trait = nbt.getString("Trait");
			RankNumber = nbt.getDouble("RankNumber");
			DamageModifier = nbt.getDouble("DamageModifier");
			DemonPower = nbt.getDouble("DemonPower");
			DemonPowerMasteryMax = nbt.getDouble("DemonPowerMasteryMax");
			DemonPowerMastery = nbt.getDouble("DemonPowerMastery");
			BloodDemonArt = nbt.getString("BloodDemonArt");
			Blood = nbt.getDouble("Blood");
			BloodMax = nbt.getDouble("BloodMax");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.AbilityOne = message.data.AbilityOne;
					variables.AbilityTwo = message.data.AbilityTwo;
					variables.AbilityThree = message.data.AbilityThree;
					variables.AbilityFour = message.data.AbilityFour;
					variables.AbilityFive = message.data.AbilityFive;
					variables.Slot = message.data.Slot;
					variables.Level = message.data.Level;
					variables.Job = message.data.Job;
					variables.SlayerExp = message.data.SlayerExp;
					variables.SlayerExpCap = message.data.SlayerExpCap;
					variables.Rank = message.data.Rank;
					variables.Race = message.data.Race;
					variables.ParryTimer = message.data.ParryTimer;
					variables.ComboMeter = message.data.ComboMeter;
					variables.Kendo = message.data.Kendo;
					variables.Regeneration = message.data.Regeneration;
					variables.BreathingActive = message.data.BreathingActive;
					variables.Breath = message.data.Breath;
					variables.BreathMax = message.data.BreathMax;
					variables.TotalConcentrationMastery = message.data.TotalConcentrationMastery;
					variables.JoinedWorld = message.data.JoinedWorld;
					variables.breathmaxtemp = message.data.breathmaxtemp;
					variables.Breathing = message.data.Breathing;
					variables.MovesUnlocked = message.data.MovesUnlocked;
					variables.Clan = message.data.Clan;
					variables.StrengthStat = message.data.StrengthStat;
					variables.StrengthMastery = message.data.StrengthMastery;
					variables.StrengthMasteryCap = message.data.StrengthMasteryCap;
					variables.AgilityStat = message.data.AgilityStat;
					variables.AgilityMastery = message.data.AgilityMastery;
					variables.AgilityMasteryCap = message.data.AgilityMasteryCap;
					variables.DefenseStat = message.data.DefenseStat;
					variables.DefenseMastery = message.data.DefenseMastery;
					variables.DefenseMasteryCap = message.data.DefenseMasteryCap;
					variables.ParryTime = message.data.ParryTime;
					variables.ThunderProgress = message.data.ThunderProgress;
					variables.ThunderRunQuest = message.data.ThunderRunQuest;
					variables.ThunderRunProgress = message.data.ThunderRunProgress;
					variables.BreathingAffinity = message.data.BreathingAffinity;
					variables.GetStruck = message.data.GetStruck;
					variables.GetStruckTimer = message.data.GetStruckTimer;
					variables.ParryCount = message.data.ParryCount;
					variables.Exp = message.data.Exp;
					variables.ExpMax = message.data.ExpMax;
					variables.Form1 = message.data.Form1;
					variables.Form2 = message.data.Form2;
					variables.Form3 = message.data.Form3;
					variables.Form4 = message.data.Form4;
					variables.Form5 = message.data.Form5;
					variables.Form6 = message.data.Form6;
					variables.Form7 = message.data.Form7;
					variables.Form8 = message.data.Form8;
					variables.Form9 = message.data.Form9;
					variables.Form10 = message.data.Form10;
					variables.Form11 = message.data.Form11;
					variables.Form12 = message.data.Form12;
					variables.Form13 = message.data.Form13;
					variables.Form14 = message.data.Form14;
					variables.Form15 = message.data.Form15;
					variables.Form16 = message.data.Form16;
					variables.ColorCode = message.data.ColorCode;
					variables.MoveSwitch = message.data.MoveSwitch;
					variables.MoveCurrent = message.data.MoveCurrent;
					variables.ActiveMove = message.data.ActiveMove;
					variables.Cost1 = message.data.Cost1;
					variables.Cost2 = message.data.Cost2;
					variables.Cost3 = message.data.Cost3;
					variables.Cost4 = message.data.Cost4;
					variables.Cost5 = message.data.Cost5;
					variables.Cost6 = message.data.Cost6;
					variables.Cost7 = message.data.Cost7;
					variables.Cost8 = message.data.Cost8;
					variables.AbsoluteCost = message.data.AbsoluteCost;
					variables.Cooldown = message.data.Cooldown;
					variables.Trait = message.data.Trait;
					variables.RankNumber = message.data.RankNumber;
					variables.DamageModifier = message.data.DamageModifier;
					variables.DemonPower = message.data.DemonPower;
					variables.DemonPowerMasteryMax = message.data.DemonPowerMasteryMax;
					variables.DemonPowerMastery = message.data.DemonPowerMastery;
					variables.BloodDemonArt = message.data.BloodDemonArt;
					variables.Blood = message.data.Blood;
					variables.BloodMax = message.data.BloodMax;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
