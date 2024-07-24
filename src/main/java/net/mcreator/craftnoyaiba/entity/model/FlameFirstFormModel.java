package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnoyaiba.entity.FlameFirstFormEntity;

public class FlameFirstFormModel extends GeoModel<FlameFirstFormEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlameFirstFormEntity entity) {
		return new ResourceLocation("craftnoyaiba", "animations/1stformflame.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlameFirstFormEntity entity) {
		return new ResourceLocation("craftnoyaiba", "geo/1stformflame.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlameFirstFormEntity entity) {
		return new ResourceLocation("craftnoyaiba", "textures/entities/" + entity.getTexture() + ".png");
	}

}
