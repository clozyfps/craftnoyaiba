
package net.mcreator.craftnoyaiba.client.renderer;

public class FlamingThunderGodRenderer extends GeoEntityRenderer<FlamingThunderGodEntity> {
	public FlamingThunderGodRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FlamingThunderGodModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(FlamingThunderGodEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FlamingThunderGodEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 0.5f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}