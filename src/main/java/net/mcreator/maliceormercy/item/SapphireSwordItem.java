
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.maliceormercy.init.MaliceOrMercyModItems;

public class SapphireSwordItem extends SwordItem {
	public SapphireSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1941;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MaliceOrMercyModItems.SAPPHIRE.get()));
			}
		}, 3, -2.2f, new Item.Properties());
	}
}
