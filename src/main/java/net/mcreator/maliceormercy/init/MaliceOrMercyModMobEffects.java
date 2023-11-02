
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.maliceormercy.potion.MarkedMobEffect;
import net.mcreator.maliceormercy.potion.FearMobEffect;
import net.mcreator.maliceormercy.potion.CorruptionMobEffect;
import net.mcreator.maliceormercy.potion.BleedingMobEffect;
import net.mcreator.maliceormercy.MaliceOrMercyMod;

public class MaliceOrMercyModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MaliceOrMercyMod.MODID);
	public static final RegistryObject<MobEffect> CORRUPTION = REGISTRY.register("corruption", () -> new CorruptionMobEffect());
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
	public static final RegistryObject<MobEffect> MARKED = REGISTRY.register("marked", () -> new MarkedMobEffect());
	public static final RegistryObject<MobEffect> FEAR = REGISTRY.register("fear", () -> new FearMobEffect());
}
