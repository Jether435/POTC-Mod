package com.ModMayhem.POTCMod.Entity;

public class EntitySerpiente {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
