package com.ModMayhem.POTCMod.Entity;

public class EntitySabertoothTiger {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
