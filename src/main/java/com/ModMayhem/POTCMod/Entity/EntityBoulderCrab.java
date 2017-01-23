package com.ModMayhem.POTCMod.Entity;

import com.ModMayhem.POTCMod.Entity.AI.EntityAICharge;

import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityBoulderCrab extends EntityMob implements IEntityMultiPart, IMob{

	public EntityBoulderCrab(World p_i1738_1_) {
		super(p_i1738_1_);
		this.tasks.addTask(0, new EntityAICharge(this, 1));
	}
	@Override
	public World func_82194_d() {
		return worldObj;
	}

	@Override
	public boolean attackEntityFromPart(EntityDragonPart p_70965_1_, DamageSource p_70965_2_, float p_70965_3_) {
		return false;
	}

}
