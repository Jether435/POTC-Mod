package com.ModMayhem.POTCMod.Entity;

public class EntityCursedPirateLeftArm {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
