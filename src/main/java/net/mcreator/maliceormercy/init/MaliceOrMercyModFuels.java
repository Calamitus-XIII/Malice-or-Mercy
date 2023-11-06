
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class MaliceOrMercyModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == MaliceOrMercyModItems.CORRITE.get())
			event.setBurnTime(2400);
		else if (itemstack.getItem() == MaliceOrMercyModBlocks.BLOCK_OF_CORRITE.get().asItem())
			event.setBurnTime(21600);
	}
}
