package com.ModMayhem.POTCMod.Entity;

public class EntityPirate {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
