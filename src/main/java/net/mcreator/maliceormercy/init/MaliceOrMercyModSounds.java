
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maliceormercy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.maliceormercy.MaliceOrMercyMod;

public class MaliceOrMercyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MaliceOrMercyMod.MODID);
	public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_AMETHYST = REGISTRY.register("item.armor.equip_amethyst", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "item.armor.equip_amethyst")));
	public static final RegistryObject<SoundEvent> ENTITY_CORRUPT_FIEND_DEATH = REGISTRY.register("entity.corrupt_fiend.death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "entity.corrupt_fiend.death")));
	public static final RegistryObject<SoundEvent> ENTITY_CORRUPT_FIEND_HURT = REGISTRY.register("entity.corrupt_fiend.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "entity.corrupt_fiend.hurt")));
	public static final RegistryObject<SoundEvent> ENTITY_CORRUPT_FIEND_STEP = REGISTRY.register("entity.corrupt_fiend.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "entity.corrupt_fiend.step")));
	public static final RegistryObject<SoundEvent> ENTITY_CORRUPT_FIEND_AMBIENT = REGISTRY.register("entity.corrupt_fiend.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "entity.corrupt_fiend.ambient")));
	public static final RegistryObject<SoundEvent> ENTITY_CORRUPT_HOUND_DEATH = REGISTRY.register("entity.corrupt_hound.death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "entity.corrupt_hound.death")));
	public static final RegistryObject<SoundEvent> ENTITY_CORRUPT_HOUND_HURT = REGISTRY.register("entity.corrupt_hound.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "entity.corrupt_hound.hurt")));
	public static final RegistryObject<SoundEvent> ENTITY_CORRUPT_HOUND_STEP = REGISTRY.register("entity.corrupt_hound.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "entity.corrupt_hound.step")));
	public static final RegistryObject<SoundEvent> ENTITY_CORRUPT_HOUND_AMBIENT = REGISTRY.register("entity.corrupt_hound.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "entity.corrupt_hound.ambient")));
	public static final RegistryObject<SoundEvent> ENTITY_CORRUPT_HOUND_TARGET = REGISTRY.register("entity.corrupt_hound.target", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "entity.corrupt_hound.target")));
	public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_RUBY = REGISTRY.register("item.armor.equip_ruby", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "item.armor.equip_ruby")));
	public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_SAPPHIRE = REGISTRY.register("item.armor.equip_sapphire", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "item.armor.equip_sapphire")));
	public static final RegistryObject<SoundEvent> EFFECT_MARKED_EXECUTE = REGISTRY.register("effect.marked_execute", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("malice_or_mercy", "effect.marked_execute")));
}
