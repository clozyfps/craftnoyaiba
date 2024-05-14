package net.mcreator.craftnoyaiba.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeluniform<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "modeluniform"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modeluniform(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 15).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -0.25F, -2.5F, 8.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(21, 10).addBox(2.65F, 10.0F, -2.475F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(21, 10)
						.addBox(-4.3333F, 10.0F, -2.475F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(21, 10).addBox(-2.3333F, 10.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
						.addBox(-1.5833F, 10.4583F, -2.5417F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8333F, 11.0F, -2.5417F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8333F, 11.0F, -2.5417F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 31).addBox(-4.0F, 1.5F, -1.5F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 0).addBox(-4.0F, 1.5F, -2.5F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(24, 17).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 49).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r5 = RightArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(-7.6833F, -9.85F, -1.95F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.85F, 10.8333F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 49).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 49).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(71, 26).addBox(5.6833F, -9.85F, -1.95F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.85F, 10.8333F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(40, 33).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 17)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(45, 3).addBox(-2.75F, 0.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(70, -2).mirror().addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 8.3333F, 3.1667F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, -2).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1333F, 8.3333F, 3.1667F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 55).addBox(-2.5F, -0.5F, -2.45F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, 0.8333F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 39).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 33)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(56, 14).addBox(-2.25F, 0.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(70, -2).mirror().addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.1333F, 8.3333F, 3.1667F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(70, -2).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 8.3333F, 3.1667F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(56, 25).addBox(1.5F, -0.5F, -2.45F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 0.8333F, 0.0F, 0.0F, 0.0F, -0.1745F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
