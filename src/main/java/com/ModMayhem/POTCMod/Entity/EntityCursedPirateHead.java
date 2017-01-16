package com.ModMayhem.POTCMod.Entity;

public class EntityCursedPirateHead {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
