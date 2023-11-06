package net.mcreator.maliceormercy.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.maliceormercy.init.MaliceOrMercyModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CorruptFireUpdateTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		double soundState = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MaliceOrMercyModBlocks.CORRUPT_FIRE.get()) {
			particleAmount = 4;
			particleRadius = 1;
			for (int index0 = 0; index0 < (int) particleAmount; index0++) {
				world.addParticle(ParticleTypes.LARGE_SMOKE, (x + 0.5 + Mth.nextDouble(RandomSource.create(), -0.5, 0.5) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), 0, 2) * particleRadius),
						(z + 0.5 + Mth.nextDouble(RandomSource.create(), -0.5, 0.5) * particleRadius), 0, 0, 0);
			}
			if (Math.random() < 0.25) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
