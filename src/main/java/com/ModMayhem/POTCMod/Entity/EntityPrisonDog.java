package com.ModMayhem.POTCMod.Entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

public class EntityPrisonDog extends EntityTameable{
	   public EntityPrisonDog(World p_i1604_1_) {
		super(p_i1604_1_);
		// TODO Auto-generated constructor stub
	}

	public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		// TODO Auto-generated method stub
		return null;
	}
}
