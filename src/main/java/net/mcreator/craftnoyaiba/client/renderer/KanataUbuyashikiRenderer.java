
package net.mcreator.craftnoyaiba.client.renderer;

public class KanataUbuyashikiRenderer extends HumanoidMobRenderer<KanataUbuyashikiEntity, HumanoidModel<KanataUbuyashikiEntity>> {

	public KanataUbuyashikiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(KanataUbuyashikiEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/kanata_ubuyashiki.png");
	}

}
