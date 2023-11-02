
package net.mcreator.maliceormercy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.maliceormercy.init.MaliceOrMercyModFluids;

public class LiquidCorruptionItem extends BucketItem {
	public LiquidCorruptionItem() {
		super(MaliceOrMercyModFluids.LIQUID_CORRUPTION, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
