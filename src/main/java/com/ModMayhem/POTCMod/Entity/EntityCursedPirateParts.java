package com.ModMayhem.POTCMod.Entity;

public class EntityCursedPirateParts {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
