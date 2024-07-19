package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class ZenitsuAgatsumaModel extends GeoModel<ZenitsuAgatsumaEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZenitsuAgatsumaEntity entity) {
		return new ResourceLocation("craftnoyaiba", "animations/zenitsu_sleepy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZenitsuAgatsumaEntity entity) {
		return new ResourceLocation("craftnoyaiba", "geo/zenitsu_sleepy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZenitsuAgatsumaEntity entity) {
		return new ResourceLocation("craftnoyaiba", "textures/entities/" + entity.getTexture() + ".png");
	}

}