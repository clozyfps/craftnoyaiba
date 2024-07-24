package net.mcreator.craftnoyaiba.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeluniform_long<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "modeluniform_long"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modeluniform_long(ModelPart root) {
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
				CubeListBuilder.create().texOffs(28, 6).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 0).addBox(-4.0F, 2.75F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 27)
						.addBox(-2.0F, 0.75F, 1.175F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(24, 0).addBox(-4.0F, 0.25F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.26F)).texOffs(24, 6)
						.addBox(-0.9167F, 2.3333F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(20, 0).addBox(-0.9167F, 4.6667F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(12, 11)
						.addBox(-0.9167F, 7.0F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(12, 39).addBox(0.75F, 2.6667F, -2.8889F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(38, 37)
						.addBox(0.75F, 2.5F, -2.8889F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(40, 19).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, -1.9167F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 12).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 1.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 14).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -1.5F, -0.6109F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(12, 25).addBox(-3.0F, -1.8F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.22F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r3 = RightArm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 51).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.25F, 3.4F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r4 = RightArm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 59).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.1216F, 8.1624F, -0.01F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(12, 25).mirror().addBox(-1.0F, -1.8F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.22F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r5 = LeftArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 51).mirror().addBox(-2.0F, -4.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(1.25F, 3.4F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 59).mirror().addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(1.1216F, 8.1624F, -0.01F, 0.0F, 0.0F, -0.1309F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22).addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 46)
						.addBox(-2.1F, 1.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(32, 16).addBox(-2.1F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 37).addBox(-2.0F, -2.5F, -0.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(-1.8344F, 5.2286F, 0.0F, 0.0F, 1.5708F, 0.0873F));
		PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(43, 43).addBox(-2.0F, -3.4036F, -1.1098F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.19F)),
				PartPose.offsetAndRotation(-2.0125F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.3054F));
		PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 30).addBox(-2.0F, 2.0199F, 1.0661F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.1125F, 5.2125F, 0.0F, 0.0F, 1.5708F, 0.6545F));
		PartDefinition cube_r10 = RightLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 43).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(1.9F, 0.5F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r11 = RightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 32).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.9F, 8.15F, 2.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r12 = RightLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 16).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.9F, 8.15F, -2.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(21, 43).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(1.9F, 0.5F, -1.75F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 22).mirror().addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(32, 16).mirror().addBox(-1.9F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(26, 46).mirror().addBox(-1.9F, 1.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.25F))
						.mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition cube_r14 = LeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(42, 16).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 8.15F, -2.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r15 = LeftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 8.15F, 2.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r16 = LeftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(28, 37).mirror().addBox(-2.0F, -2.5F, -0.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(1.8344F, 5.2286F, 0.0F, 0.0F, -1.5708F, -0.0873F));
		PartDefinition cube_r17 = LeftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 30).mirror().addBox(-2.0F, 2.0199F, 1.0661F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(2.1125F, 5.2125F, 0.0F, 0.0F, -1.5708F, -0.6545F));
		PartDefinition cube_r18 = LeftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(43, 43).mirror().addBox(-2.0F, -3.4036F, -1.1098F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.19F)).mirror(false),
				PartPose.offsetAndRotation(2.0125F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.3054F));
		PartDefinition cube_r19 = LeftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(11, 43).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 0.5F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r20 = LeftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(21, 43).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 0.5F, -1.75F, -0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
