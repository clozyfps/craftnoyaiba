// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsheathe<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sheathe"), "main");
	private final ModelPart Body;
	private final ModelPart bone;

	public Modelsheathe(ModelPart root) {
		this.Body = root.getChild("Body");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, -13.4585F, -2.5811F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 4).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, -0.1834F, -0.3279F, 0.0F, -0.4363F, -1.5708F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 4)
				.addBox(-2.5296F, -2.5296F, -1.7537F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(0, 4)
				.addBox(-2.5296F, -2.5296F, -1.7537F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 1.0252F, 0.4918F, -0.3185F, 0.3035F, 0.7363F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(3, 19).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 10.0F,
						new CubeDeformation(-0.16F)),
				PartPose.offsetAndRotation(0.0F, -2.2183F, -4.8554F, -0.3185F, 0.3035F, 0.7363F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.2752F, 0.4918F, -0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}