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
	public LockerChunkProvider chunkProvider;
public void registerWorldManager(){
	this.dimensionId = POTCMod.DimID;
	this.hasNoSky = true;
}
@Override
public float[] calcSunriseSunsetColors(float celestialAngle, float f1) {
	return null;
	}
	public String getDimensionName() {
		return "Locker";
	}
public int getAverageGroundLevel(){
	return 0;
}
@Override
public Vec3 getFogColor(float f, float f1)
{
	return Vec3.createVectorHelper(255, 255, 255);
}
@Override
public boolean isSkyColored()
{
	 return true;
}
@Override
public boolean canRespawnHere()
{
return false;
}
@Override
public String getWelcomeMessage()
{
return "You have been Damned to Davy Jones' Locker!";
}
@Override
public String getDepartMessage() {
	return "You Will Never Be Free From Me, You... PIRATE!";
}
@Override
public boolean isDaytime() {
	return true;
}
@Override
public Vec3 getSkyColor(Entity cameraEntity, float partialTicks) {
	return Vec3.createVectorHelper(255, 255, 255);
}
@Override
public float getStarBrightness(float par1) {
	return 0.0F;
}
}