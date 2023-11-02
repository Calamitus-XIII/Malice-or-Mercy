
package net.mcreator.maliceormercy.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.maliceormercy.procedures.CorruptionOnEffectActiveTickProcedure;
import net.mcreator.maliceormercy.procedures.CorruptionActiveTickConditionProcedure;

public class CorruptionMobEffect extends MobEffect {
	public CorruptionMobEffect() {
		super(MobEffectCategory.HARMFUL, -6750004);
	}

	@Override
	public String getDescriptionId() {
		return "effect.malice_or_mercy.corruption";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CorruptionOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return CorruptionActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
