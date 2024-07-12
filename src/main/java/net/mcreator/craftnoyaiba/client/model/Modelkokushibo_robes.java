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
public class Modelkokushibo_robes<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "modelkokushibo_robes"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelkokushibo_robes(ModelPart root) {
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
				CubeListBuilder.create().texOffs(54, 42).addBox(-4.0F, 10.0F, -0.6667F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(44, 28).addBox(-4.0F, 10.0F, 0.3333F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).texOffs(0, 75)
						.addBox(2.0F, -0.0183F, -2.1136F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.011F)).texOffs(6, 75).addBox(-4.0F, -0.0183F, -2.1136F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.011F)).texOffs(0, 59)
						.addBox(-4.0769F, 0.0067F, -1.4698F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.011F)).texOffs(8, 59).addBox(3.0769F, 0.0067F, -1.4698F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.011F)).texOffs(0, 32)
						.addBox(-4.0F, -0.0183F, -0.8864F, 8.0F, 10.0F, 3.0F, new CubeDeformation(0.011F)).texOffs(48, 0).addBox(-4.0F, 3.9817F, -2.1136F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)).texOffs(48, 7)
						.addBox(-4.0F, 10.0F, -2.3333F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 37).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 12.6193F, -2.8307F, -0.0807F, -0.0334F, -0.3914F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 50).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 11.3333F, -2.3333F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 32).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 12.6193F, -2.9186F, -0.0807F, 0.0334F, 0.3914F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 13).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 9.8333F, -1.8333F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 11).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 9.8333F, 1.8333F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 71).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-2.1299F, 1.7782F, -1.6136F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 70).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-1.4633F, 1.7782F, -1.5256F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 15).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.9633F, 2.6442F, -1.5067F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(74, 22).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-1.6935F, 2.6809F, -1.7969F, 0.0F, -0.1745F, -0.5236F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 72).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(1.6935F, 2.6809F, -1.7969F, 0.0F, 0.1745F, 0.5236F));
		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 70).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(2.1299F, 1.7782F, -1.6136F, 0.0F, 0.0F, 0.5236F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(16, 50).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition part_r1 = RightArm.addOrReplaceChild("part_r1", CubeListBuilder.create().texOffs(66, 38).addBox(-2.0F, 0.6747F, 0.2167F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)),
				PartPose.offsetAndRotation(-2.9994F, 5.1631F, 0.012F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition part_r2 = RightArm.addOrReplaceChild("part_r2", CubeListBuilder.create().texOffs(67, 74).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)),
				PartPose.offsetAndRotation(-1.055F, 6.9835F, -2.0202F, 0.3927F, 0.0F, 0.0F));
		PartDefinition part_r3 = RightArm.addOrReplaceChild("part_r3", CubeListBuilder.create().texOffs(66, 31).addBox(-2.0F, -1.1913F, -0.2833F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)),
				PartPose.offsetAndRotation(-2.9994F, 5.1631F, 0.012F, 0.0F, 1.5708F, -3.0107F));
		PartDefinition part_r4 = RightArm.addOrReplaceChild("part_r4", CubeListBuilder.create().texOffs(51, 67).addBox(-2.0F, -4.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)),
				PartPose.offsetAndRotation(-1.055F, 2.349F, -1.8472F, 0.1309F, 0.0F, -3.1416F));
		PartDefinition part_r5 = RightArm.addOrReplaceChild("part_r5", CubeListBuilder.create().texOffs(51, 67).addBox(-2.0F, -4.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)),
				PartPose.offsetAndRotation(-1.055F, 2.349F, 1.8472F, -0.1309F, 0.0F, -3.1416F));
		PartDefinition part_r6 = RightArm.addOrReplaceChild("part_r6", CubeListBuilder.create().texOffs(67, 74).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)),
				PartPose.offsetAndRotation(-1.055F, 6.9835F, 2.0202F, -0.3927F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(16, 50).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition part_r7 = LeftArm.addOrReplaceChild("part_r7", CubeListBuilder.create().texOffs(67, 74).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)).mirror(false),
				PartPose.offsetAndRotation(1.055F, 6.9835F, -2.0202F, 0.3927F, 0.0F, 0.0F));
		PartDefinition part_r8 = LeftArm.addOrReplaceChild("part_r8", CubeListBuilder.create().texOffs(51, 67).mirror().addBox(-2.0F, -4.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)).mirror(false),
				PartPose.offsetAndRotation(1.055F, 2.349F, -1.8472F, 0.1309F, 0.0F, 3.1416F));
		PartDefinition part_r9 = LeftArm.addOrReplaceChild("part_r9", CubeListBuilder.create().texOffs(51, 67).mirror().addBox(-2.0F, -4.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)).mirror(false),
				PartPose.offsetAndRotation(1.055F, 2.349F, 1.8472F, -0.1309F, 0.0F, 3.1416F));
		PartDefinition part_r10 = LeftArm.addOrReplaceChild("part_r10", CubeListBuilder.create().texOffs(67, 74).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)).mirror(false),
				PartPose.offsetAndRotation(1.055F, 6.9835F, 2.0202F, -0.3927F, 0.0F, 0.0F));
		PartDefinition part_r11 = LeftArm.addOrReplaceChild("part_r11", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(-2.0F, -1.1913F, -0.2833F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)).mirror(false),
				PartPose.offsetAndRotation(2.9994F, 5.1631F, 0.012F, 0.0F, -1.5708F, 3.0107F));
		PartDefinition part_r12 = LeftArm.addOrReplaceChild("part_r12", CubeListBuilder.create().texOffs(66, 38).mirror().addBox(-2.0F, 0.6747F, 0.2167F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)).mirror(false),
				PartPose.offsetAndRotation(2.9994F, 5.1631F, 0.012F, 0.0F, 1.5708F, 0.3927F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(22, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 72).addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition part_r13 = RightLeg.addOrReplaceChild("part_r13", CubeListBuilder.create().texOffs(54, 37).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.05F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition part_r14 = RightLeg.addOrReplaceChild("part_r14", CubeListBuilder.create().texOffs(10, 72).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.04F, 7.3665F, -2.1064F, 0.7418F, 0.0F, 0.0F));
		PartDefinition part_r15 = RightLeg.addOrReplaceChild("part_r15", CubeListBuilder.create().texOffs(31, 63).addBox(-2.0F, -5.0224F, -0.7435F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.04F, 5.0942F, -2.1582F, -0.1309F, 0.0F, 0.0F));
		PartDefinition part_r16 = RightLeg.addOrReplaceChild("part_r16", CubeListBuilder.create().texOffs(67, 71).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.04F, 7.3665F, 2.1064F, -0.7418F, 0.0F, 0.0F));
		PartDefinition part_r17 = RightLeg.addOrReplaceChild("part_r17", CubeListBuilder.create().texOffs(60, 15).addBox(-2.0F, -5.0224F, -0.2565F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.04F, 5.0942F, 2.1582F, 0.1309F, 0.0F, 0.0F));
		PartDefinition part_r18 = RightLeg.addOrReplaceChild("part_r18", CubeListBuilder.create().texOffs(74, 10).addBox(-2.0F, 0.4378F, 0.7533F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-2.0855F, 5.4598F, -0.0176F, 0.0F, -1.5708F, -0.7025F));
		PartDefinition part_r19 = RightLeg.addOrReplaceChild("part_r19", CubeListBuilder.create().texOffs(64, 23).addBox(-2.0F, -5.3843F, -0.2042F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-2.0855F, 5.4598F, -0.0176F, 0.0F, -1.5708F, 0.1702F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(22, 34).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 72).mirror()
				.addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition part_r20 = LeftLeg.addOrReplaceChild("part_r20", CubeListBuilder.create().texOffs(54, 37).mirror().addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(-0.05F, 9.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition part_r21 = LeftLeg.addOrReplaceChild("part_r21", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.04F, 7.3665F, -2.1064F, 0.7418F, 0.0F, 0.0F));
		PartDefinition part_r22 = LeftLeg.addOrReplaceChild("part_r22", CubeListBuilder.create().texOffs(31, 63).mirror().addBox(-2.0F, -5.0224F, -0.7435F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.04F, 5.0942F, -2.1582F, -0.1309F, 0.0F, 0.0F));
		PartDefinition part_r23 = LeftLeg.addOrReplaceChild("part_r23", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.04F, 7.3665F, 2.1064F, -0.7418F, 0.0F, 0.0F));
		PartDefinition part_r24 = LeftLeg.addOrReplaceChild("part_r24", CubeListBuilder.create().texOffs(60, 15).mirror().addBox(-2.0F, -5.0224F, -0.2565F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.04F, 5.0942F, 2.1582F, 0.1309F, 0.0F, 0.0F));
		PartDefinition part_r25 = LeftLeg.addOrReplaceChild("part_r25", CubeListBuilder.create().texOffs(74, 10).mirror().addBox(-2.0F, 0.4378F, 0.7533F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(2.0855F, 5.4598F, -0.0176F, 0.0F, 1.5708F, 0.7025F));
		PartDefinition part_r26 = LeftLeg.addOrReplaceChild("part_r26", CubeListBuilder.create().texOffs(64, 23).mirror().addBox(-2.0F, -5.3843F, -0.2042F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(2.0855F, 5.4598F, -0.0176F, 0.0F, 1.5708F, -0.1702F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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
