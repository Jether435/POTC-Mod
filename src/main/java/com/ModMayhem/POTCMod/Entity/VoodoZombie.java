package com.ModMayhem.POTCMod.Entity;

public class VoodoZombie {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
