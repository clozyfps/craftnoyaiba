package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class InfinityCastleDoorUpsideDownModel extends GeoModel<InfinityCastleDoorUpsideDownEntity> {
	@Override
	public ResourceLocation getAnimationResource(InfinityCastleDoorUpsideDownEntity entity) {
		return new ResourceLocation("craftnoyaiba", "animations/door.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfinityCastleDoorUpsideDownEntity entity) {
		return new ResourceLocation("craftnoyaiba", "geo/door.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfinityCastleDoorUpsideDownEntity entity) {
		return new ResourceLocation("craftnoyaiba", "textures/entities/" + entity.getTexture() + ".png");
	}

}