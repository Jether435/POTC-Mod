package com.ModMayhem.POTCMod.Entity;

public class EntityGhostMan {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
