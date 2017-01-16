package com.ModMayhem.POTCMod.Entity;

public class EntityRockCrab {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
