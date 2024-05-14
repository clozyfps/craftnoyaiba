
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftnoyaiba.client.model.Modeluniform;
import net.mcreator.craftnoyaiba.client.model.Modeljigoro;
import net.mcreator.craftnoyaiba.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftnoyaibaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modeljigoro.LAYER_LOCATION, Modeljigoro::createBodyLayer);
		event.registerLayerDefinition(Modeluniform.LAYER_LOCATION, Modeluniform::createBodyLayer);
	}
}
