package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnoyaiba.entity.FlamingThunderGodEntity;

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
