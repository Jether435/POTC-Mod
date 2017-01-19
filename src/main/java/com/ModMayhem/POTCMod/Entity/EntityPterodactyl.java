package com.ModMayhem.POTCMod.Entity;

import net.minecraft.entity.EntityFlying;
import net.minecraft.world.World;

public class EntityPterodactyl extends EntityFlying{
	   public EntityPterodactyl(World p_i1587_1_) {
		super(p_i1587_1_);
	}

	public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
