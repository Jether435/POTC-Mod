package com.ModMayhem.POTCMod.Entity;

public class EntitySalazar {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
