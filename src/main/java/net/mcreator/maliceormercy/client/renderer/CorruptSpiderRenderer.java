
package net.mcreator.maliceormercy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.maliceormercy.entity.CorruptSpiderEntity;

public class CorruptSpiderRenderer extends MobRenderer<CorruptSpiderEntity, SpiderModel<CorruptSpiderEntity>> {
	public CorruptSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
		this.addLayer(new EyesLayer<CorruptSpiderEntity, SpiderModel<CorruptSpiderEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("malice_or_mercy:textures/entities/corrupt_spider_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptSpiderEntity entity) {
		return new ResourceLocation("malice_or_mercy:textures/entities/corrupt_spider.png");
	}
}
