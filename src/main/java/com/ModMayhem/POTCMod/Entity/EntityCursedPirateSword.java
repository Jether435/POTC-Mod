package com.ModMayhem.POTCMod.Entity;

public class EntityCursedPirateSword {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
