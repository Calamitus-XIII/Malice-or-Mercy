
package net.mcreator.maliceormercy.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.DungeonHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.monster.Strider;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Giant;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.animal.sniffer.Sniffer;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.animal.horse.TraderLlama;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.horse.Mule;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.Donkey;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.frog.Tadpole;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.animal.camel.Camel;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.SnowGolem;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.entity.animal.PolarBear;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.animal.Panda;
import net.minecraft.world.entity.animal.Ocelot;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.Dolphin;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.maliceormercy.procedures.CorruptFiendThisEntityKillsAnotherOneProcedure;
import net.mcreator.maliceormercy.init.MaliceOrMercyModEntities;

public class CorruptFiendEntity extends Monster {
	public CorruptFiendEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(MaliceOrMercyModEntities.CORRUPT_FIEND.get(), world);
	}

	public CorruptFiendEntity(EntityType<CorruptFiendEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 5;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new BreakDoorGoal(this, e -> true));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, HumanEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Villager.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, WanderingTrader.class, false, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Blaze.class, false, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, CaveSpider.class, false, false));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Creeper.class, false, false));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, EnderDragon.class, false, false));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Drowned.class, false, false));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, ElderGuardian.class, false, false));
		this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, EnderMan.class, false, false));
		this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Endermite.class, false, false));
		this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Evoker.class, false, false));
		this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, Ghast.class, false, false));
		this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Giant.class, false, false));
		this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, Guardian.class, false, false));
		this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, Hoglin.class, false, false));
		this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, Husk.class, false, false));
		this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, Illusioner.class, false, false));
		this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, MagmaCube.class, false, false));
		this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, Phantom.class, false, false));
		this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, Piglin.class, false, false));
		this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, PiglinBrute.class, false, false));
		this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, Pillager.class, false, false));
		this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, Ravager.class, false, false));
		this.targetSelector.addGoal(32, new NearestAttackableTargetGoal(this, Shulker.class, false, false));
		this.targetSelector.addGoal(33, new NearestAttackableTargetGoal(this, Silverfish.class, false, false));
		this.targetSelector.addGoal(34, new NearestAttackableTargetGoal(this, Skeleton.class, false, false));
		this.targetSelector.addGoal(35, new NearestAttackableTargetGoal(this, Slime.class, false, false));
		this.targetSelector.addGoal(36, new NearestAttackableTargetGoal(this, Spider.class, false, false));
		this.targetSelector.addGoal(37, new NearestAttackableTargetGoal(this, Stray.class, false, false));
		this.targetSelector.addGoal(38, new NearestAttackableTargetGoal(this, Vex.class, false, false));
		this.targetSelector.addGoal(39, new NearestAttackableTargetGoal(this, Vindicator.class, false, false));
		this.targetSelector.addGoal(40, new NearestAttackableTargetGoal(this, Warden.class, false, false));
		this.targetSelector.addGoal(41, new NearestAttackableTargetGoal(this, Witch.class, false, false));
		this.targetSelector.addGoal(42, new NearestAttackableTargetGoal(this, WitherBoss.class, false, false));
		this.targetSelector.addGoal(43, new NearestAttackableTargetGoal(this, WitherSkeleton.class, false, false));
		this.targetSelector.addGoal(44, new NearestAttackableTargetGoal(this, Zoglin.class, false, false));
		this.targetSelector.addGoal(45, new NearestAttackableTargetGoal(this, Zombie.class, false, false));
		this.targetSelector.addGoal(46, new NearestAttackableTargetGoal(this, ZombieVillager.class, false, false));
		this.targetSelector.addGoal(47, new NearestAttackableTargetGoal(this, ZombifiedPiglin.class, false, false));
		this.targetSelector.addGoal(48, new NearestAttackableTargetGoal(this, Allay.class, false, false));
		this.targetSelector.addGoal(49, new NearestAttackableTargetGoal(this, Axolotl.class, false, false));
		this.targetSelector.addGoal(50, new NearestAttackableTargetGoal(this, Bat.class, false, false));
		this.targetSelector.addGoal(51, new NearestAttackableTargetGoal(this, Bee.class, false, false));
		this.targetSelector.addGoal(52, new NearestAttackableTargetGoal(this, Camel.class, false, false));
		this.targetSelector.addGoal(53, new NearestAttackableTargetGoal(this, Cat.class, false, false));
		this.targetSelector.addGoal(54, new NearestAttackableTargetGoal(this, Chicken.class, false, false));
		this.targetSelector.addGoal(55, new NearestAttackableTargetGoal(this, Cod.class, false, false));
		this.targetSelector.addGoal(56, new NearestAttackableTargetGoal(this, Cow.class, false, false));
		this.targetSelector.addGoal(57, new NearestAttackableTargetGoal(this, Dolphin.class, false, false));
		this.targetSelector.addGoal(58, new NearestAttackableTargetGoal(this, Donkey.class, false, false));
		this.targetSelector.addGoal(59, new NearestAttackableTargetGoal(this, Fox.class, false, false));
		this.targetSelector.addGoal(60, new NearestAttackableTargetGoal(this, Frog.class, false, false));
		this.targetSelector.addGoal(61, new NearestAttackableTargetGoal(this, GlowSquid.class, false, false));
		this.targetSelector.addGoal(62, new NearestAttackableTargetGoal(this, Goat.class, false, false));
		this.targetSelector.addGoal(63, new NearestAttackableTargetGoal(this, Horse.class, false, false));
		this.targetSelector.addGoal(64, new NearestAttackableTargetGoal(this, IronGolem.class, false, false));
		this.targetSelector.addGoal(65, new NearestAttackableTargetGoal(this, Llama.class, false, false));
		this.targetSelector.addGoal(66, new NearestAttackableTargetGoal(this, MushroomCow.class, false, false));
		this.targetSelector.addGoal(67, new NearestAttackableTargetGoal(this, Mule.class, false, false));
		this.targetSelector.addGoal(68, new NearestAttackableTargetGoal(this, Ocelot.class, false, false));
		this.targetSelector.addGoal(69, new NearestAttackableTargetGoal(this, Panda.class, false, false));
		this.targetSelector.addGoal(70, new NearestAttackableTargetGoal(this, Parrot.class, false, false));
		this.targetSelector.addGoal(71, new NearestAttackableTargetGoal(this, Pig.class, false, false));
		this.targetSelector.addGoal(72, new NearestAttackableTargetGoal(this, PolarBear.class, false, false));
		this.targetSelector.addGoal(73, new NearestAttackableTargetGoal(this, Pufferfish.class, false, false));
		this.targetSelector.addGoal(74, new NearestAttackableTargetGoal(this, Rabbit.class, false, false));
		this.targetSelector.addGoal(75, new NearestAttackableTargetGoal(this, Salmon.class, false, false));
		this.targetSelector.addGoal(76, new NearestAttackableTargetGoal(this, Sheep.class, false, false));
		this.targetSelector.addGoal(77, new NearestAttackableTargetGoal(this, SkeletonHorse.class, false, false));
		this.targetSelector.addGoal(78, new NearestAttackableTargetGoal(this, Sniffer.class, false, false));
		this.targetSelector.addGoal(79, new NearestAttackableTargetGoal(this, SnowGolem.class, false, false));
		this.targetSelector.addGoal(80, new NearestAttackableTargetGoal(this, Squid.class, false, false));
		this.targetSelector.addGoal(81, new NearestAttackableTargetGoal(this, Strider.class, false, false));
		this.targetSelector.addGoal(82, new NearestAttackableTargetGoal(this, Tadpole.class, false, false));
		this.targetSelector.addGoal(83, new NearestAttackableTargetGoal(this, TraderLlama.class, false, false));
		this.targetSelector.addGoal(84, new NearestAttackableTargetGoal(this, TropicalFish.class, false, false));
		this.targetSelector.addGoal(85, new NearestAttackableTargetGoal(this, Turtle.class, false, false));
		this.targetSelector.addGoal(86, new NearestAttackableTargetGoal(this, Wolf.class, false, false));
		this.targetSelector.addGoal(87, new NearestAttackableTargetGoal(this, ZombieHorse.class, false, false));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("malice_or_mercy:entity.corrupt_fiend.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("malice_or_mercy:entity.corrupt_fiend.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("malice_or_mercy:entity.corrupt_fiend.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("malice_or_mercy:entity.corrupt_fiend.death"));
	}

	@Override
	public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
		super.awardKillScore(entity, score, damageSource);
		CorruptFiendThisEntityKillsAnotherOneProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), entity);
	}

	public static void init() {
		SpawnPlacements.register(MaliceOrMercyModEntities.CORRUPT_FIEND.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
		DungeonHooks.addDungeonMob(MaliceOrMercyModEntities.CORRUPT_FIEND.get(), 180);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		return builder;
	}
}
