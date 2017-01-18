package com.ModMayhem.POTCMod.Entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntitySalazar extends EntityMob{

	public EntitySalazar(World p_i1738_1_) {
		super(p_i1738_1_);
		this.noClip = true;
	}

	public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}

