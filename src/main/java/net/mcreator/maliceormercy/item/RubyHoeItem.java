
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.maliceormercy.init.MaliceOrMercyModItems;

public class RubyHoeItem extends HoeItem {
	public RubyHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1874;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MaliceOrMercyModItems.RUBY.get()));
			}
		}, 0, 0f, new Item.Properties());
	}
}
