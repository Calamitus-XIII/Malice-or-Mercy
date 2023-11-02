
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.maliceormercy.fluid.types.LiquidCorruptionFluidType;
import net.mcreator.maliceormercy.MaliceOrMercyMod;

public class MaliceOrMercyModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MaliceOrMercyMod.MODID);
	public static final RegistryObject<FluidType> LIQUID_CORRUPTION_TYPE = REGISTRY.register("liquid_corruption", () -> new LiquidCorruptionFluidType());
}
