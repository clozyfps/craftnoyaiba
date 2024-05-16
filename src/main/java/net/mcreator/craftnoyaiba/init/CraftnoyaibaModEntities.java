
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.entity.ThunderClapAndFlashMobEntity;
import net.mcreator.craftnoyaiba.entity.TCAFProjectileEntity;
import net.mcreator.craftnoyaiba.entity.RockEntity;
import net.mcreator.craftnoyaiba.entity.KiriyaUbuyashikiEntity;
import net.mcreator.craftnoyaiba.entity.KanataUbuyashikiEntity;
import net.mcreator.craftnoyaiba.entity.KaigakuHumanEntity;
import net.mcreator.craftnoyaiba.entity.JigoroKuwajimaEntity;
import net.mcreator.craftnoyaiba.entity.HeatLightningStartEntity;
import net.mcreator.craftnoyaiba.entity.FinalSelectionDemonEntity;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftnoyaibaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CraftnoyaibaMod.MODID);
	public static final RegistryObject<EntityType<JigoroKuwajimaEntity>> JIGORO_KUWAJIMA = register("jigoro_kuwajima",
			EntityType.Builder.<JigoroKuwajimaEntity>of(JigoroKuwajimaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JigoroKuwajimaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RockEntity>> ROCK = register("projectile_rock",
			EntityType.Builder.<RockEntity>of(RockEntity::new, MobCategory.MISC).setCustomClientFactory(RockEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KaigakuHumanEntity>> KAIGAKU_HUMAN = register("kaigaku_human",
			EntityType.Builder.<KaigakuHumanEntity>of(KaigakuHumanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KaigakuHumanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TCAFProjectileEntity>> TCAF_PROJECTILE = register("projectile_tcaf_projectile",
			EntityType.Builder.<TCAFProjectileEntity>of(TCAFProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TCAFProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ThunderClapAndFlashMobEntity>> THUNDER_CLAP_AND_FLASH_MOB = register("thunder_clap_and_flash_mob",
			EntityType.Builder.<ThunderClapAndFlashMobEntity>of(ThunderClapAndFlashMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ThunderClapAndFlashMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeatLightningStartEntity>> HEAT_LIGHTNING_START = register("projectile_heat_lightning_start", EntityType.Builder.<HeatLightningStartEntity>of(HeatLightningStartEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HeatLightningStartEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FinalSelectionDemonEntity>> FINAL_SELECTION_DEMON = register("final_selection_demon",
			EntityType.Builder.<FinalSelectionDemonEntity>of(FinalSelectionDemonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FinalSelectionDemonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KiriyaUbuyashikiEntity>> KIRIYA_UBUYASHIKI = register("kiriya_ubuyashiki",
			EntityType.Builder.<KiriyaUbuyashikiEntity>of(KiriyaUbuyashikiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KiriyaUbuyashikiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KanataUbuyashikiEntity>> KANATA_UBUYASHIKI = register("kanata_ubuyashiki",
			EntityType.Builder.<KanataUbuyashikiEntity>of(KanataUbuyashikiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KanataUbuyashikiEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			JigoroKuwajimaEntity.init();
			KaigakuHumanEntity.init();
			ThunderClapAndFlashMobEntity.init();
			FinalSelectionDemonEntity.init();
			KiriyaUbuyashikiEntity.init();
			KanataUbuyashikiEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(JIGORO_KUWAJIMA.get(), JigoroKuwajimaEntity.createAttributes().build());
		event.put(KAIGAKU_HUMAN.get(), KaigakuHumanEntity.createAttributes().build());
		event.put(THUNDER_CLAP_AND_FLASH_MOB.get(), ThunderClapAndFlashMobEntity.createAttributes().build());
		event.put(FINAL_SELECTION_DEMON.get(), FinalSelectionDemonEntity.createAttributes().build());
		event.put(KIRIYA_UBUYASHIKI.get(), KiriyaUbuyashikiEntity.createAttributes().build());
		event.put(KANATA_UBUYASHIKI.get(), KanataUbuyashikiEntity.createAttributes().build());
	}
}
