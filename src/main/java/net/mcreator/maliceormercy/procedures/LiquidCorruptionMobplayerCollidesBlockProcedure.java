package net.mcreator.maliceormercy.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.maliceormercy.init.MaliceOrMercyModMobEffects;

public class LiquidCorruptionMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double generator_distance = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("malice_or_mercy:corrupt_entity")))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MaliceOrMercyModMobEffects.CORRUPTION.get(), 100, 2));
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
					@Override
					public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
						String _translatekey = "death.attack." + "liquid_corruption";
						if (this.getEntity() == null && this.getDirectEntity() == null) {
							return _msgEntity.getKillCredit() != null
									? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
									: Component.translatable(_translatekey, _msgEntity.getDisplayName());
						} else {
							Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
							ItemStack _itemstack = ItemStack.EMPTY;
							if (this.getEntity() instanceof LivingEntity _livingentity)
								_itemstack = _livingentity.getMainHandItem();
							return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
									? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
									: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
						}
					}
				}, 2);
		}
	}
}
