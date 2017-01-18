package com.ModMayhem.POTCMod.World;

import com.ModMayhem.POTCMod.POTCMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;

public class LockerWorldProvider extends WorldProvider{
	IRenderHandler skyRenderer;
public void registerWorldChunkManager(){
	this.worldChunkMgr = new WorldChunkManager(POTCMod.LockerBiome, this.dimensionId,this.dimensionId);
	this.dimensionId = POTCMod.DimID;
	this.hasNoSky = true;
}
	
	public String getDimensionName() {
		return "Locker";
	}
public int getAverageGroundLevel(){
	return 0;
}
@Override
public Vec3 getSkyColor(Entity cameraEntity, float partialTicks)
{
	 return red.x = 0.0;
}

@Override
public boolean isSkyColored()
{
	 return true;
}
public boolean canRespawnHere()
{
return false;
}
public boolean isSurfaceWorld()
{
return true;
}
public boolean canCoordinateBeSpawn(int par1, int par2)
{
return false;
}
@SideOnly(Side.CLIENT)
public String getWelcomeMessage()
{
if ((this instanceof LockerWorldProvider))
{
return "You have been Damned to Davy Jones' Locker!";
}
return null;
}
}
