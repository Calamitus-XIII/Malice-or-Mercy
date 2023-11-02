
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.maliceormercy.init.MaliceOrMercyModItems;

public class SapphireShovelItem extends ShovelItem {
	public SapphireShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1941;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MaliceOrMercyModItems.SAPPHIRE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
