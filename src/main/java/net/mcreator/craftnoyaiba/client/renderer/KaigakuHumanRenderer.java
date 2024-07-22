
package net.mcreator.craftnoyaiba.client.renderer;

public class KaigakuHumanRenderer extends HumanoidMobRenderer<KaigakuHumanEntity, HumanoidModel<KaigakuHumanEntity>> {

	public KaigakuHumanRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(KaigakuHumanEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/kaigaku.png");
	}

}
