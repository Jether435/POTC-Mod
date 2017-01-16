package com.ModMayhem.POTCMod.Entity;

public class EntityCannibal {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
