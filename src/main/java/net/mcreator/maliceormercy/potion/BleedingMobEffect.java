
package net.mcreator.maliceormercy.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.maliceormercy.procedures.BleedingOnEffectActiveTickProcedure;
import net.mcreator.maliceormercy.procedures.BleedingActiveTickConditionProcedure;

public class BleedingMobEffect extends MobEffect {
	public BleedingMobEffect() {
		super(MobEffectCategory.HARMFUL, -6160384);
	}

	@Override
	public String getDescriptionId() {
		return "effect.malice_or_mercy.bleeding";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BleedingOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return BleedingActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
