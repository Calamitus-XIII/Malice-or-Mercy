
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.maliceormercy.client.renderer.HumanRenderer;
import net.mcreator.maliceormercy.client.renderer.CorruptTormentorRenderer;
import net.mcreator.maliceormercy.client.renderer.CorruptSpiderRenderer;
import net.mcreator.maliceormercy.client.renderer.CorruptHoundRenderer;
import net.mcreator.maliceormercy.client.renderer.CorruptFiendRenderer;
import net.mcreator.maliceormercy.client.renderer.CorruptBeastRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MaliceOrMercyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MaliceOrMercyModEntities.HUMAN.get(), HumanRenderer::new);
		event.registerEntityRenderer(MaliceOrMercyModEntities.CORRUPT_FIEND.get(), CorruptFiendRenderer::new);
		event.registerEntityRenderer(MaliceOrMercyModEntities.CORRUPT_HOUND.get(), CorruptHoundRenderer::new);
		event.registerEntityRenderer(MaliceOrMercyModEntities.CORRUPT_BEAST.get(), CorruptBeastRenderer::new);
		event.registerEntityRenderer(MaliceOrMercyModEntities.CORRUPT_TORMENTOR.get(), CorruptTormentorRenderer::new);
		event.registerEntityRenderer(MaliceOrMercyModEntities.CORRUPT_SPIDER.get(), CorruptSpiderRenderer::new);
	}
}
