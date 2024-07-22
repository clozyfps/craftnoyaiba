
package net.mcreator.craftnoyaiba.client.renderer;

public class JigoroKuwajimaRenderer extends MobRenderer<JigoroKuwajimaEntity, Modeljigoro<JigoroKuwajimaEntity>> {

	public JigoroKuwajimaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljigoro(context.bakeLayer(Modeljigoro.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(JigoroKuwajimaEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/jigoronew.png");
	}

}
