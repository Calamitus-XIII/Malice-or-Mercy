
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.maliceormercy.world.features.ores.SapphireOreFeature;
import net.mcreator.maliceormercy.world.features.ores.RubyOreFeature;
import net.mcreator.maliceormercy.world.features.ores.DeepslateSapphireOreFeature;
import net.mcreator.maliceormercy.world.features.ores.DeepslateRubyOreFeature;
import net.mcreator.maliceormercy.world.features.ores.CorruptFireFeature;
import net.mcreator.maliceormercy.MaliceOrMercyMod;

@Mod.EventBusSubscriber
public class MaliceOrMercyModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MaliceOrMercyMod.MODID);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::new);
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", SapphireOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_RUBY_ORE = REGISTRY.register("deepslate_ruby_ore", DeepslateRubyOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_SAPPHIRE_ORE = REGISTRY.register("deepslate_sapphire_ore", DeepslateSapphireOreFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_FIRE = REGISTRY.register("corrupt_fire", CorruptFireFeature::new);
}
