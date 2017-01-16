package com.ModMayhem.POTCMod.Entity;

public class EntityJumbee {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
