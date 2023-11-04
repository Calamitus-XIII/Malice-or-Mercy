
package net.mcreator.maliceormercy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.maliceormercy.entity.FallenArcherEntity;
import net.mcreator.maliceormercy.client.model.Modelranged_biped_wo_crossbow;

public class FallenArcherRenderer extends MobRenderer<FallenArcherEntity, Modelranged_biped_wo_crossbow<FallenArcherEntity>> {
	public FallenArcherRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelranged_biped_wo_crossbow(context.bakeLayer(Modelranged_biped_wo_crossbow.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FallenArcherEntity entity) {
		return new ResourceLocation("malice_or_mercy:textures/entities/fallen_archer_-_copy1.png");
	}
}
