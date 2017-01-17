package com.ModMayhem.POTCMod.World;

import com.ModMayhem.POTCMod.POTCMod;
import com.ModMayhem.POTCMod.Entity.EntityRockCrab;

import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class LockerBiome extends BiomeGenBase{
private WorldGenerator LockerBiomeGeneratorCrashedShip1;
public final Material blockMaterial;
public LockerBiome(int par1) {
		super(par1);
		this.blockMaterial = Material.water;
		this.minHeight = 0.1F;
		this.maxHeight = 0.1F;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = ((byte)POTCMod.LockerSand);
		this.fillerBlock = ((byte)POTCMod.LockerSand);
		this.spawnableMonsterList = List<EntityRockCrab.class>;
		this.enableRain = false;
		this.enableSnow = false;
		this.setBiomeName("Locker");
		this.waterColorMultiplier = 0xffffff;
	}


}
