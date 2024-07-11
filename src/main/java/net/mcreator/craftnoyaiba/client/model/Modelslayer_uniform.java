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
public class Modelslayer_uniform<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "modelslayer_uniform"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelslayer_uniform(ModelPart root) {
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
				CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, 0.0006F, 1.1136F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.011F)).texOffs(0, 60).addBox(-0.9167F, 7.0F, -2.6639F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(0, 60)
						.addBox(-0.9167F, 4.6667F, -2.6639F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(13, 60).addBox(0.75F, 2.6667F, -2.6389F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(13, 60)
						.addBox(0.75F, 2.0F, -2.6389F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(0, 60).addBox(-0.9167F, 2.3333F, -2.6639F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(0, 0)
						.addBox(-4.0F, -0.0183F, -2.1136F, 8.0F, 10.0F, 4.0F, new CubeDeformation(0.011F)).texOffs(0, 27).addBox(-4.0F, 10.0F, 0.3407F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).texOffs(32, 23)
						.addBox(-4.0F, 10.0F, -0.326F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(20, 27).addBox(-4.0F, 10.0F, -2.3333F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 37).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 9.8333F, -1.8333F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 37).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 9.8333F, 1.8333F, -0.6109F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(44, 31).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, -1.9167F, 0.4363F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(32, 17).addBox(-3.0F, 6.3333F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)).texOffs(16, 14).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.02F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition part_r1 = RightArm.addOrReplaceChild("part_r1", CubeListBuilder.create().texOffs(20, 51).addBox(-2.0F, 0.6747F, 0.2167F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)),
				PartPose.offsetAndRotation(-2.8676F, 4.1631F, 0.012F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition part_r2 = RightArm.addOrReplaceChild("part_r2", CubeListBuilder.create().texOffs(26, 39).addBox(-2.0F, -1.1913F, -0.2833F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)),
				PartPose.offsetAndRotation(-2.8676F, 4.1631F, 0.012F, 0.0F, 1.5708F, -3.0107F));
		PartDefinition part_r3 = RightArm.addOrReplaceChild("part_r3", CubeListBuilder.create().texOffs(10, 51).addBox(-2.0F, 0.6747F, 0.2167F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)),
				PartPose.offsetAndRotation(-0.9115F, 4.1631F, 1.9241F, -0.3927F, 0.0F, 0.0F));
		PartDefinition part_r4 = RightArm.addOrReplaceChild("part_r4", CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, -1.1913F, -0.2833F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)),
				PartPose.offsetAndRotation(-0.9115F, 4.1631F, 1.9241F, -0.1309F, 0.0F, -3.1416F));
		PartDefinition part_r5 = RightArm.addOrReplaceChild("part_r5", CubeListBuilder.create().texOffs(49, 50).addBox(-2.0F, 0.6747F, -1.2167F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)),
				PartPose.offsetAndRotation(-0.9115F, 4.1631F, -1.9241F, 0.3927F, 0.0F, 0.0F));
		PartDefinition part_r6 = RightArm.addOrReplaceChild("part_r6", CubeListBuilder.create().texOffs(42, 7).addBox(-2.0F, -1.1913F, -0.7167F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)),
				PartPose.offsetAndRotation(-0.9115F, 4.1631F, -1.9241F, 0.1309F, 0.0F, -3.1416F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 17).mirror().addBox(-1.0F, 6.3333F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false).texOffs(16, 14).mirror()
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition part_r7 = LeftArm.addOrReplaceChild("part_r7", CubeListBuilder.create().texOffs(20, 51).mirror().addBox(-2.0F, 0.6747F, 0.2167F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)).mirror(false),
				PartPose.offsetAndRotation(2.8676F, 4.1631F, 0.012F, 0.0F, 1.5708F, 0.3927F));
		PartDefinition part_r8 = LeftArm.addOrReplaceChild("part_r8", CubeListBuilder.create().texOffs(26, 39).mirror().addBox(-2.0F, -1.1913F, -0.2833F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)).mirror(false),
				PartPose.offsetAndRotation(2.8676F, 4.1631F, 0.012F, 0.0F, -1.5708F, 3.0107F));
		PartDefinition part_r9 = LeftArm.addOrReplaceChild("part_r9", CubeListBuilder.create().texOffs(10, 51).mirror().addBox(-2.0F, 0.6747F, 0.2167F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)).mirror(false),
				PartPose.offsetAndRotation(0.9115F, 4.1631F, 1.9241F, -0.3927F, 0.0F, 0.0F));
		PartDefinition part_r10 = LeftArm.addOrReplaceChild("part_r10", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-2.0F, -1.1913F, -0.2833F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)).mirror(false),
				PartPose.offsetAndRotation(0.9115F, 4.1631F, 1.9241F, -0.1309F, 0.0F, 3.1416F));
		PartDefinition part_r11 = LeftArm.addOrReplaceChild("part_r11", CubeListBuilder.create().texOffs(49, 50).mirror().addBox(-2.0F, 0.6747F, -1.2167F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0001F)).mirror(false),
				PartPose.offsetAndRotation(0.9115F, 4.1631F, -1.9241F, 0.3927F, 0.0F, 0.0F));
		PartDefinition part_r12 = LeftArm.addOrReplaceChild("part_r12", CubeListBuilder.create().texOffs(42, 7).mirror().addBox(-2.0F, -1.1913F, -0.7167F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0011F)).mirror(false),
				PartPose.offsetAndRotation(0.9115F, 4.1631F, -1.9241F, 0.1309F, 0.0F, 3.1416F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(34, 51).addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-2.01F, 7.6433F, -2.01F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.09F)).texOffs(39, 54).addBox(-2.01F, 1.4767F, -2.01F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.086F)).texOffs(0, 37)
						.addBox(-2.01F, -0.0233F, -2.01F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.09F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition part_r13 = RightLeg.addOrReplaceChild("part_r13", CubeListBuilder.create().texOffs(48, 34).addBox(-2.0F, 2.0F, 2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-0.01F, 4.506F, -5.4528F, 0.3491F, 0.0F, 0.0F));
		PartDefinition part_r14 = RightLeg.addOrReplaceChild("part_r14", CubeListBuilder.create().texOffs(10, 46).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-0.01F, 3.2467F, -1.8681F, -0.2182F, 0.0F, 0.0F));
		PartDefinition part_r15 = RightLeg.addOrReplaceChild("part_r15", CubeListBuilder.create().texOffs(22, 57).addBox(-0.6447F, -1.5F, -1.1994F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.49F, 8.1433F, 2.4432F, -0.1443F, -0.4323F, 0.0608F));
		PartDefinition part_r16 = RightLeg.addOrReplaceChild("part_r16", CubeListBuilder.create().texOffs(22, 57).addBox(0.6447F, -1.5F, -1.1994F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.49F, 8.1433F, 2.4432F, -0.1443F, 0.4323F, -0.0608F));
		PartDefinition part_r17 = RightLeg.addOrReplaceChild("part_r17", CubeListBuilder.create().texOffs(50, 22).addBox(-2.0F, 0.7792F, 0.1801F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-2.047F, 4.5655F, -0.01F, 0.0F, -1.5708F, -0.3491F));
		PartDefinition part_r18 = RightLeg.addOrReplaceChild("part_r18", CubeListBuilder.create().texOffs(30, 46).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-1.9763F, 3.7348F, -0.01F, 0.0F, -1.5708F, 0.2182F));
		PartDefinition part_r19 = RightLeg.addOrReplaceChild("part_r19", CubeListBuilder.create().texOffs(45, 45).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-0.01F, 3.2467F, 1.8681F, 0.2182F, 0.0F, 0.0F));
		PartDefinition part_r20 = RightLeg.addOrReplaceChild("part_r20", CubeListBuilder.create().texOffs(48, 19).addBox(-2.0F, 2.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-0.01F, 4.506F, 5.4528F, -0.3491F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(39, 54).mirror().addBox(-1.99F, 1.4767F, -2.01F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.086F)).mirror(false).texOffs(28, 11)
						.addBox(-1.99F, 7.6433F, -2.01F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.09F)).texOffs(32, 31).addBox(-1.99F, -0.0233F, -2.01F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.09F)).texOffs(0, 20).mirror()
						.addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 51).mirror().addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition part_r21 = LeftLeg.addOrReplaceChild("part_r21", CubeListBuilder.create().texOffs(46, 42).addBox(-2.0F, 2.0F, 2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(0.01F, 4.506F, -5.4528F, 0.3491F, 0.0F, 0.0F));
		PartDefinition part_r22 = LeftLeg.addOrReplaceChild("part_r22", CubeListBuilder.create().texOffs(44, 14).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(0.01F, 3.2467F, -1.8681F, -0.2182F, 0.0F, 0.0F));
		PartDefinition part_r23 = LeftLeg.addOrReplaceChild("part_r23", CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, 0.7792F, 0.1801F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(2.047F, 4.5655F, -0.01F, 0.0F, 1.5708F, 0.3491F));
		PartDefinition part_r24 = LeftLeg.addOrReplaceChild("part_r24", CubeListBuilder.create().texOffs(20, 46).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(1.9763F, 3.7348F, -0.01F, 0.0F, 1.5708F, -0.2182F));
		PartDefinition part_r25 = LeftLeg.addOrReplaceChild("part_r25", CubeListBuilder.create().texOffs(40, 26).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(0.01F, 3.2467F, 1.8681F, 0.2182F, 0.0F, 0.0F));
		PartDefinition part_r26 = LeftLeg.addOrReplaceChild("part_r26", CubeListBuilder.create().texOffs(46, 39).addBox(-2.0F, 2.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(0.01F, 4.506F, 5.4528F, -0.3491F, 0.0F, 0.0F));
		PartDefinition part_r27 = LeftLeg.addOrReplaceChild("part_r27", CubeListBuilder.create().texOffs(22, 57).mirror().addBox(-0.6447F, -1.5F, -1.1994F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.49F, 8.1433F, 2.4432F, -0.1443F, -0.4323F, 0.0608F));
		PartDefinition part_r28 = LeftLeg.addOrReplaceChild("part_r28", CubeListBuilder.create().texOffs(22, 57).mirror().addBox(0.6447F, -1.5F, -1.1994F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.49F, 8.1433F, 2.4432F, -0.1443F, 0.4323F, -0.0608F));
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
		this.LeftArm.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
