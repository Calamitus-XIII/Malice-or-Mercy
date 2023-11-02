
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RubyCoinItem extends Item {
	public RubyCoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
