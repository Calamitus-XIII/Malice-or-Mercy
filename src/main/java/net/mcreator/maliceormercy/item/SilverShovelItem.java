
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.maliceormercy.init.MaliceOrMercyModItems;

public class SilverShovelItem extends ShovelItem {
	public SilverShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 486;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0.25f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MaliceOrMercyModItems.SILVER_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}