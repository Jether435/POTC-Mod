package com.ModMayhem.POTCMod.Entity;

public class EntityCursedPirateChest {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}