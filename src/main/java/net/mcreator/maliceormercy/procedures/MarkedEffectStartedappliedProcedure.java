package net.mcreator.maliceormercy.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.maliceormercy.network.MaliceOrMercyModVariables;
import net.mcreator.maliceormercy.init.MaliceOrMercyModMobEffects;

public class MarkedEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		MaliceOrMercyModVariables.MapVariables.get(world).MarkedCounter = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MaliceOrMercyModMobEffects.MARKED.get())
				? _livEnt.getEffect(MaliceOrMercyModMobEffects.MARKED.get()).getAmplifier()
				: 0;
		MaliceOrMercyModVariables.MapVariables.get(world).syncData(world);
	}
}
