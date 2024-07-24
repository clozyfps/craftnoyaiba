
package net.mcreator.craftnoyaiba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.craftnoyaiba.entity.ThunderClapAndFlashMobEntity;

public class ThunderClapAndFlashMobRenderer extends HumanoidMobRenderer<ThunderClapAndFlashMobEntity, HumanoidModel<ThunderClapAndFlashMobEntity>> {
	public ThunderClapAndFlashMobRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ThunderClapAndFlashMobEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/a2i2e_layer_2.png");
	}
}
