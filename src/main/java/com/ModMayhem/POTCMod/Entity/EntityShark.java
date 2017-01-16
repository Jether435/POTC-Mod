package com.ModMayhem.POTCMod.Entity;

public class EntityShark {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
