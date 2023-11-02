
package net.mcreator.maliceormercy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.maliceormercy.entity.CorruptTormentorEntity;
import net.mcreator.maliceormercy.client.model.Modelwarden;

public class CorruptTormentorRenderer extends MobRenderer<CorruptTormentorEntity, Modelwarden<CorruptTormentorEntity>> {
	public CorruptTormentorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwarden(context.bakeLayer(Modelwarden.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CorruptTormentorEntity, Modelwarden<CorruptTormentorEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("malice_or_mercy:textures/entities/corrupt_tormentor_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptTormentorEntity entity) {
		return new ResourceLocation("malice_or_mercy:textures/entities/corrupt_tormentor.png");
	}
}
