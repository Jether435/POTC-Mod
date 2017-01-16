package com.ModMayhem.POTCMod.Entity;

public class EntitySeaSerpent {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
