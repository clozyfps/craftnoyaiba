package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class FlamingThunderGodModel extends GeoModel<FlamingThunderGodEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlamingThunderGodEntity entity) {
		return new ResourceLocation("craftnoyaiba", "animations/flamingthundergod.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlamingThunderGodEntity entity) {
		return new ResourceLocation("craftnoyaiba", "geo/flamingthundergod.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlamingThunderGodEntity entity) {
		return new ResourceLocation("craftnoyaiba", "textures/entities/" + entity.getTexture() + ".png");
	}

}