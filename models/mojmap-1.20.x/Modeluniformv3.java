// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeluniformv3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "uniformv3"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modeluniformv3(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(28, 6)
				.addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 0)
				.addBox(-4.0F, 2.75F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 27)
				.addBox(-2.0F, 0.75F, 1.175F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(24, 0)
				.addBox(-4.0F, 0.25F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.26F)).texOffs(24, 6)
				.addBox(-0.9167F, 2.3333F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(20, 0)
				.addBox(-0.9167F, 4.6667F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(12, 11)
				.addBox(-0.9167F, 7.0F, -2.9139F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(12, 39)
				.addBox(0.75F, 2.6667F, -2.8889F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(38, 37)
				.addBox(0.75F, 2.5F, -2.8889F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(40, 19).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, -1.9167F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(28, 12).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 1.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 14).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -1.5F, -0.6109F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(12, 25)
						.addBox(-3.0F, -1.8F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.22F)).texOffs(16, 11)
						.addBox(-3.0F, -1.05F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.12F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(12, 25).mirror()
						.addBox(-1.0F, -1.8F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.22F)).mirror(false)
						.texOffs(16, 11).mirror()
						.addBox(-1.0F, -1.05F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.12F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 21)
						.addBox(-2.1F, 1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(28, 30)
						.addBox(-2.1F, 6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.21F)).texOffs(32, 16)
						.addBox(-2.1F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r3 = RightLeg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.04F)),
				PartPose.offsetAndRotation(-1.45F, 7.5F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r4 = RightLeg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(28, 37).addBox(-2.0F, -2.2875F, -0.4125F, 4.0F, 5.0F, 1.0F,
						new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(-2.0125F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.0436F));

		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(43, 43).addBox(-2.0F, -3.4036F, -1.1098F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.19F)),
				PartPose.offsetAndRotation(-2.0125F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.3054F));

		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(40, 30).addBox(-2.0F, 2.0199F, 1.0661F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.7625F, 2.7625F, 0.0F, 0.0F, 1.5708F, 0.6545F));

		PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(11, 43).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(1.9F, 0.5F, 1.75F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r8 = RightLeg
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(40, 32).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
								new CubeDeformation(0.2F)),
						PartPose.offsetAndRotation(1.9F, 6.0F, 1.75F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(42, 16).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.9F, 6.0F, -1.75F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r10 = RightLeg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(21, 43).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.24F)),
				PartPose.offsetAndRotation(1.9F, 0.5F, -1.75F, -0.6109F, 0.0F, 0.0F));

		PartDefinition part_r1 = RightLeg.addOrReplaceChild("part_r1",
				CubeListBuilder.create().texOffs(38, 38).addBox(-0.6447F, -1.5F, -1.1994F, 0.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 7.6433F, 2.4432F, -0.1443F, -0.4323F, 0.0608F));

		PartDefinition part_r2 = RightLeg.addOrReplaceChild("part_r2",
				CubeListBuilder.create().texOffs(22, 36).addBox(0.6447F, -1.5F, -1.1994F, 0.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 7.6433F, 2.4432F, -0.1443F, 0.4323F, -0.0608F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 20)
				.mirror().addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 22).mirror().addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(28, 21).mirror()
				.addBox(-1.9F, 1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(28, 30)
				.mirror().addBox(-1.9F, 6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.21F)).mirror(false)
				.texOffs(32, 16).mirror().addBox(-1.9F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.25F))
				.mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 37).mirror()
						.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.04F)).mirror(false),
				PartPose.offsetAndRotation(1.45F, 7.5F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(28, 37).mirror()
						.addBox(-2.0F, -2.2875F, -0.4125F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(2.0125F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.0436F));

		PartDefinition cube_r13 = LeftLeg.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(43, 43).mirror()
						.addBox(-2.0F, -3.4036F, -1.1098F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.19F)).mirror(false),
				PartPose.offsetAndRotation(2.0125F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.3054F));

		PartDefinition cube_r14 = LeftLeg.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(40, 30).mirror()
						.addBox(-2.0F, 2.0199F, 1.0661F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(1.7625F, 2.7625F, 0.0F, 0.0F, -1.5708F, -0.6545F));

		PartDefinition cube_r15 = LeftLeg.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(11, 43).mirror()
						.addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 0.5F, 1.75F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r16 = LeftLeg.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(40, 32).mirror()
						.addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 6.0F, 1.75F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r17 = LeftLeg.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(42, 16).mirror()
						.addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 6.0F, -1.75F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r18 = LeftLeg.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(21, 43).mirror()
						.addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 0.5F, -1.75F, -0.6109F, 0.0F, 0.0F));

		PartDefinition part_r3 = LeftLeg.addOrReplaceChild("part_r3",
				CubeListBuilder.create().texOffs(38, 38).mirror()
						.addBox(0.6447F, -1.5F, -1.1994F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, 7.6433F, 2.4432F, -0.1443F, 0.4323F, -0.0608F));

		PartDefinition part_r4 = LeftLeg.addOrReplaceChild("part_r4",
				CubeListBuilder.create().texOffs(22, 36).mirror()
						.addBox(-0.6447F, -1.5F, -1.1994F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, 7.6433F, 2.4432F, -0.1443F, -0.4323F, 0.0608F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}