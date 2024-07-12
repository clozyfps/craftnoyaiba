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
public class Modelflashy_hashiraarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "modelflashy_hashiraarmor"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelflashy_hashiraarmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 71).addBox(-4.0F, -1.5F, -0.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.5F, -4.5F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 48).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(4.1988F, -4.4223F, -4.3333F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 48).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.8012F, -4.7556F, -5.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 48).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.8654F, -6.089F, -5.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 19).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(-3.9148F, -3.404F, -4.3333F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 3).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(-3.9148F, -2.7813F, -4.3333F, 0.0F, 0.3491F, 0.0436F));
		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(-3.9148F, -2.1769F, -4.3333F, 0.0057F, -0.1308F, -0.0004F));
		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(2.7519F, -6.5102F, -5.0F, 0.0057F, -0.1308F, -0.0004F));
		PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(3.4185F, -5.5102F, -4.75F, 0.0556F, -0.1186F, -0.396F));
		PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(2.0852F, -5.1769F, -4.75F, 0.0556F, -0.1186F, -0.396F));
		PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-2.5815F, -5.1769F, -4.75F, 0.0556F, -0.1186F, -0.396F));
		PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(-3.9148F, -1.5615F, -4.2015F, 0.2692F, -0.698F, -0.0044F));
		PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 44).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(4.1548F, -3.7996F, -4.2454F, 0.0572F, -0.8247F, 0.0879F));
		PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 16).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(4.1548F, -3.1842F, -4.2454F, 0.153F, 0.4613F, 0.2892F));
		PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(20, 32).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(4.1548F, -2.5871F, -4.2454F, 0.025F, 0.0942F, -0.1021F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 0).addBox(-4.0F, 10.0F, 0.3407F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).texOffs(72, 45)
						.addBox(-4.0F, 10.0F, -0.326F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(68, 56).addBox(-4.0F, 10.0F, -2.3333F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).texOffs(64, 16)
						.addBox(-4.0F, 0.0F, 1.5927F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(0, 32).addBox(-0.4167F, 7.3333F, -2.4973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).texOffs(0, 50)
						.addBox(-0.4167F, 4.6667F, -2.4973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).texOffs(52, 0).addBox(1.5833F, 2.6667F, -2.4973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 2)
						.addBox(-0.4167F, 2.0F, -2.4973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).texOffs(20, 44).addBox(-4.0F, 0.0F, -2.4093F, 8.0F, 10.0F, 4.0F, new CubeDeformation(0.001F)).texOffs(28, 28)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 48).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0001F)),
				PartPose.offsetAndRotation(0.0F, 9.5955F, -2.0951F, -0.5236F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(24, 0).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, -1.9167F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(72, 50).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0001F)),
				PartPose.offsetAndRotation(0.0F, 9.6834F, 2.139F, 0.5236F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(68, 27).addBox(-3.0F, 6.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.026F)).texOffs(72, 35)
				.addBox(-3.0F, 5.6667F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.26F)).texOffs(72, 4).addBox(-3.0F, 0.6667F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.26F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r18 = RightArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(24, 23).addBox(-2.5F, 2.1871F, -1.8847F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.0833F, -0.4629F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition cube_r19 = RightArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 26).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.1667F, -2.25F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r20 = RightArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 27).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.1667F, 2.25F, -0.2618F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(60, 48).addBox(-1.0F, 6.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.026F)).texOffs(72, 10)
				.addBox(-1.0F, 5.6667F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.26F)).texOffs(44, 70).addBox(-1.0F, 0.6667F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.26F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r21 = LeftArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(24, 7).addBox(-1.5F, 2.1871F, -1.8847F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 2.0833F, -0.4629F, 0.0F, -1.5708F, 0.2618F));
		PartDefinition cube_r22 = LeftArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 27).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.1667F, -2.25F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r23 = LeftArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 26).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.1667F, 2.25F, -0.2618F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(56, 56).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 16).addBox(-2.0F, 4.0F, -2.7363F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 40)
						.addBox(-2.0879F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(32, 16).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(56, 0)
						.addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 18.0F, 0.0F));
		PartDefinition part_r1 = RightLeg.addOrReplaceChild("part_r1", CubeListBuilder.create().texOffs(72, 65).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-0.01F, -4.42F, -1.8681F, -0.2182F, 0.0F, 0.0F));
		PartDefinition part_r2 = RightLeg.addOrReplaceChild("part_r2", CubeListBuilder.create().texOffs(76, 52).addBox(-2.0F, 2.0F, 2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-0.01F, -3.1606F, -5.4528F, 0.3491F, 0.0F, 0.0F));
		PartDefinition part_r3 = RightLeg.addOrReplaceChild("part_r3", CubeListBuilder.create().texOffs(70, 78).addBox(-2.0F, 0.7792F, 0.1801F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-2.047F, -3.1011F, -0.01F, 0.0F, -1.5708F, -0.3491F));
		PartDefinition part_r4 = RightLeg.addOrReplaceChild("part_r4", CubeListBuilder.create().texOffs(20, 74).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-1.9763F, -3.9318F, -0.01F, 0.0F, -1.5708F, 0.2182F));
		PartDefinition part_r5 = RightLeg.addOrReplaceChild("part_r5", CubeListBuilder.create().texOffs(72, 60).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-0.01F, -4.42F, 1.8681F, 0.2182F, 0.0F, 0.0F));
		PartDefinition part_r6 = RightLeg.addOrReplaceChild("part_r6", CubeListBuilder.create().texOffs(40, 76).addBox(-2.0F, 2.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-0.01F, -3.1606F, 5.4528F, -0.3491F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(56, 56).mirror().addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 16).mirror()
						.addBox(-2.0F, 4.0F, -2.7363F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 40).mirror().addBox(-1.9121F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(32, 16)
						.mirror().addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(56, 0).mirror().addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offset(1.9F, 18.0F, 0.0F));
		PartDefinition part_r7 = LeftLeg.addOrReplaceChild("part_r7", CubeListBuilder.create().texOffs(72, 65).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, -4.42F, -1.8681F, -0.2182F, 0.0F, 0.0F));
		PartDefinition part_r8 = LeftLeg.addOrReplaceChild("part_r8", CubeListBuilder.create().texOffs(76, 52).mirror().addBox(-2.0F, 2.0F, 2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, -3.1606F, -5.4528F, 0.3491F, 0.0F, 0.0F));
		PartDefinition part_r9 = LeftLeg.addOrReplaceChild("part_r9", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-2.0F, 0.7792F, 0.1801F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offsetAndRotation(2.047F, -3.1011F, -0.01F, 0.0F, 1.5708F, 0.3491F));
		PartDefinition part_r10 = LeftLeg.addOrReplaceChild("part_r10", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offsetAndRotation(1.9763F, -3.9318F, -0.01F, 0.0F, 1.5708F, -0.2182F));
		PartDefinition part_r11 = LeftLeg.addOrReplaceChild("part_r11", CubeListBuilder.create().texOffs(72, 60).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, -4.42F, 1.8681F, 0.2182F, 0.0F, 0.0F));
		PartDefinition part_r12 = LeftLeg.addOrReplaceChild("part_r12", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(-2.0F, 2.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, -3.1606F, 5.4528F, -0.3491F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
