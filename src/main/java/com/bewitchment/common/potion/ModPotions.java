package com.bewitchment.common.potion;

import com.bewitchment.common.potion.potions.PotionBloodDrained;
import com.bewitchment.common.potion.potions.brews.*;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModPotions {

	// Normal effects
	public static Potion bloodDrained;

	// Also brews
	public static Potion wolfsbane, arrow_deflect, absence, plant, bane_arthropods, corruption, cursed_leaping, demons_bane;
	public static Potion projectile_resistance, disrobing, ender_inhibition, extinguish_fires, fertilize, fireworld, grace;
	public static Potion purification, flower_growth, harvest, holy_water, ice_world, outcasts_shame, infestation, ozymandias;

	public static PotionFrostbite freezing;

	private ModPotions() {
	}

	public static void init() {
		bloodDrained = new PotionBloodDrained();
		wolfsbane = new PotionWolfsbane();
		arrow_deflect = new PotionArrowDeflection();
		absence = new PotionAbsence();
		plant = new PotionPlant();
		bane_arthropods = new PotionBaneArthropods();
		corruption = new PotionCorruption();
		cursed_leaping = new PotionCursedLeaping();
		demons_bane = new PotionDemonsbane();
		projectile_resistance = new PotionProjectileResistance();
		disrobing = new PotionDisrobing();
		ender_inhibition = new PotionEnderInhibition();
		extinguish_fires = new PotionExtinguishFire();
		fertilize = new PotionFertilize();
		fireworld = new PotionFireWorld();
		grace = new PotionGrace();
		freezing = new PotionFrostbite();
		purification = new PotionMending();
		flower_growth = new PotionGrowFlowers();
		harvest = new PotionHarvest();
		holy_water = new PotionHolyWater();
		ice_world = new PotionIceWorld();
		outcasts_shame = new PotionOutcastsShame();
		infestation = new PotionInfestation();
		ozymandias = new PotionOzymandias();

		ForgeRegistries.POTIONS.registerAll(//
				bloodDrained, wolfsbane, arrow_deflect, absence, plant, //
				bane_arthropods, corruption, cursed_leaping, demons_bane, //
				projectile_resistance, disrobing, ender_inhibition, extinguish_fires, //
				fertilize, freezing, fireworld, grace, purification, flower_growth, //
				harvest, holy_water, ice_world, outcasts_shame, infestation, ozymandias
		);
	}
}
