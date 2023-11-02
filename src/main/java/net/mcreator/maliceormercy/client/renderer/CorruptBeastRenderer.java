
package net.mcreator.maliceormercy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.maliceormercy.entity.CorruptBeastEntity;
import net.mcreator.maliceormercy.client.model.Modelhoglin;

public class CorruptBeastRenderer extends MobRenderer<CorruptBeastEntity, Modelhoglin<CorruptBeastEntity>> {
	public CorruptBeastRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhoglin(context.bakeLayer(Modelhoglin.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CorruptBeastEntity, Modelhoglin<CorruptBeastEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("malice_or_mercy:textures/entities/corrupt_beast_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptBeastEntity entity) {
		return new ResourceLocation("malice_or_mercy:textures/entities/corrupt_beast.png");
	}
}
