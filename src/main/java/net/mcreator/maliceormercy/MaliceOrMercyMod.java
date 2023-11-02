/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.maliceormercy;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.maliceormercy.init.MaliceOrMercyModTabs;
import net.mcreator.maliceormercy.init.MaliceOrMercyModSounds;
import net.mcreator.maliceormercy.init.MaliceOrMercyModPotions;
import net.mcreator.maliceormercy.init.MaliceOrMercyModMobEffects;
import net.mcreator.maliceormercy.init.MaliceOrMercyModItems;
import net.mcreator.maliceormercy.init.MaliceOrMercyModFluids;
import net.mcreator.maliceormercy.init.MaliceOrMercyModFluidTypes;
import net.mcreator.maliceormercy.init.MaliceOrMercyModFeatures;
import net.mcreator.maliceormercy.init.MaliceOrMercyModEntities;
import net.mcreator.maliceormercy.init.MaliceOrMercyModEnchantments;
import net.mcreator.maliceormercy.init.MaliceOrMercyModBlocks;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("malice_or_mercy")
public class MaliceOrMercyMod {
	public static final Logger LOGGER = LogManager.getLogger(MaliceOrMercyMod.class);
	public static final String MODID = "malice_or_mercy";

	public MaliceOrMercyMod() {
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MaliceOrMercyModSounds.REGISTRY.register(bus);
		MaliceOrMercyModBlocks.REGISTRY.register(bus);

		MaliceOrMercyModItems.REGISTRY.register(bus);
		MaliceOrMercyModEntities.REGISTRY.register(bus);
		MaliceOrMercyModEnchantments.REGISTRY.register(bus);
		MaliceOrMercyModTabs.REGISTRY.register(bus);
		MaliceOrMercyModFeatures.REGISTRY.register(bus);
		MaliceOrMercyModMobEffects.REGISTRY.register(bus);
		MaliceOrMercyModPotions.REGISTRY.register(bus);

		MaliceOrMercyModFluids.REGISTRY.register(bus);
		MaliceOrMercyModFluidTypes.REGISTRY.register(bus);
	}

	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		workQueue.add(new AbstractMap.SimpleEntry(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
