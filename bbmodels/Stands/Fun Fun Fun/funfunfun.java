// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class unknown<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "unknown"), "main");
	private final ModelPart stand;
	private final ModelPart stand2;
	private final ModelPart head;
	private final ModelPart head2;
	private final ModelPart extra_details;
	private final ModelPart top;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart torso;
	private final ModelPart upper_chest;
	private final ModelPart upper_chest2;
	private final ModelPart upper_straps;
	private final ModelPart right_arm;
	private final ModelPart upper_right_arm;
	private final ModelPart lower_right_arm;
	private final ModelPart lower_right_arm2;
	private final ModelPart upper_right_arm2;
	private final ModelPart lower_right_arm3;
	private final ModelPart bone4;
	private final ModelPart upper_right_arm3;
	private final ModelPart bone3;
	private final ModelPart left_arm;
	private final ModelPart upper_left_arm;
	private final ModelPart lower_left_arm;
	private final ModelPart lower_left_arm2;
	private final ModelPart tanks;
	private final ModelPart lower_chest;
	private final ModelPart lower_torso;
	private final ModelPart lower_straps;
	private final ModelPart belt;
	private final ModelPart legs;
	private final ModelPart right_leg;
	private final ModelPart upper_right_leg;
	private final ModelPart lower_right_leg;
	private final ModelPart lower_right_leg2;
	private final ModelPart left_leg;
	private final ModelPart upper_left_leg;
	private final ModelPart lower_left_leg;
	private final ModelPart BAM;
	private final ModelPart RightArmBAM;
	private final ModelPart RightArmBAM2;
	private final ModelPart RightArmBAM3;
	private final ModelPart LeftArmBAM;
	private final ModelPart LeftArmBAM4;
	private final ModelPart LeftArmBAM3;
	private final ModelPart kick_barrage;
	private final ModelPart One;
	private final ModelPart Two;
	private final ModelPart Three;
	private final ModelPart Four;
	private final ModelPart bone2;

	public unknown(ModelPart root) {
		this.stand = root.getChild("stand");
		this.stand2 = this.stand.getChild("stand2");
		this.head = this.stand2.getChild("head");
		this.head2 = this.head.getChild("head2");
		this.extra_details = this.head2.getChild("extra_details");
		this.top = this.extra_details.getChild("top");
		this.bone = this.head2.getChild("bone");
		this.body = this.stand2.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.torso = this.body2.getChild("torso");
		this.upper_chest = this.torso.getChild("upper_chest");
		this.upper_chest2 = this.upper_chest.getChild("upper_chest2");
		this.upper_straps = this.upper_chest.getChild("upper_straps");
		this.right_arm = this.upper_chest.getChild("right_arm");
		this.upper_right_arm = this.right_arm.getChild("upper_right_arm");
		this.lower_right_arm = this.right_arm.getChild("lower_right_arm");
		this.lower_right_arm2 = this.lower_right_arm.getChild("lower_right_arm2");
		this.upper_right_arm2 = this.lower_right_arm2.getChild("upper_right_arm2");
		this.lower_right_arm3 = this.lower_right_arm2.getChild("lower_right_arm3");
		this.bone4 = this.lower_right_arm3.getChild("bone4");
		this.upper_right_arm3 = this.bone4.getChild("upper_right_arm3");
		this.bone3 = this.lower_right_arm3.getChild("bone3");
		this.left_arm = this.upper_chest.getChild("left_arm");
		this.upper_left_arm = this.left_arm.getChild("upper_left_arm");
		this.lower_left_arm = this.left_arm.getChild("lower_left_arm");
		this.lower_left_arm2 = this.lower_left_arm.getChild("lower_left_arm2");
		this.tanks = this.upper_chest.getChild("tanks");
		this.lower_chest = this.torso.getChild("lower_chest");
		this.lower_torso = this.lower_chest.getChild("lower_torso");
		this.lower_straps = this.lower_torso.getChild("lower_straps");
		this.belt = this.lower_torso.getChild("belt");
		this.legs = this.body2.getChild("legs");
		this.right_leg = this.legs.getChild("right_leg");
		this.upper_right_leg = this.right_leg.getChild("upper_right_leg");
		this.lower_right_leg = this.right_leg.getChild("lower_right_leg");
		this.lower_right_leg2 = this.lower_right_leg.getChild("lower_right_leg2");
		this.left_leg = this.legs.getChild("left_leg");
		this.upper_left_leg = this.left_leg.getChild("upper_left_leg");
		this.lower_left_leg = this.left_leg.getChild("lower_left_leg");
		this.BAM = this.stand2.getChild("BAM");
		this.RightArmBAM = this.BAM.getChild("RightArmBAM");
		this.RightArmBAM2 = this.BAM.getChild("RightArmBAM2");
		this.RightArmBAM3 = this.BAM.getChild("RightArmBAM3");
		this.LeftArmBAM = this.BAM.getChild("LeftArmBAM");
		this.LeftArmBAM4 = this.BAM.getChild("LeftArmBAM4");
		this.LeftArmBAM3 = this.BAM.getChild("LeftArmBAM3");
		this.kick_barrage = this.stand2.getChild("kick_barrage");
		this.One = this.kick_barrage.getChild("One");
		this.Two = this.kick_barrage.getChild("Two");
		this.Three = this.kick_barrage.getChild("Three");
		this.Four = this.kick_barrage.getChild("Four");
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stand = partdefinition.addOrReplaceChild("stand", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition stand2 = stand.addOrReplaceChild("stand2", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition head = stand2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -24.15F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition extra_details = head2.addOrReplaceChild("extra_details", CubeListBuilder.create(), PartPose.offset(0.0F, -8.8761F, 1.0302F));

		PartDefinition top = extra_details.addOrReplaceChild("top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1F, 0.0F));

		PartDefinition bone = head2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 15).addBox(-3.5F, -10.35F, 0.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -4.0F));

		PartDefinition head2_r1 = bone.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -31.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 23.65F, 4.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition body = stand2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso = body2.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_chest = torso.addOrReplaceChild("upper_chest", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition upper_chest2 = upper_chest.addOrReplaceChild("upper_chest2", CubeListBuilder.create().texOffs(16, 47).addBox(-2.5F, -23.0F, -2.001F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 53).addBox(-2.0F, -15.0F, -2.51F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(-5.0F, -24.0F, -2.0F, 10.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition upper_straps = upper_chest.addOrReplaceChild("upper_straps", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition right_arm = upper_chest.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-4.0F, -5.25F, 0.0F));

		PartDefinition upper_right_arm = right_arm.addOrReplaceChild("upper_right_arm", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition lower_right_arm = right_arm.addOrReplaceChild("lower_right_arm", CubeListBuilder.create(), PartPose.offset(-2.0F, 5.5F, 0.0F));

		PartDefinition lower_right_arm2 = lower_right_arm.addOrReplaceChild("lower_right_arm2", CubeListBuilder.create(), PartPose.offset(6.0F, 17.75F, -6.0F));

		PartDefinition upper_right_arm2 = lower_right_arm2.addOrReplaceChild("upper_right_arm2", CubeListBuilder.create().texOffs(46, 41).addBox(-2.5F, 19.8F, -2.5034F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(24, 41).addBox(-3.0F, 20.5F, -3.5034F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -20.0F, 0.0F));

		PartDefinition lower_right_arm_r1 = upper_right_arm2.addOrReplaceChild("lower_right_arm_r1", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -9.0F, -3.0F, 0.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 11.5F, -1.7F, 0.0F, 0.7418F, 0.0F));

		PartDefinition lower_right_arm_r2 = upper_right_arm2.addOrReplaceChild("lower_right_arm_r2", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -9.0F, -3.0F, 0.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 11.5F, -1.7F, 0.0F, -0.3491F, 0.0F));

		PartDefinition upper_right_arm_r1 = upper_right_arm2.addOrReplaceChild("upper_right_arm_r1", CubeListBuilder.create().texOffs(46, 46).addBox(-3.0F, -3.0F, 0.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition lower_right_arm3 = lower_right_arm2.addOrReplaceChild("lower_right_arm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.1066F, 12.6048F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone4 = lower_right_arm3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(7.0F, -5.8934F, 0.3952F));

		PartDefinition upper_right_arm3 = bone4.addOrReplaceChild("upper_right_arm3", CubeListBuilder.create().texOffs(24, 41).addBox(-3.0F, 21.5F, -2.5034F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(46, 41).addBox(-2.5F, 20.8F, -1.5034F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_right_arm_r2 = upper_right_arm3.addOrReplaceChild("upper_right_arm_r2", CubeListBuilder.create().texOffs(52, 34).addBox(-3.0F, -2.7544F, 1.3927F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition lower_right_arm_r3 = upper_right_arm3.addOrReplaceChild("lower_right_arm_r3", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -9.0F, -3.0F, 0.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.5F, -0.7F, 0.0F, 0.5672F, 0.0F));

		PartDefinition lower_right_arm_r4 = upper_right_arm3.addOrReplaceChild("lower_right_arm_r4", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -9.0F, -3.0F, 0.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.5F, -0.7F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bone3 = lower_right_arm3.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(46, 41).addBox(-3.5F, 20.8F, -0.5034F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(24, 41).addBox(-4.0F, 21.5F, -1.5034F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -5.8934F, 0.3952F));

		PartDefinition lower_right_arm_r5 = bone3.addOrReplaceChild("lower_right_arm_r5", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -9.0F, -3.0F, 0.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 12.5F, -0.7F, 0.0F, 0.48F, 0.0F));

		PartDefinition lower_right_arm_r6 = bone3.addOrReplaceChild("lower_right_arm_r6", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -9.0F, -3.0F, 0.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 12.5F, -0.7F, 0.0F, -0.6109F, 0.0F));

		PartDefinition upper_right_arm_r3 = bone3.addOrReplaceChild("upper_right_arm_r3", CubeListBuilder.create().texOffs(16, 52).addBox(-3.0F, -2.7544F, 1.3927F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9116F, 0.0F, 0.4966F, -0.6109F, 0.0F, 0.0F));

		PartDefinition left_arm = upper_chest.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(4.0F, -5.25F, 0.0F));

		PartDefinition upper_left_arm = left_arm.addOrReplaceChild("upper_left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_left_arm_r1 = upper_left_arm.addOrReplaceChild("upper_left_arm_r1", CubeListBuilder.create().texOffs(44, 12).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-10.0F, 0.25F, -3.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition upper_left_arm_r2 = upper_left_arm.addOrReplaceChild("upper_left_arm_r2", CubeListBuilder.create().texOffs(44, 18).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-10.0F, 0.25F, 3.0F, 0.8413F, -0.4366F, -0.4419F));

		PartDefinition upper_left_arm_r3 = upper_left_arm.addOrReplaceChild("upper_left_arm_r3", CubeListBuilder.create().texOffs(44, 6).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.0F, 0.25F, 3.0F, 0.8572F, 0.4655F, 0.4783F));

		PartDefinition upper_left_arm_r4 = upper_left_arm.addOrReplaceChild("upper_left_arm_r4", CubeListBuilder.create().texOffs(44, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.0F, 0.25F, -3.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition lower_left_arm = left_arm.addOrReplaceChild("lower_left_arm", CubeListBuilder.create(), PartPose.offset(2.0F, 5.5F, 0.0F));

		PartDefinition lower_left_arm2 = lower_left_arm.addOrReplaceChild("lower_left_arm2", CubeListBuilder.create().texOffs(46, 41).addBox(-1.8333F, 8.9377F, -2.24F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(24, 41).addBox(-2.3333F, 9.6377F, -3.24F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.3333F, 8.6123F, -6.2635F));

		PartDefinition upper_right_arm_r4 = lower_left_arm2.addOrReplaceChild("upper_right_arm_r4", CubeListBuilder.create().texOffs(30, 47).addBox(-3.0F, -3.0F, 0.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6667F, -10.8623F, 0.2635F, -0.6109F, 0.0F, 0.0F));

		PartDefinition lower_right_arm_r7 = lower_left_arm2.addOrReplaceChild("lower_right_arm_r7", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -9.0F, -3.0F, 0.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6667F, 0.6377F, -1.4365F, 0.0F, 0.5672F, 0.0F));

		PartDefinition lower_right_arm_r8 = lower_left_arm2.addOrReplaceChild("lower_right_arm_r8", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -9.0F, -3.0F, 0.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6667F, 0.6377F, -1.4365F, 0.0F, -0.5236F, 0.0F));

		PartDefinition tanks = upper_chest.addOrReplaceChild("tanks", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition lower_chest = torso.addOrReplaceChild("lower_chest", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition lower_torso = lower_chest.addOrReplaceChild("lower_torso", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition lower_straps = lower_torso.addOrReplaceChild("lower_straps", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition belt = lower_torso.addOrReplaceChild("belt", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition legs = body2.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition right_leg = legs.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, 0.0F));

		PartDefinition upper_right_leg = right_leg.addOrReplaceChild("upper_right_leg", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, 1.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition front_belt_r1 = upper_right_leg.addOrReplaceChild("front_belt_r1", CubeListBuilder.create().texOffs(28, 26).addBox(-2.0F, 0.0F, 1.2F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.125F, -3.7F, 0.0F, 0.0F, 0.2182F));

		PartDefinition lower_right_leg = right_leg.addOrReplaceChild("lower_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition lower_right_leg2 = lower_right_leg.addOrReplaceChild("lower_right_leg2", CubeListBuilder.create(), PartPose.offset(2.0F, 6.0F, 0.0F));

		PartDefinition left_leg = legs.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, 0.0F));

		PartDefinition upper_left_leg = left_leg.addOrReplaceChild("upper_left_leg", CubeListBuilder.create().texOffs(28, 34).addBox(-6.0F, 4.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lower_left_leg = left_leg.addOrReplaceChild("lower_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition BAM = stand2.addOrReplaceChild("BAM", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, -4.0F));

		PartDefinition RightArmBAM = BAM.addOrReplaceChild("RightArmBAM", CubeListBuilder.create(), PartPose.offset(-12.0F, -8.0F, 1.0F));

		PartDefinition cube_r1 = RightArmBAM.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 121).addBox(-10.75F, -4.25F, -5.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 118).mirror().addBox(-10.75F, -1.25F, -5.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 7.25F, -1.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition RightArm_r1 = RightArmBAM.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(0, 112).addBox(-10.75F, -1.25F, -5.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-2.25F, 7.25F, -2.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition RightArmBAM2 = BAM.addOrReplaceChild("RightArmBAM2", CubeListBuilder.create(), PartPose.offset(-14.5F, -2.75F, 0.0F));

		PartDefinition cube_r2 = RightArmBAM2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 121).addBox(-5.5F, -4.25F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 118).mirror().addBox(-5.5F, -1.25F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.25F, 3.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition RightArm_r2 = RightArmBAM2.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(0, 112).addBox(-5.5F, -1.25F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.25F, 3.0F, -1.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition RightArmBAM3 = BAM.addOrReplaceChild("RightArmBAM3", CubeListBuilder.create(), PartPose.offset(-13.625F, 0.75F, 0.0F));

		PartDefinition cube_r3 = RightArmBAM3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 121).addBox(0.25F, -4.25F, -4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 118).mirror().addBox(0.25F, -1.25F, -4.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.625F, -0.5F, 0.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition RightArm_r3 = RightArmBAM3.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(0, 112).addBox(0.25F, -1.25F, -4.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-0.625F, -0.5F, -1.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition LeftArmBAM = BAM.addOrReplaceChild("LeftArmBAM", CubeListBuilder.create(), PartPose.offset(12.0F, -9.0F, 0.0F));

		PartDefinition cube_r4 = LeftArmBAM.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-3.25F, -4.25F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 118).addBox(-3.25F, -1.25F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -1.75F, 0.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition LeftArm_r1 = LeftArmBAM.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-3.25F, -1.25F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.75F, -1.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition LeftArmBAM4 = BAM.addOrReplaceChild("LeftArmBAM4", CubeListBuilder.create(), PartPose.offset(14.5F, -2.75F, 0.0F));

		PartDefinition cube_r5 = LeftArmBAM4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(1.5F, -4.25F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 118).addBox(1.5F, -1.25F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 3.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition LeftArm_r2 = LeftArmBAM4.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(1.5F, -1.25F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 3.0F, -1.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition LeftArmBAM3 = BAM.addOrReplaceChild("LeftArmBAM3", CubeListBuilder.create(), PartPose.offset(13.625F, 0.75F, 0.0F));

		PartDefinition cube_r6 = LeftArmBAM3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-4.25F, -4.25F, -4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 118).addBox(-4.25F, -1.25F, -4.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.625F, -0.5F, 0.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition LeftArm_r3 = LeftArmBAM3.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-4.25F, -1.25F, -4.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(0.625F, -0.5F, -1.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition kick_barrage = stand2.addOrReplaceChild("kick_barrage", CubeListBuilder.create(), PartPose.offset(-11.0F, -12.0F, -2.0F));

		PartDefinition One = kick_barrage.addOrReplaceChild("One", CubeListBuilder.create().texOffs(45, 118).mirror().addBox(-2.0F, 4.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(61, 119).mirror().addBox(-2.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.201F)).mirror(false), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition upper_left_leg_r1 = One.addOrReplaceChild("upper_left_leg_r1", CubeListBuilder.create().texOffs(66, 116).addBox(9.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 4.0F, -2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition base_r1 = One.addOrReplaceChild("base_r1", CubeListBuilder.create().texOffs(45, 110).mirror().addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1819F, 0.1667F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Two = kick_barrage.addOrReplaceChild("Two", CubeListBuilder.create().texOffs(45, 118).mirror().addBox(-2.0F, 4.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(61, 119).mirror().addBox(-2.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.201F)).mirror(false), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition upper_left_leg_r2 = Two.addOrReplaceChild("upper_left_leg_r2", CubeListBuilder.create().texOffs(66, 116).addBox(9.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 4.0F, -2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition base_r2 = Two.addOrReplaceChild("base_r2", CubeListBuilder.create().texOffs(45, 110).mirror().addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1819F, 0.1667F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Three = kick_barrage.addOrReplaceChild("Three", CubeListBuilder.create().texOffs(45, 118).mirror().addBox(-2.0F, 4.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(61, 119).mirror().addBox(-2.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.201F)).mirror(false), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition upper_left_leg_r3 = Three.addOrReplaceChild("upper_left_leg_r3", CubeListBuilder.create().texOffs(66, 116).addBox(9.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 4.0F, -2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition base_r3 = Three.addOrReplaceChild("base_r3", CubeListBuilder.create().texOffs(45, 110).mirror().addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1819F, 0.1667F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Four = kick_barrage.addOrReplaceChild("Four", CubeListBuilder.create().texOffs(45, 118).mirror().addBox(-2.0F, 4.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(61, 119).mirror().addBox(-2.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.201F)).mirror(false), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition upper_left_leg_r4 = Four.addOrReplaceChild("upper_left_leg_r4", CubeListBuilder.create().texOffs(66, 116).addBox(9.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 4.0F, -2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition base_r4 = Four.addOrReplaceChild("base_r4", CubeListBuilder.create().texOffs(45, 110).mirror().addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1819F, 0.1667F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 5.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		stand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}