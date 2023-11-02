
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.maliceormercy.entity.HumanEntity;
import net.mcreator.maliceormercy.entity.CorruptTormentorEntity;
import net.mcreator.maliceormercy.entity.CorruptSpiderEntity;
import net.mcreator.maliceormercy.entity.CorruptHoundEntity;
import net.mcreator.maliceormercy.entity.CorruptFiendEntity;
import net.mcreator.maliceormercy.entity.CorruptBeastEntity;
import net.mcreator.maliceormercy.MaliceOrMercyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MaliceOrMercyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MaliceOrMercyMod.MODID);
	public static final RegistryObject<EntityType<HumanEntity>> HUMAN = register("human",
			EntityType.Builder.<HumanEntity>of(HumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HumanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptFiendEntity>> CORRUPT_FIEND = register("corrupt_fiend",
			EntityType.Builder.<CorruptFiendEntity>of(CorruptFiendEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptFiendEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptHoundEntity>> CORRUPT_HOUND = register("corrupt_hound",
			EntityType.Builder.<CorruptHoundEntity>of(CorruptHoundEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptHoundEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptBeastEntity>> CORRUPT_BEAST = register("corrupt_beast",
			EntityType.Builder.<CorruptBeastEntity>of(CorruptBeastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptBeastEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptTormentorEntity>> CORRUPT_TORMENTOR = register("corrupt_tormentor", EntityType.Builder.<CorruptTormentorEntity>of(CorruptTormentorEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptTormentorEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorruptSpiderEntity>> CORRUPT_SPIDER = register("corrupt_spider",
			EntityType.Builder.<CorruptSpiderEntity>of(CorruptSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptSpiderEntity::new)

					.sized(1.4f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HumanEntity.init();
			CorruptFiendEntity.init();
			CorruptHoundEntity.init();
			CorruptBeastEntity.init();
			CorruptTormentorEntity.init();
			CorruptSpiderEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HUMAN.get(), HumanEntity.createAttributes().build());
		event.put(CORRUPT_FIEND.get(), CorruptFiendEntity.createAttributes().build());
		event.put(CORRUPT_HOUND.get(), CorruptHoundEntity.createAttributes().build());
		event.put(CORRUPT_BEAST.get(), CorruptBeastEntity.createAttributes().build());
		event.put(CORRUPT_TORMENTOR.get(), CorruptTormentorEntity.createAttributes().build());
		event.put(CORRUPT_SPIDER.get(), CorruptSpiderEntity.createAttributes().build());
	}
}
