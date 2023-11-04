package net.mcreator.maliceormercy.client.model;

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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelranged_biped<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("malice_or_mercy", "modelranged_biped"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart Crossbow;

	public Modelranged_biped(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Crossbow = root.getChild("Crossbow");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 28.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 18.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.1318F, 22.0F, -4.924F));
		PartDefinition RightArmLayer_r1 = RightArm.addOrReplaceChild("RightArmLayer_r1",
				CubeListBuilder.create().texOffs(40, 32).addBox(-2.0F, -11.0F, -6.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(40, 16).addBox(-2.0F, -11.0F, -6.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8682F, -4.0F, 4.924F, -1.5708F, -0.1745F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(2.6051F, 23.0F, -5.2167F));
		PartDefinition LeftArmLayer_r1 = LeftArm.addOrReplaceChild("LeftArmLayer_r1",
				CubeListBuilder.create().texOffs(48, 48).addBox(3.0F, -9.0F, -25.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(32, 48).addBox(3.0F, -9.0F, -25.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6051F, -23.0F, 5.2167F, -1.5708F, 0.5672F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 6.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 6.0F, 0.0F));
		PartDefinition Crossbow = partdefinition.addOrReplaceChild("Crossbow", CubeListBuilder.create(), PartPose.offset(-3.039F, 24.5F, -14.9092F));
		PartDefinition l_r1 = Crossbow.addOrReplaceChild("l_r1",
				CubeListBuilder.create().texOffs(56, 68).addBox(4.0F, 0.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68).addBox(-7.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(-6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68).addBox(-6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(-6.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68).addBox(-2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(-1.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(1.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68).addBox(1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68).addBox(2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(2.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68).addBox(6.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(5.0F, 0.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68).addBox(4.0F, 0.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(-8.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70).addBox(-7.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(-7.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70).addBox(-7.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(-7.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70).addBox(-6.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(-6.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70).addBox(-6.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(-4.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70).addBox(-3.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(-2.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70).addBox(-2.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(-1.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(0.0F, 0.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70).addBox(1.0F, 0.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(2.0F, 0.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70).addBox(5.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 70)
						.addBox(4.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 70).addBox(-5.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 70)
						.addBox(-5.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 70).addBox(-4.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 70)
						.addBox(-3.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 70).addBox(4.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 70)
						.addBox(4.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70).addBox(-4.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70)
						.addBox(-3.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70).addBox(-2.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70)
						.addBox(-1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70).addBox(-6.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70)
						.addBox(0.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70).addBox(2.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70)
						.addBox(4.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70).addBox(4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70)
						.addBox(4.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70).addBox(4.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70)
						.addBox(4.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 70).addBox(4.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 70)
						.addBox(-5.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 70).addBox(-4.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 70)
						.addBox(1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 70).addBox(3.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 70)
						.addBox(4.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 70).addBox(4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 70)
						.addBox(-5.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 70).addBox(-5.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 70)
						.addBox(-5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 70).addBox(5.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 70)
						.addBox(4.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70).addBox(-3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(-2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(-1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(3.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70).addBox(3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(2.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70).addBox(7.0F, 0.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(7.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70).addBox(6.0F, 0.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(6.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70).addBox(6.0F, 0.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(5.0F, 0.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70).addBox(5.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(4.0F, 0.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 70).addBox(-7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 70)
						.addBox(-5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 70).addBox(0.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 70)
						.addBox(1.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 70).addBox(3.0F, 0.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 70)
						.addBox(5.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 70).addBox(5.0F, 0.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(-3.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70).addBox(-2.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(-2.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70).addBox(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70).addBox(1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70).addBox(3.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(2.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70).addBox(2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 70)
						.addBox(2.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 70).addBox(-6.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 70)
						.addBox(-6.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 70).addBox(-2.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 70)
						.addBox(0.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 70).addBox(1.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 70)
						.addBox(3.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 70).addBox(3.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 70)
						.addBox(-4.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 70).addBox(-3.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 70)
						.addBox(-2.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 70).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 70)
						.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 70).addBox(1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 70)
						.addBox(-4.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 70).addBox(-3.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 70)
						.addBox(-5.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 70).addBox(-5.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 70)
						.addBox(-6.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 70).addBox(-6.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 70)
						.addBox(-5.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.039F, -0.5F, -0.0908F, 0.0F, -0.9599F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 72);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Crossbow.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
