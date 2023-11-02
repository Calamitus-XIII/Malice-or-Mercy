
package net.mcreator.maliceormercy.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.maliceormercy.procedures.MarkedEffectStartedappliedProcedure;
import net.mcreator.maliceormercy.procedures.MarkedEffectExpiresProcedure;
import net.mcreator.maliceormercy.procedures.MarkedActiveTickConditionProcedure;

public class MarkedMobEffect extends MobEffect {
	public MarkedMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.malice_or_mercy.marked";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MarkedEffectStartedappliedProcedure.execute(entity.level(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MarkedEffectExpiresProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return MarkedActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
