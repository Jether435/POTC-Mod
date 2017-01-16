package com.ModMayhem.POTCMod.Entity;

public class EntityKraken {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
