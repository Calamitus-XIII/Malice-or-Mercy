
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.maliceormercy.world.features.ores.SilverOreFeature;
import net.mcreator.maliceormercy.world.features.ores.SapphireOreFeature;
import net.mcreator.maliceormercy.world.features.ores.RubyOreFeature;
import net.mcreator.maliceormercy.world.features.ores.DeepslateSilverOreFeature;
import net.mcreator.maliceormercy.world.features.ores.DeepslateSapphireOreFeature;
import net.mcreator.maliceormercy.world.features.ores.DeepslateRubyOreFeature;
import net.mcreator.maliceormercy.world.features.ores.CorruptslateFeature;
import net.mcreator.maliceormercy.world.features.ores.CorruptSilverOreFeature;
import net.mcreator.maliceormercy.world.features.ores.CorruptSapphireOreFeature;
import net.mcreator.maliceormercy.world.features.ores.CorruptRubyOreFeature;
import net.mcreator.maliceormercy.world.features.ores.CorruptFireFeature;
import net.mcreator.maliceormercy.world.features.ores.CorriteOreFeature;
import net.mcreator.maliceormercy.world.features.CorruptslateGenerationFeature;
import net.mcreator.maliceormercy.MaliceOrMercyMod;

@Mod.EventBusSubscriber
public class MaliceOrMercyModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MaliceOrMercyMod.MODID);
	public static final RegistryObject<Feature<?>> CORRUPTSLATE = REGISTRY.register("corruptslate", CorruptslateFeature::new);
	public static final RegistryObject<Feature<?>> CORRITE_ORE = REGISTRY.register("corrite_ore", CorriteOreFeature::new);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_RUBY_ORE = REGISTRY.register("deepslate_ruby_ore", DeepslateRubyOreFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_RUBY_ORE = REGISTRY.register("corrupt_ruby_ore", CorruptRubyOreFeature::new);
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", SapphireOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_SAPPHIRE_ORE = REGISTRY.register("deepslate_sapphire_ore", DeepslateSapphireOreFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_SAPPHIRE_ORE = REGISTRY.register("corrupt_sapphire_ore", CorruptSapphireOreFeature::new);
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_SILVER_ORE = REGISTRY.register("deepslate_silver_ore", DeepslateSilverOreFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_SILVER_ORE = REGISTRY.register("corrupt_silver_ore", CorruptSilverOreFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPT_FIRE = REGISTRY.register("corrupt_fire", CorruptFireFeature::new);
	public static final RegistryObject<Feature<?>> CORRUPTSLATE_GENERATION = REGISTRY.register("corruptslate_generation", CorruptslateGenerationFeature::new);
}
