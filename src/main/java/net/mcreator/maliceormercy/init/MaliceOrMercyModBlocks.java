
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.maliceormercy.block.TheCorruptionPortalBlock;
import net.mcreator.maliceormercy.block.SmoothCorruptSandstoneBlock;
import net.mcreator.maliceormercy.block.SapphireOreBlock;
import net.mcreator.maliceormercy.block.RubyOreBlock;
import net.mcreator.maliceormercy.block.LiquidCorruptionBlock;
import net.mcreator.maliceormercy.block.DeepslateSapphireOreBlock;
import net.mcreator.maliceormercy.block.DeepslateRubyOreBlock;
import net.mcreator.maliceormercy.block.CutCorruptSandstoneBlock;
import net.mcreator.maliceormercy.block.CorruptStoneBricksBlock;
import net.mcreator.maliceormercy.block.CorruptStoneBlock;
import net.mcreator.maliceormercy.block.CorruptStairsBlock;
import net.mcreator.maliceormercy.block.CorruptSproutsBlock;
import net.mcreator.maliceormercy.block.CorruptSlabBlock;
import net.mcreator.maliceormercy.block.CorruptScaleBlock;
import net.mcreator.maliceormercy.block.CorruptSandstoneBlock;
import net.mcreator.maliceormercy.block.CorruptSandBlock;
import net.mcreator.maliceormercy.block.CorruptRootsBlock;
import net.mcreator.maliceormercy.block.CorruptPumpkinLanternBlock;
import net.mcreator.maliceormercy.block.CorruptPumpkinBlock;
import net.mcreator.maliceormercy.block.CorruptPlanksBlock;
import net.mcreator.maliceormercy.block.CorruptNyliumBlock;
import net.mcreator.maliceormercy.block.CorruptLogBlock;
import net.mcreator.maliceormercy.block.CorruptFireBlock;
import net.mcreator.maliceormercy.block.CorruptFenceGateBlock;
import net.mcreator.maliceormercy.block.CorruptFenceBlock;
import net.mcreator.maliceormercy.block.CorruptBerryVineBlock;
import net.mcreator.maliceormercy.block.ChiseledCorruptSandstoneBlock;
import net.mcreator.maliceormercy.block.CarvedCorruptPumpkinBlock;
import net.mcreator.maliceormercy.block.BlockOfSapphireBlock;
import net.mcreator.maliceormercy.block.BlockOfRubyBlock;
import net.mcreator.maliceormercy.MaliceOrMercyMod;

public class MaliceOrMercyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MaliceOrMercyMod.MODID);
	public static final RegistryObject<Block> CORRUPT_LOG = REGISTRY.register("corrupt_log", () -> new CorruptLogBlock());
	public static final RegistryObject<Block> CORRUPT_PLANKS = REGISTRY.register("corrupt_planks", () -> new CorruptPlanksBlock());
	public static final RegistryObject<Block> CORRUPT_STAIRS = REGISTRY.register("corrupt_stairs", () -> new CorruptStairsBlock());
	public static final RegistryObject<Block> CORRUPT_SLAB = REGISTRY.register("corrupt_slab", () -> new CorruptSlabBlock());
	public static final RegistryObject<Block> CORRUPT_FENCE = REGISTRY.register("corrupt_fence", () -> new CorruptFenceBlock());
	public static final RegistryObject<Block> CORRUPT_FENCE_GATE = REGISTRY.register("corrupt_fence_gate", () -> new CorruptFenceGateBlock());
	public static final RegistryObject<Block> CORRUPT_NYLIUM = REGISTRY.register("corrupt_nylium", () -> new CorruptNyliumBlock());
	public static final RegistryObject<Block> CORRUPT_STONE = REGISTRY.register("corrupt_stone", () -> new CorruptStoneBlock());
	public static final RegistryObject<Block> CORRUPT_SCALE = REGISTRY.register("corrupt_scale", () -> new CorruptScaleBlock());
	public static final RegistryObject<Block> CORRUPT_SAND = REGISTRY.register("corrupt_sand", () -> new CorruptSandBlock());
	public static final RegistryObject<Block> CORRUPT_SANDSTONE = REGISTRY.register("corrupt_sandstone", () -> new CorruptSandstoneBlock());
	public static final RegistryObject<Block> CUT_CORRUPT_SANDSTONE = REGISTRY.register("cut_corrupt_sandstone", () -> new CutCorruptSandstoneBlock());
	public static final RegistryObject<Block> CHISELED_CORRUPT_SANDSTONE = REGISTRY.register("chiseled_corrupt_sandstone", () -> new ChiseledCorruptSandstoneBlock());
	public static final RegistryObject<Block> SMOOTH_CORRUPT_SANDSTONE = REGISTRY.register("smooth_corrupt_sandstone", () -> new SmoothCorruptSandstoneBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = REGISTRY.register("deepslate_ruby_ore", () -> new DeepslateRubyOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = REGISTRY.register("deepslate_sapphire_ore", () -> new DeepslateSapphireOreBlock());
	public static final RegistryObject<Block> BLOCK_OF_RUBY = REGISTRY.register("block_of_ruby", () -> new BlockOfRubyBlock());
	public static final RegistryObject<Block> BLOCK_OF_SAPPHIRE = REGISTRY.register("block_of_sapphire", () -> new BlockOfSapphireBlock());
	public static final RegistryObject<Block> CORRUPT_ROOTS = REGISTRY.register("corrupt_roots", () -> new CorruptRootsBlock());
	public static final RegistryObject<Block> CORRUPT_BERRY_VINE = REGISTRY.register("corrupt_berry_vine", () -> new CorruptBerryVineBlock());
	public static final RegistryObject<Block> THE_CORRUPTION_PORTAL = REGISTRY.register("the_corruption_portal", () -> new TheCorruptionPortalBlock());
	public static final RegistryObject<Block> CORRUPT_FIRE = REGISTRY.register("corrupt_fire", () -> new CorruptFireBlock());
	public static final RegistryObject<Block> LIQUID_CORRUPTION = REGISTRY.register("liquid_corruption", () -> new LiquidCorruptionBlock());
	public static final RegistryObject<Block> CORRUPT_SPROUTS = REGISTRY.register("corrupt_sprouts", () -> new CorruptSproutsBlock());
	public static final RegistryObject<Block> CORRUPT_PUMPKIN = REGISTRY.register("corrupt_pumpkin", () -> new CorruptPumpkinBlock());
	public static final RegistryObject<Block> CARVED_CORRUPT_PUMPKIN = REGISTRY.register("carved_corrupt_pumpkin", () -> new CarvedCorruptPumpkinBlock());
	public static final RegistryObject<Block> CORRUPT_PUMPKIN_LANTERN = REGISTRY.register("corrupt_pumpkin_lantern", () -> new CorruptPumpkinLanternBlock());
	public static final RegistryObject<Block> CORRUPT_STONE_BRICKS = REGISTRY.register("corrupt_stone_bricks", () -> new CorruptStoneBricksBlock());
}
