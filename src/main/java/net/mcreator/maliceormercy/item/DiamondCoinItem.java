
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondCoinItem extends Item {
	public DiamondCoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
