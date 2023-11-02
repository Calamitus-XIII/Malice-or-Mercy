
package net.mcreator.maliceormercy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.maliceormercy.entity.CorruptHoundEntity;
import net.mcreator.maliceormercy.client.model.Modelwolf;

public class CorruptHoundRenderer extends MobRenderer<CorruptHoundEntity, Modelwolf<CorruptHoundEntity>> {
	public CorruptHoundRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwolf(context.bakeLayer(Modelwolf.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CorruptHoundEntity, Modelwolf<CorruptHoundEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("malice_or_mercy:textures/entities/corrupt_hound_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptHoundEntity entity) {
		return new ResourceLocation("malice_or_mercy:textures/entities/corrupt_hound.png");
	}
}
