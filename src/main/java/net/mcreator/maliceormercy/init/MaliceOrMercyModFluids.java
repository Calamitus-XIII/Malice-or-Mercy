
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.maliceormercy.fluid.LiquidCorruptionFluid;
import net.mcreator.maliceormercy.MaliceOrMercyMod;

public class MaliceOrMercyModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, MaliceOrMercyMod.MODID);
	public static final RegistryObject<FlowingFluid> LIQUID_CORRUPTION = REGISTRY.register("liquid_corruption", () -> new LiquidCorruptionFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_CORRUPTION = REGISTRY.register("flowing_liquid_corruption", () -> new LiquidCorruptionFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_CORRUPTION.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_CORRUPTION.get(), RenderType.translucent());
		}
	}
}
