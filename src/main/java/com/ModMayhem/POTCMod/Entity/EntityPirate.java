package com.ModMayhem.POTCMod.Entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityPirate extends EntityMob{
	   public EntityPirate(World w) {
		super(w);
	}

	public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
