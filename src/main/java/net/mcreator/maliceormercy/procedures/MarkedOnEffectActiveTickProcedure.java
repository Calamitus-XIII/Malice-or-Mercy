package net.mcreator.maliceormercy.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.maliceormercy.init.MaliceOrMercyModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MarkedOnEffectActiveTickProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double amplifier = 0;
		double duration = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MaliceOrMercyModMobEffects.MARKED.get())) {
			amplifier = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MaliceOrMercyModMobEffects.MARKED.get()) ? _livEnt.getEffect(MaliceOrMercyModMobEffects.MARKED.get()).getAmplifier() : 0;
			duration = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MaliceOrMercyModMobEffects.MARKED.get()) ? _livEnt.getEffect(MaliceOrMercyModMobEffects.MARKED.get()).getDuration() : 0;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MaliceOrMercyModMobEffects.MARKED.get());
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MaliceOrMercyModMobEffects.MARKED.get(), (int) (duration + 100), (int) (amplifier + 1)));
		}
	}
}
