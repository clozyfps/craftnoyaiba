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
public class Modelflashy_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "modelflashy_armor"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelflashy_armor(ModelPart root) {
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
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 60).addBox(-4.0F, -1.5F, -0.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.5F, -4.5F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(4.1988F, -4.4223F, -4.3333F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.8012F, -4.7556F, -5.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.8654F, -6.089F, -5.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(-3.9148F, -3.404F, -4.3333F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(-3.9148F, -2.7813F, -4.3333F, 0.0F, 0.3491F, 0.0436F));
		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(-3.9148F, -2.1769F, -4.3333F, 0.0057F, -0.1308F, -0.0004F));
		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(2.7519F, -6.5102F, -5.0F, 0.0057F, -0.1308F, -0.0004F));
		PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(3.4185F, -5.5102F, -4.75F, 0.0556F, -0.1186F, -0.396F));
		PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(2.0852F, -5.1769F, -4.75F, 0.0556F, -0.1186F, -0.396F));
		PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-2.5815F, -5.1769F, -4.75F, 0.0556F, -0.1186F, -0.396F));
		PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(-3.9148F, -1.5615F, -4.2015F, 0.2692F, -0.698F, -0.0044F));
		PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(4.1548F, -3.7996F, -4.2454F, 0.0572F, -0.8247F, 0.0879F));
		PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(4.1548F, -3.1842F, -4.2454F, 0.153F, 0.4613F, 0.2892F));
		PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.66F)),
				PartPose.offsetAndRotation(4.1548F, -2.5871F, -4.2454F, 0.025F, 0.0942F, -0.1021F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 17).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 0).addBox(-4.0F, 2.75F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 30)
						.addBox(-2.0F, 0.75F, 1.175F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(0, 11).addBox(-4.0F, 0.25F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.26F)).texOffs(24, 28)
						.addBox(-0.9167F, 2.3333F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(12, 23).addBox(-0.9167F, 4.6667F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(20, 0)
						.addBox(-0.9167F, 7.0F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(32, 33).addBox(0.75F, 2.6667F, -2.8889F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(32, 19)
						.addBox(0.75F, 2.5F, -2.8889F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(36, 0).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, -1.9167F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(20, 17).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 1.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 15).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -1.5F, -0.6109F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(20, 7).addBox(-3.0F, 6.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.026F)).texOffs(28, 28)
				.addBox(-3.0F, 5.6667F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.24F)).texOffs(12, 28).addBox(-3.0F, 0.6667F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.26F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r18 = RightArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 34).addBox(-2.5F, 2.1871F, -1.8847F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.0833F, -0.4629F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition cube_r19 = RightArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(36, 3).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.1667F, -2.25F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r20 = RightArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(20, 35).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.1667F, 2.25F, -0.2618F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(20, 7).mirror().addBox(-1.0F, 6.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.026F)).mirror(false).texOffs(28, 28).mirror()
						.addBox(-1.0F, 5.6667F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.24F)).mirror(false).texOffs(12, 28).mirror().addBox(-1.0F, 0.6667F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.26F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r21 = LeftArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(19, 34).mirror().addBox(-1.5F, 2.1871F, -1.8847F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 2.0833F, -0.4629F, 0.0F, -1.5708F, 0.2618F));
		PartDefinition cube_r22 = LeftArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 3).mirror().addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 5.1667F, -2.25F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r23 = LeftArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(20, 35).mirror().addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 5.1667F, 2.25F, -0.2618F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(24, 0).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 10).addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
						.addBox(-2.1F, 1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 23).addBox(-2.1F, 6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.21F)).texOffs(32, 7)
						.addBox(-2.1F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition cube_r24 = RightLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(24, 33).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.04F)),
				PartPose.offsetAndRotation(-1.45F, 7.5F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r25 = RightLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(10, 34).addBox(-2.0F, -2.2875F, -0.4125F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(-2.0125F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.0436F));
		PartDefinition cube_r26 = RightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(36, 23).addBox(-2.0F, -3.4036F, -1.1098F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.19F)),
				PartPose.offsetAndRotation(-2.0125F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.3054F));
		PartDefinition cube_r27 = RightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 13).addBox(-2.0F, 2.0199F, 1.0661F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.7625F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.6545F));
		PartDefinition cube_r28 = RightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(38, 17).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(1.9F, 0.5F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r29 = RightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 25).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.9F, 6.0F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r30 = RightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(36, 37).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.9F, 6.0F, -1.75F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r31 = RightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(35, 39).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(1.9F, 0.5F, -1.75F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 10).mirror().addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(20, 19).mirror().addBox(-1.9F, 1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(0, 23).mirror().addBox(-1.9F, 6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.21F))
						.mirror(false).texOffs(32, 7).mirror().addBox(-1.9F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition cube_r32 = LeftLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(24, 33).mirror().addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.04F)).mirror(false),
				PartPose.offsetAndRotation(1.45F, 7.5F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r33 = LeftLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(10, 34).mirror().addBox(-2.0F, -2.2875F, -0.4125F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(2.0125F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.0436F));
		PartDefinition cube_r34 = LeftLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(36, 23).mirror().addBox(-2.0F, -3.4036F, -1.1098F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.19F)).mirror(false),
				PartPose.offsetAndRotation(2.0125F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.3054F));
		PartDefinition cube_r35 = LeftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(36, 13).mirror().addBox(-2.0F, 2.0199F, 1.0661F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(1.7625F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.6545F));
		PartDefinition cube_r36 = LeftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(38, 17).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 0.5F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r37 = LeftLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(36, 25).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 6.0F, 1.75F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r38 = LeftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(36, 37).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 6.0F, -1.75F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r39 = LeftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(35, 39).mirror().addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 0.5F, -1.75F, -0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
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
