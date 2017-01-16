package com.ModMayhem.POTCMod.Entity;

public class EntityPterodactyl {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
