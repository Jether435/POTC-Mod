package com.ModMayhem.POTCMod.World;

import java.util.List;
import java.util.Random;

import com.ModMayhem.POTCMod.POTCMod;
import com.ModMayhem.POTCMod.Entity.EntityRockCrab;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.NoiseGeneratorOctaves;

public class LockerChunkProvider implements IChunkProvider{
private Random rand;
private World worldObj;
private final boolean mapFeaturesEnabled;
private BiomeGenBase[] biomesForGeneration;
public LockerChunkProvider(World par1World, long par2, boolean par4){
	this.worldObj = par1World;
	this.mapFeaturesEnabled = par4;
	this.rand = new Random(par2);
}
	public boolean chunkExists(int par1, int par2) {
		return true;
	}

	public Chunk provideChunk(int p_73154_1_, int p_73154_2_) {
		// TODO Auto-generated method stub
		return null;
	}


	public Chunk loadChunk(int p_73158_1_, int p_73158_2_) {
		// TODO Auto-generated method stub
		return null;
	}

	public void populate(IChunkProvider par1IChunkProvider, int par2, int par3) {
		
		
	}

	public boolean saveChunks(boolean p_73151_1_, IProgressUpdate p_73151_2_) {
		return false;
	}

	public boolean unloadQueuedChunks() {
		return false;
	}

	public boolean canSave() {
		return false;
	}

	public String makeString() {
		return null;
	}

	public List getPossibleCreatures(EnumCreatureType p_73155_1_, int p_73155_2_, int p_73155_3_, int p_73155_4_) {
		return POTCMod.EntityRockCrab;
	}
	public int getLoadedChunkCount() {
		return 0;
	}

	public void recreateStructures(int p_82695_1_, int p_82695_2_) {
		
		
	}

	public void saveExtraData() {
		
	}
	@Override
	public ChunkPosition func_147416_a(World p_147416_1_, String p_147416_2_, int p_147416_3_, int p_147416_4_,
			int p_147416_5_) {
		return null;
	}

}
