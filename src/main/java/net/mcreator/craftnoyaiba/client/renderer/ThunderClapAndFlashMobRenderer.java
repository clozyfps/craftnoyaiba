
package net.mcreator.craftnoyaiba.client.renderer;

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
