package com.ModMayhem.POTCMod.Entity;

import com.ModMayhem.POTCMod.Entity.AI.EntityAICharge;

import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityPirate extends EntityMob{
	   public EntityPirate(World w) {
		super(w);
		this.tasks.addTask(0, new EntityAICharge(this, 1));
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
		
	}

	public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
