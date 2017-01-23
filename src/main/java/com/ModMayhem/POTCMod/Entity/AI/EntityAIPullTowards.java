package com.ModMayhem.POTCMod.Entity.AI;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAIPullTowards extends EntityAIBase{
double pushPower = 4.0D;
EntityPlayer target;
double centerX = (target.boundingBox.minX + target.boundingBox.maxX) / 2.0D;
double centerY = (target.boundingBox.minZ + target.boundingBox.maxZ) / 2.0D;

public static double ArmLength = 5;
@Override
public boolean shouldExecute() {
	// TODO Auto-generated method stub
	return null;
	target.worldObj.
}
}
