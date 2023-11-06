package net.mcreator.maliceormercy.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.maliceormercy.init.MaliceOrMercyModBlocks;

public class CorruptBeastNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MaliceOrMercyModBlocks.LIQUID_CORRUPTION.get())) {
			return false;
		}
		return true;
	}
}
