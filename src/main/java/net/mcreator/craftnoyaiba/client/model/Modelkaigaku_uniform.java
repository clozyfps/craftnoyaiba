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
public class Modelkaigaku_uniform<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "modelkaigaku_uniform"), "main");
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelkaigaku_uniform(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(16, 46).addBox(2.25F, 11.5F, -2.9F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.2F)).texOffs(25, 23)
						.addBox(-1.5F, 0.75F, -1.75F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(41, 41).addBox(-4.0F, 2.75F, -2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(10, 38)
						.addBox(2.0F, 2.75F, -2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(39, 22).addBox(-2.0F, 0.75F, 1.175F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(49, 28)
						.addBox(-4.0F, 0.25F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.26F)).texOffs(24, 15).addBox(2.0F, 0.25F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.26F)).texOffs(20, 0)
						.addBox(-4.0F, 0.25F, 0.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.24F)).texOffs(16, 6).addBox(-4.0F, 2.75F, 0.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.24F)).texOffs(49, 24)
						.addBox(-0.9167F, 2.3333F, -2.6639F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(47, 48).addBox(-0.9167F, 4.6667F, -2.6639F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(18, 26).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5F, 0.8355F, -1.6748F, 0.4752F, 0.3931F, 0.1946F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(18, 26).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 0.8355F, -1.6748F, 0.4752F, -0.3931F, -0.1946F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 48).mirror().addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.011F)).mirror(false),
				PartPose.offsetAndRotation(2.7907F, 2.7673F, -2.0734F, -0.0879F, 0.151F, -0.0067F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(49, 40).mirror().addBox(-1.0F, -2.5F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.011F)).mirror(false),
				PartPose.offsetAndRotation(2.08F, 7.4252F, -2.4218F, -0.0456F, 0.1685F, 0.2579F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 48).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-2.7907F, 2.7673F, -2.0734F, -0.0879F, -0.151F, 0.0067F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 40).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-2.08F, 7.4252F, -2.4218F, -0.0456F, -0.1685F, -0.2579F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(3.0F, 6.5F, -0.975F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 5).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-3.0F, 6.5F, -0.975F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 52).mirror().addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(1.1F, 5.825F, -1.05F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 52).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-1.05F, 5.825F, -1.05F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 52).mirror().addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 3.675F, -0.55F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 52).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.85F, 3.675F, -0.55F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 32).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 9.75F, 1.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 15).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 9.5F, -1.75F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(8, 47).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(3.9981F, 12.4F, -2.2314F, -0.0395F, -0.0473F, -0.0892F));
		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 35).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.7519F, 12.4F, -2.2314F, -0.0395F, 0.0473F, 0.0892F));
		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 10).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(3.25F, 10.25F, -1.75F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 62).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.55F, 10.375F, -2.15F, 0.0F, 0.0F, 0.0218F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(12, 15).mirror().addBox(-1.0F, -1.8F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.22F)).mirror(false).texOffs(0, 22).mirror()
				.addBox(-1.0F, 4.95F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.12F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r17 = LeftArm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(1.0F, -4.0F, -2.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(0.75F, 3.15F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r18 = LeftArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.12F)).mirror(false),
				PartPose.offsetAndRotation(2.25F, 6.7F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(36, 10).mirror().addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 4.7F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, -1.8F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.22F)).texOffs(0, 22).addBox(-3.0F, 4.95F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.12F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r20 = RightArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 0).addBox(-3.0F, -4.0F, -2.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.75F, 3.15F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r21 = RightArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.12F)),
				PartPose.offsetAndRotation(-2.25F, 6.7F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r22 = RightArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 10).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-1.5F, 4.7F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(28, 15).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition part_r1 = RightLeg.addOrReplaceChild("part_r1", CubeListBuilder.create().texOffs(30, 44).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.9526F, 8.7021F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition part_r2 = RightLeg.addOrReplaceChild("part_r2", CubeListBuilder.create().texOffs(18, 34).addBox(0.0F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-2.4483F, -0.0228F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition part_r3 = RightLeg.addOrReplaceChild("part_r3", CubeListBuilder.create().texOffs(33, 31).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(2.2483F, -0.0228F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition part_r4 = RightLeg.addOrReplaceChild("part_r4", CubeListBuilder.create().texOffs(43, 34).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(1.7526F, 8.7021F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition part_r5 = RightLeg.addOrReplaceChild("part_r5", CubeListBuilder.create().texOffs(24, 42).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.1F, 8.7021F, 1.8526F, -1.5708F, 1.1781F, -1.5708F));
		PartDefinition part_r6 = RightLeg.addOrReplaceChild("part_r6", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.1F, -0.0228F, 2.3483F, 1.5708F, 1.5272F, 1.5708F));
		PartDefinition part_r7 = RightLeg.addOrReplaceChild("part_r7", CubeListBuilder.create().texOffs(12, 26).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.1F, -0.0228F, -2.3483F, -1.5708F, 1.5272F, -1.5708F));
		PartDefinition part_r8 = RightLeg.addOrReplaceChild("part_r8", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.1F, 8.7021F, -1.8526F, 1.5708F, 1.1781F, 1.5708F));
		PartDefinition part_r9 = RightLeg.addOrReplaceChild("part_r9", CubeListBuilder.create().texOffs(0, 6).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 12.0F, -2.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(28, 15).mirror().addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 19).mirror()
				.addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition part_r10 = LeftLeg.addOrReplaceChild("part_r10", CubeListBuilder.create().texOffs(30, 44).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(1.9526F, 8.7021F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition part_r11 = LeftLeg.addOrReplaceChild("part_r11", CubeListBuilder.create().texOffs(18, 34).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(2.4483F, -0.0228F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition part_r12 = LeftLeg.addOrReplaceChild("part_r12", CubeListBuilder.create().texOffs(33, 31).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-2.2483F, -0.0228F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition part_r13 = LeftLeg.addOrReplaceChild("part_r13", CubeListBuilder.create().texOffs(43, 34).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-1.7526F, 8.7021F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition part_r14 = LeftLeg.addOrReplaceChild("part_r14", CubeListBuilder.create().texOffs(24, 42).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 8.7021F, 1.8526F, -1.5708F, -1.1781F, 1.5708F));
		PartDefinition part_r15 = LeftLeg.addOrReplaceChild("part_r15", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, -0.0228F, 2.3483F, 1.5708F, -1.5272F, -1.5708F));
		PartDefinition part_r16 = LeftLeg.addOrReplaceChild("part_r16", CubeListBuilder.create().texOffs(12, 26).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, -0.0228F, -2.3483F, -1.5708F, -1.5272F, 1.5708F));
		PartDefinition part_r17 = LeftLeg.addOrReplaceChild("part_r17", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 8.7021F, -1.8526F, 1.5708F, -1.1781F, -1.5708F));
		PartDefinition part_r18 = LeftLeg.addOrReplaceChild("part_r18", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(0.0F, -12.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 12.0F, -2.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
