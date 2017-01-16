package com.ModMayhem.POTCMod.Entity;

public class EntityCursedPirateLeftLeg {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
