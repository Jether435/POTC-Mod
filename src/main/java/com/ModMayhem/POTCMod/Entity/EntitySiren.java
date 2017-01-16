package com.ModMayhem.POTCMod.Entity;

public class EntitySiren {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
