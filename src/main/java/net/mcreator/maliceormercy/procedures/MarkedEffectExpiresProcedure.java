package net.mcreator.maliceormercy.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.maliceormercy.network.MaliceOrMercyModVariables;

public class MarkedEffectExpiresProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double amplifier = 0;
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
				@Override
				public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
					String _translatekey = "death.attack." + "execution";
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
			}, (float) (MaliceOrMercyModVariables.MapVariables.get(world).MarkedCounter * 2));
		MaliceOrMercyModVariables.MapVariables.get(world).MarkedCounter = 0;
		MaliceOrMercyModVariables.MapVariables.get(world).syncData(world);
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute at @s run playsound malice_or_mercy:effect.marked_execute neutral @ar");
			}
		}
	}
}
