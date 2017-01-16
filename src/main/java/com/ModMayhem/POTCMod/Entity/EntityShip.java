package com.ModMayhem.POTCMod.Entity;

public class EntityShip {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
