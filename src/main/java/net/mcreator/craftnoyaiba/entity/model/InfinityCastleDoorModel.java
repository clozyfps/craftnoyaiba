package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnoyaiba.entity.InfinityCastleDoorEntity;

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
