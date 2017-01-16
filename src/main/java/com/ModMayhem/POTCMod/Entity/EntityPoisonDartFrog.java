package com.ModMayhem.POTCMod.Entity;

public class EntityPoisonDartFrog {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
