package com.ModMayhem.POTCMod.Entity;

import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityKraken extends EntityWaterMob{
	   public EntityKraken(World p_i1695_1_) {
		super(p_i1695_1_);
   this.getNavigator().setBreakDoors(true);
   this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
   this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
   this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
   this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
   this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
   this.tasks.addTask(8, new EntityAILookIdle(this));
   this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
   this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
 
	}

	public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}
