
package net.mcreator.maliceormercy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.maliceormercy.entity.CorruptFiendEntity;

public class CorruptFiendRenderer extends HumanoidMobRenderer<CorruptFiendEntity, HumanoidModel<CorruptFiendEntity>> {
	public CorruptFiendRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new EyesLayer<CorruptFiendEntity, HumanoidModel<CorruptFiendEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("malice_or_mercy:textures/entities/corrupt_fiend_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptFiendEntity entity) {
		return new ResourceLocation("malice_or_mercy:textures/entities/corrupt_fiend.png");
	}
}
