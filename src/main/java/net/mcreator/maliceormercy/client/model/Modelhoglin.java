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
public class Modelhoglin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("malice_or_mercy", "modelhoglin"), "main");
	public final ModelPart body;
	public final ModelPart leg_back_right;
	public final ModelPart leg_back_left;
	public final ModelPart leg_front_right;
	public final ModelPart leg_front_left;

	public Modelhoglin(ModelPart root) {
		this.body = root.getChild("body");
		this.leg_back_right = root.getChild("leg_back_right");
		this.leg_back_left = root.getChild("leg_back_left");
		this.leg_front_right = root.getChild("leg_front_right");
		this.leg_front_left = root.getChild("leg_front_left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(1, 1).addBox(-8.0F, -6.0F, -4.0F, 16.0F, 14.0F, 26.0F, new CubeDeformation(0.02F)).texOffs(90, 33).addBox(0.0F, -13.0F, -7.0F, 0.0F, 10.0F, 19.0F, new CubeDeformation(0.02F)),
				PartPose.offset(0.0F, 5.0F, -3.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(61, 1).addBox(-7.0F, -5.0F, -19.0F, 14.0F, 6.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(1, 13)
				.addBox(-8.0F, -11.0F, -14.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 13).addBox(6.0F, -11.0F, -14.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, 0.8727F, 0.0F, 0.0F));
		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(1, 1).addBox(-6.0F, 0.0F, -3.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -5.0F, -2.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(1, 6).addBox(0.0F, 0.0F, -3.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -5.0F, -2.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition leg_back_right = partdefinition.addOrReplaceChild("leg_back_right", CubeListBuilder.create().texOffs(21, 45).addBox(-14.0F, -3.0F, -4.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 16.0F, 17.0F));
		PartDefinition leg_back_left = partdefinition.addOrReplaceChild("leg_back_left", CubeListBuilder.create().texOffs(0, 45).addBox(9.0F, -3.0F, -4.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 16.0F, 17.0F));
		PartDefinition leg_front_right = partdefinition.addOrReplaceChild("leg_front_right", CubeListBuilder.create().texOffs(66, 42).addBox(-2.0F, -2.0F, -3.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 12.0F, -3.0F));
		PartDefinition leg_front_left = partdefinition.addOrReplaceChild("leg_front_left", CubeListBuilder.create().texOffs(41, 42).addBox(-4.0F, -2.0F, -3.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 12.0F, -3.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_back_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_back_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_front_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_front_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg_front_right.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_front_left.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_back_right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_back_left.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
