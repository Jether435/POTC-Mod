package com.ModMayhem.POTCMod.Entity;

import com.ModMayhem.POTCMod.POTCMod;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityCannibal extends EntityMob{
	   public EntityCannibal(World p_i1738_1_) {
		super(p_i1738_1_);
		this.tasks.addTask(0, new EntityAISwimming(this));
      this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0F, false));
      this.tasks.addTask(6, new EntityAIWander(this, 1.0F));
      this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
      this.tasks.addTask(7, new EntityAILookIdle(this));
      this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
      this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
	   }
		@Override
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(14.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.28D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
	    }
	public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
	  @Override
		protected String getLivingSound()
	    {
	        return POTCMod.MODID + ":mob.redcap.redcap";
	    }

	    @Override
		protected String getHurtSound()
	    {
	        return POTCMod.MODID + ":mob.redcap.redcaphurt";
	    }

	    @Override
		protected String getDeathSound()
	    {
	        return POTCMod.MODID + ":mob.redcap.redcapdie";
	    }

}
