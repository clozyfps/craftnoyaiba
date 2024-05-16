
package net.mcreator.craftnoyaiba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.craftnoyaiba.entity.FinalSelectionDemonEntity;

public class FinalSelectionDemonRenderer extends HumanoidMobRenderer<FinalSelectionDemonEntity, HumanoidModel<FinalSelectionDemonEntity>> {
	public FinalSelectionDemonRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(FinalSelectionDemonEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/demon1.png");
	}
}
