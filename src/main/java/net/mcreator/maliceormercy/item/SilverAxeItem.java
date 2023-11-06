
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.maliceormercy.init.MaliceOrMercyModItems;

public class SilverAxeItem extends AxeItem {
	public SilverAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 486;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 157;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MaliceOrMercyModItems.SILVER_INGOT.get()));
			}
		}, 1, -3.1f, new Item.Properties());
	}
}
