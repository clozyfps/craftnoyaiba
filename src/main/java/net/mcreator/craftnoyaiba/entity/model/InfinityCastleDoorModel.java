package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class InfinityCastleDoorModel extends GeoModel<InfinityCastleDoorEntity> {
	@Override
	public ResourceLocation getAnimationResource(InfinityCastleDoorEntity entity) {
		return new ResourceLocation("craftnoyaiba", "animations/door.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfinityCastleDoorEntity entity) {
		return new ResourceLocation("craftnoyaiba", "geo/door.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfinityCastleDoorEntity entity) {
		return new ResourceLocation("craftnoyaiba", "textures/entities/" + entity.getTexture() + ".png");
	}

}