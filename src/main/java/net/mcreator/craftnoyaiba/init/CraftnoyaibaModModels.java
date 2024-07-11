
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftnoyaiba.client.model.Modeluniform;
import net.mcreator.craftnoyaiba.client.model.Modelstone;
import net.mcreator.craftnoyaiba.client.model.Modelslayer_uniform;
import net.mcreator.craftnoyaiba.client.model.Modelopendoor;
import net.mcreator.craftnoyaiba.client.model.Modelkokushibo_robes;
import net.mcreator.craftnoyaiba.client.model.Modeljigoro;
import net.mcreator.craftnoyaiba.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftnoyaibaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelopendoor.LAYER_LOCATION, Modelopendoor::createBodyLayer);
		event.registerLayerDefinition(Modeluniform.LAYER_LOCATION, Modeluniform::createBodyLayer);
		event.registerLayerDefinition(Modelslayer_uniform.LAYER_LOCATION, Modelslayer_uniform::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modeljigoro.LAYER_LOCATION, Modeljigoro::createBodyLayer);
		event.registerLayerDefinition(Modelkokushibo_robes.LAYER_LOCATION, Modelkokushibo_robes::createBodyLayer);
		event.registerLayerDefinition(Modelstone.LAYER_LOCATION, Modelstone::createBodyLayer);
	}
}
