
package net.mcreator.maliceormercy.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.maliceormercy.procedures.FearActiveTickConditionProcedure;

public class FearMobEffect extends MobEffect {
	public FearMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
	}

	@Override
	public String getDescriptionId() {
		return "effect.malice_or_mercy.fear";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FearActiveTickConditionProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
