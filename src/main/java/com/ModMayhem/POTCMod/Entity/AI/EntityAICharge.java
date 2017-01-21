package com.ModMayhem.POTCMod.Entity.AI;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAICharge extends EntityAIBase{
protected static final double MinimumRange = 4.0D;
protected static final double MaximumRange = 32.0D;
protected EntityCreature charger;
protected EntityLivingBase target;
	@Override
	public boolean shouldExecute() {
		return false;
	}

}
