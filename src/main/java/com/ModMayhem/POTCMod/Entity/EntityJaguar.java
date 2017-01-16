package com.ModMayhem.POTCMod.Entity;

public class EntityJaguar {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
