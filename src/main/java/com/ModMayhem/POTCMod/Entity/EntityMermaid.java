package com.ModMayhem.POTCMod.Entity;

public class EntityMermaid {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
