package com.ModMayhem.POTCMod.Entity;

public class EntityCursedPirateConnected {
	   public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}