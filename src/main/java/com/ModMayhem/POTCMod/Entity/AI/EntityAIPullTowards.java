package com.ModMayhem.POTCMod.Entity.AI;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAIPullTowards extends EntityAIBase{
double pushPower = 4.0D;
EntityPlayer target;
double centerX = (target.boundingBox.minX + target.boundingBox.maxX) / 2.0D;
double centerY = (target.boundingBox.minZ + target.boundingBox.maxZ) / 2.0D;
EntityCreature attacker;
private float GrabSpeed;
private float GrabWindup;
private boolean hasAttacked;
public static double ArmLength = 5;
public EntityAIPullTowards(EntityCreature entityLiving, float f, float x) {
	this.attacker = entityLiving;
	this.GrabSpeed = f;
	this.GrabWindup = x;
	this.hasAttacked = false;
	this.setMutexBits(3);
}
@Override
public boolean shouldExecute() {
	return null;
}
@Override
public boolean updateTask(){
	return false;
}
}
