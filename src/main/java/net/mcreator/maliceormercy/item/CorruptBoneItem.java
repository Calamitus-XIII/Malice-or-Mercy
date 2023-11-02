
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CorruptBoneItem extends Item {
	public CorruptBoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
