
package net.mcreator.maliceormercy.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.maliceormercy.init.MaliceOrMercyModItems;
import net.mcreator.maliceormercy.init.MaliceOrMercyModFluids;
import net.mcreator.maliceormercy.init.MaliceOrMercyModFluidTypes;
import net.mcreator.maliceormercy.init.MaliceOrMercyModBlocks;

public abstract class LiquidCorruptionFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MaliceOrMercyModFluidTypes.LIQUID_CORRUPTION_TYPE.get(), () -> MaliceOrMercyModFluids.LIQUID_CORRUPTION.get(),
			() -> MaliceOrMercyModFluids.FLOWING_LIQUID_CORRUPTION.get()).explosionResistance(100f).bucket(() -> MaliceOrMercyModItems.LIQUID_CORRUPTION_BUCKET.get()).block(() -> (LiquidBlock) MaliceOrMercyModBlocks.LIQUID_CORRUPTION.get());

	private LiquidCorruptionFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_OBSIDIAN_TEAR;
	}

	public static class Source extends LiquidCorruptionFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidCorruptionFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
