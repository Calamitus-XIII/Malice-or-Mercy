
package net.mcreator.maliceormercy.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.maliceormercy.procedures.LiquidCorruptionMobplayerCollidesBlockProcedure;
import net.mcreator.maliceormercy.init.MaliceOrMercyModFluids;

public class LiquidCorruptionBlock extends LiquidBlock {
	public LiquidCorruptionBlock() {
		super(() -> MaliceOrMercyModFluids.LIQUID_CORRUPTION.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).noCollission()
				.noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		LiquidCorruptionMobplayerCollidesBlockProcedure.execute(entity);
	}
}
