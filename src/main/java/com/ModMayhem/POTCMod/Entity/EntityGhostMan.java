package com.ModMayhem.POTCMod.Entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityGhostMan extends EntityMob{
	public static double MAXDIST = 35;
	EntityPlayer target;
	float FaceWay1 = 0.0F;
	float FaceWay2 = 0.0F;
	   public EntityGhostMan(World p_i1738_1_) {
		super(p_i1738_1_);
		this.noClip = true;
		double distance = this.getDistanceSqToEntity(this.target);
		if (isCollidedHorizontally == true && MAXDIST > distance && this.canEntityBeSeen(target)){
			this.setPositionAndRotation(target.posX, target.posY, target.posZ, FaceWay1, FaceWay2);
		}
	}

	public boolean getCanSpawnHere()
	    {
	        return this.worldObj.checkNoEntityCollision(this.boundingBox);
	    }
}