package com.ModMayhem.POTCMod.Entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityCursedPirate extends EntityMob{
	   public EntityCursedPirate(World p_i1738_1_) {
		super(p_i1738_1_);
		}

	public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
