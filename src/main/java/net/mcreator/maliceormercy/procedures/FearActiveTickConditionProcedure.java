package net.mcreator.maliceormercy.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class FearActiveTickConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (Math.random() < 0.03) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:entity.warden.heartbeat master @p ~ ~ ~ 10 0");
			}
			if (Math.random() < 0.001) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:ambient.cave master @p ~ ~ ~ 10 0");
			}
			if (Math.random() < 0.001) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:entity.enderman.stare master @p ~ ~ ~ 10 0");
			}
			if (Math.random() < 0.001) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:block.sculk_shrieker.shriek master @p ~ ~ ~ 10 0");
			}
			if (Math.random() < 0.001) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:ambient.soul_sand_valley.mood master @p ~ ~ ~ 10 0");
			}
			if (Math.random() < 0.001) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:entity.vex.ambient master @p ~ ~ ~ 10 0");
			}
		}
		if (Math.random() < 0.002) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 1200, 0, false, false));
		}
		if (Math.random() < 0.0005) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0, false, false));
		}
		if (Math.random() < 0.0005) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200, 2, false, false));
		}
		if (Math.random() < 0.0005) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400, 2, false, false));
		}
		if (Math.random() < 0.0005) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 400, 2, false, false));
		}
		if (Math.random() < 0.0001) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
					@Override
					public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
						String _translatekey = "death.attack." + "fear";
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
