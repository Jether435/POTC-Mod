package com.ModMayhem.POTCMod.World;

import com.ModMayhem.POTCMod.POTCMod;
import com.ModMayhem.POTCMod.Entity.EntityRockCrab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class LockerBiome extends BiomeGenBase{
private WorldGenerator LockerBiomeGeneratorCrashedShip1;
public final Material blockMaterial;
public LockerBiome(int par1) {
		super(par1);
		this.rainfall = 0F;
		this.blockMaterial = Material.water;
		this.heightVariation = 0.0F;
		this.temperature = 20F;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		spawnableCreatureList.add(new SpawnListEntry(com.ModMayhem.POTCMod.Entity.EntityRockCrab.class, 12, 4, 4));
		final Block topBlockID = POTCMod.LockerSand;
		final Block fillBlockID = POTCMod.LockerSand;
		this.enableRain = false;
		this.enableSnow = false;
		this.setBiomeName("Locker");
		this.waterColorMultiplier = 0xffffff;
		
		
	}
@Override
public float getSpawningChance()
{
    return 0.12F;
}

}
