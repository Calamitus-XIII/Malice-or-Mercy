
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.maliceormercy.client.model.Modelwolf;
import net.mcreator.maliceormercy.client.model.Modelwarden;
import net.mcreator.maliceormercy.client.model.Modelhoglin;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MaliceOrMercyModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelwolf.LAYER_LOCATION, Modelwolf::createBodyLayer);
		event.registerLayerDefinition(Modelwarden.LAYER_LOCATION, Modelwarden::createBodyLayer);
		event.registerLayerDefinition(Modelhoglin.LAYER_LOCATION, Modelhoglin::createBodyLayer);
	}
}
