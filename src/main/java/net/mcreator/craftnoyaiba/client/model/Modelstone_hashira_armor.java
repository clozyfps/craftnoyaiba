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
public class Modelstone_hashira_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "modelstone_hashira_armor"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelstone_hashira_armor(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 6).addBox(-4.0F, 2.75F, 0.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.24F)).texOffs(15, 32)
						.addBox(-2.0F, 0.75F, 1.175F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(20, 0).addBox(-4.0F, 0.25F, 0.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.24F)).texOffs(0, 40)
						.addBox(-4.0F, 0.25F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.26F)).texOffs(25, 33).addBox(-2.0F, 0.275F, -1.7F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.23F)).texOffs(35, 33)
						.addBox(2.0F, 0.25F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.26F)).texOffs(20, 6).addBox(-4.0F, 6.75F, -2.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(40, 15)
						.addBox(-0.9167F, 7.0F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 0).addBox(-1.5F, -1.0833F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(40, 4).addBox(-1.5F, -0.9167F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(3.0F, 3.5833F, -1.8889F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 40).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-1.6935F, 4.1809F, -1.5969F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 40).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(1.6935F, 4.1809F, -1.6219F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 42).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.26F)),
				PartPose.offsetAndRotation(1.8447F, 6.0783F, -0.95F, 0.0F, 0.0F, 0.8727F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 34).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.26F)),
				PartPose.offsetAndRotation(-1.8447F, 6.0783F, -0.95F, 0.0F, 0.0F, -0.8727F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 41).mirror().addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)).mirror(false),
				PartPose.offsetAndRotation(2.3435F, 2.9309F, -2.0969F, -0.0744F, 0.158F, 0.0814F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-2.3435F, 2.9309F, -2.0969F, -0.0744F, -0.158F, -0.0814F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 4).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 10.0F, 1.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 22).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -1.5F, -0.6109F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(16, 11).addBox(-3.0F, -1.8F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.22F)).texOffs(0, 15).addBox(-3.0F, -1.05F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.12F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(16, 11).mirror().addBox(-1.0F, -1.8F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.22F)).mirror(false).texOffs(0, 15).mirror()
				.addBox(-1.0F, -1.05F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.12F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(24, 26).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 8).addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 21)
						.addBox(-2.1F, 1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 26).addBox(-2.1F, 6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.21F)).texOffs(36, 24)
						.addBox(-2.1F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition cube_r10 = RightLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.04F)),
				PartPose.offsetAndRotation(-1.45F, 7.5F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r11 = RightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 11).addBox(-2.0F, -2.2875F, -0.4125F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(-2.0125F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.0436F));
		PartDefinition cube_r12 = RightLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 19).addBox(-2.0F, -3.4036F, -1.1098F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.19F)),
				PartPose.offsetAndRotation(-2.0125F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.3054F));
		PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 24).addBox(-2.0F, 2.0199F, 1.0661F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.7625F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.6545F));
		PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(14, 42).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(1.9F, 0.5F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 11).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.9F, 6.0F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r16 = RightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(42, 13).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.9F, 6.0F, -1.75F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r17 = RightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(42, 22).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(1.9F, 0.5F, -1.75F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(24, 26).mirror().addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 8).mirror().addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(12, 21).mirror().addBox(-1.9F, 1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(0, 26).mirror().addBox(-1.9F, 6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.21F))
						.mirror(false).texOffs(36, 24).mirror().addBox(-1.9F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition cube_r18 = LeftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.04F)).mirror(false),
				PartPose.offsetAndRotation(1.45F, 7.5F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r19 = LeftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 11).mirror().addBox(-2.0F, -2.2875F, -0.4125F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(2.0125F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.0436F));
		PartDefinition cube_r20 = LeftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 19).mirror().addBox(-2.0F, -3.4036F, -1.1098F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.19F)).mirror(false),
				PartPose.offsetAndRotation(2.0125F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.3054F));
		PartDefinition cube_r21 = LeftLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 24).mirror().addBox(-2.0F, 2.0199F, 1.0661F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(1.7625F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.6545F));
		PartDefinition cube_r22 = LeftLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 42).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 0.5F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r23 = LeftLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(42, 11).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 6.0F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r24 = LeftLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(42, 13).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 6.0F, -1.75F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r25 = LeftLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(42, 22).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
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
		this.LeftArm.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
