
package net.mcreator.craftnoyaiba.client.renderer;

public class KiriyaUbuyashikiRenderer extends HumanoidMobRenderer<KiriyaUbuyashikiEntity, HumanoidModel<KiriyaUbuyashikiEntity>> {

	public KiriyaUbuyashikiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(KiriyaUbuyashikiEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/kiriya_ubuyashiki.png");
	}

}
