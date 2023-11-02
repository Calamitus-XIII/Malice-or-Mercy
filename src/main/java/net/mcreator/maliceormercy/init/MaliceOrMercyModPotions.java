
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.maliceormercy.MaliceOrMercyMod;

public class MaliceOrMercyModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MaliceOrMercyMod.MODID);
	public static final RegistryObject<Potion> CORRUPTION_POTION = REGISTRY.register("corruption_potion", () -> new Potion(new MobEffectInstance(MaliceOrMercyModMobEffects.CORRUPTION.get(), 900, 0, false, true)));
	public static final RegistryObject<Potion> BLEEDING_POTION = REGISTRY.register("bleeding_potion", () -> new Potion(new MobEffectInstance(MaliceOrMercyModMobEffects.BLEEDING.get(), 1200, 0, false, true)));
	public static final RegistryObject<Potion> CORRUPTION_POTION_POTENCY_1 = REGISTRY.register("corruption_potion_potency_1", () -> new Potion(new MobEffectInstance(MaliceOrMercyModMobEffects.CORRUPTION.get(), 500, 1, false, true)));
	public static final RegistryObject<Potion> CORRUPT_POTION_POTENCY_2 = REGISTRY.register("corrupt_potion_potency_2", () -> new Potion(new MobEffectInstance(MaliceOrMercyModMobEffects.CORRUPTION.get(), 200, 2, false, true)));
}
