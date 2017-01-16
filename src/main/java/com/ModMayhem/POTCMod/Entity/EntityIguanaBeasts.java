package com.ModMayhem.POTCMod.Entity;

public class EntityIguanaBeasts {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
