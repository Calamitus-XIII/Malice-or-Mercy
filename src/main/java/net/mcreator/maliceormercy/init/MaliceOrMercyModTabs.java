
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.maliceormercy.MaliceOrMercyMod;

public class MaliceOrMercyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MaliceOrMercyMod.MODID);
	public static final RegistryObject<CreativeModeTab> MALICE_OR_MERCY = REGISTRY.register("malice_or_mercy",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.malice_or_mercy.malice_or_mercy")).icon(() -> new ItemStack(MaliceOrMercyModBlocks.CORRUPT_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_LOG.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_PLANKS.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_STAIRS.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_SLAB.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_FENCE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_FENCE_GATE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_NYLIUM.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_STONE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_SCALE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_SAND.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_SANDSTONE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CUT_CORRUPT_SANDSTONE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CHISELED_CORRUPT_SANDSTONE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.SMOOTH_CORRUPT_SANDSTONE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.RUBY_ORE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.SAPPHIRE_ORE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.DEEPSLATE_RUBY_ORE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.BLOCK_OF_RUBY.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.BLOCK_OF_SAPPHIRE.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_ROOTS.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_BERRY_VINE.get().asItem());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_COIN.get());
				tabData.accept(MaliceOrMercyModItems.COPPER_COIN.get());
				tabData.accept(MaliceOrMercyModItems.DIAMOND_COIN.get());
				tabData.accept(MaliceOrMercyModItems.EMERALD_COIN.get());
				tabData.accept(MaliceOrMercyModItems.GOLD_COIN.get());
				tabData.accept(MaliceOrMercyModItems.ONYX_COIN.get());
				tabData.accept(MaliceOrMercyModItems.QUARTZ_COIN.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_COIN.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_COIN.get());
				tabData.accept(MaliceOrMercyModItems.SILVER_COIN.get());
				tabData.accept(MaliceOrMercyModItems.RUBY.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_FLESH.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_BONE.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_POWDER.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_DUST.get());
				tabData.accept(MaliceOrMercyModItems.SNAPPED_CORRUPT_BONE.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_BONE_SHARD.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_BERRIES.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_APPLE.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_APPLE.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_APPLE.get());
				tabData.accept(MaliceOrMercyModItems.DIAMOND_APPLE.get());
				tabData.accept(MaliceOrMercyModItems.ENCHANTED_AMETHYST_APPLE.get());
				tabData.accept(MaliceOrMercyModItems.ENCHANTED_RUBY_APPLE.get());
				tabData.accept(MaliceOrMercyModItems.ENCHANTED_SAPPHIRE_APPLE.get());
				tabData.accept(MaliceOrMercyModItems.ENCHANTED_DIAMOND_APPLE.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_ARMOR_HELMET.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_ARMOR_CHESTPLATE.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_ARMOR_LEGGINGS.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_ARMOR_BOOTS.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_SWORD.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_AXE.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_PICKAXE.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_SHOVEL.get());
				tabData.accept(MaliceOrMercyModItems.AMETHYST_HOE.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_ARMOUR_HELMET.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_ARMOUR_CHESTPLATE.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_ARMOUR_LEGGINGS.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_ARMOUR_BOOTS.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_SWORD.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_AXE.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_PICKAXE.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_SHOVEL.get());
				tabData.accept(MaliceOrMercyModItems.RUBY_HOE.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_ARMOUR_HELMET.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_ARMOUR_CHESTPLATE.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_ARMOUR_LEGGINGS.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_ARMOUR_BOOTS.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_SWORD.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_AXE.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_PICKAXE.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_SHOVEL.get());
				tabData.accept(MaliceOrMercyModItems.SAPPHIRE_HOE.get());
				tabData.accept(MaliceOrMercyModItems.HUMAN_SPAWN_EGG.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_FIEND_SPAWN_EGG.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_HOUND_SPAWN_EGG.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_SPIDER_SPAWN_EGG.get());
				tabData.accept(MaliceOrMercyModItems.CORRUPT_BEAST_SPAWN_EGG.get());
				tabData.accept(MaliceOrMercyModItems.THE_CORRUPTION.get());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_FIRE.get().asItem());
				tabData.accept(MaliceOrMercyModItems.LIQUID_CORRUPTION_BUCKET.get());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_SPROUTS.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_PUMPKIN.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CARVED_CORRUPT_PUMPKIN.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_PUMPKIN_LANTERN.get().asItem());
				tabData.accept(MaliceOrMercyModBlocks.CORRUPT_STONE_BRICKS.get().asItem());
				tabData.accept(MaliceOrMercyModItems.FALLEN_SWORDSMAN_SPAWN_EGG.get());
				tabData.accept(MaliceOrMercyModItems.FALLEN_ARCHER_SPAWN_EGG.get());
			})

					.build());
}
