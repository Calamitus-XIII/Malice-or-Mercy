
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.maliceormercy.enchantment.WitherAspectEnchantment;
import net.mcreator.maliceormercy.enchantment.PoisonAspectEnchantment;
import net.mcreator.maliceormercy.enchantment.LifestealEnchantment;
import net.mcreator.maliceormercy.enchantment.FormidableEnchantment;
import net.mcreator.maliceormercy.enchantment.ExecutionEnchantment;
import net.mcreator.maliceormercy.enchantment.CorruptAspectEnchantment;
import net.mcreator.maliceormercy.enchantment.BleedEnchantment;
import net.mcreator.maliceormercy.MaliceOrMercyMod;

public class MaliceOrMercyModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MaliceOrMercyMod.MODID);
	public static final RegistryObject<Enchantment> WITHER_ASPECT = REGISTRY.register("wither_aspect", () -> new WitherAspectEnchantment());
	public static final RegistryObject<Enchantment> CORRUPT_ASPECT = REGISTRY.register("corrupt_aspect", () -> new CorruptAspectEnchantment());
	public static final RegistryObject<Enchantment> POISON_ASPECT = REGISTRY.register("poison_aspect", () -> new PoisonAspectEnchantment());
	public static final RegistryObject<Enchantment> BLEED = REGISTRY.register("bleed", () -> new BleedEnchantment());
	public static final RegistryObject<Enchantment> LIFESTEAL = REGISTRY.register("lifesteal", () -> new LifestealEnchantment());
	public static final RegistryObject<Enchantment> EXECUTION = REGISTRY.register("execution", () -> new ExecutionEnchantment());
	public static final RegistryObject<Enchantment> FORMIDABLE = REGISTRY.register("formidable", () -> new FormidableEnchantment());
}
