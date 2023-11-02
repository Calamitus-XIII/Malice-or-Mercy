
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.maliceormercy.init.MaliceOrMercyModItems;

public class SapphireHoeItem extends HoeItem {
	public SapphireHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1941;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
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
		}, 0, 0f, new Item.Properties());
	}
}
