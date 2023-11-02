package net.mcreator.maliceormercy.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;

import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.animal.PolarBear;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.maliceormercy.init.MaliceOrMercyModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityFearInflictionProcedure {
	@SubscribeEvent
	public static void onEntitySetsAttackTarget(LivingChangeTargetEvent event) {
		execute(event, event.getOriginalTarget(), event.getEntity());
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof IronGolem || sourceentity instanceof EnderMan) {
			if (Math.random() < 0.25) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MaliceOrMercyModMobEffects.FEAR.get(), 1200, 0));
			}
		}
		if (sourceentity instanceof ElderGuardian || sourceentity instanceof PiglinBrute) {
			if (Math.random() < 0.25) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MaliceOrMercyModMobEffects.FEAR.get(), 1200, 0));
			}
		}
		if (sourceentity instanceof PolarBear || sourceentity instanceof Zoglin) {
			if (Math.random() < 0.25) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MaliceOrMercyModMobEffects.FEAR.get(), 1200, 0));
			}
		}
		if (sourceentity instanceof Ravager || sourceentity instanceof Warden) {
			if (Math.random() < 0.25) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MaliceOrMercyModMobEffects.FEAR.get(), 1200, 0));
			}
		}
		if (sourceentity instanceof WitherBoss || sourceentity instanceof EnderDragon) {
			if (Math.random() < 0.25) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MaliceOrMercyModMobEffects.FEAR.get(), 1200, 0));
			}
		}
	}
}
