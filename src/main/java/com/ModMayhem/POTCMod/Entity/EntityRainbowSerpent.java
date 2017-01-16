package com.ModMayhem.POTCMod.Entity;

public class EntityRainbowSerpent {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
