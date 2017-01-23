package com.ModMayhem.POTCMod.Entity.AI;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class EntityAICharge extends EntityAIBase{
protected static final double MinimumRange = 4.0D;
protected static final double MaximumRange = 32.0D;
protected static final int Frequency = 1;
protected EntityCreature charger;
protected EntityLivingBase target;
protected double chargeX;
protected double chargeY;
protected double chargeZ;
protected float ChargeSpeed;
protected int ChargeWindup;
protected boolean hasAttacked;
public EntityAICharge(EntityCreature entityLiving, float f) {
	this.charger = entityLiving;
	this.ChargeSpeed = f;
	this.ChargeWindup = 0;
	this.hasAttacked = false;
	this.setMutexBits(3);
}
	@Override
	public boolean shouldExecute() {
		this.target = this.charger.getAttackTarget();
		if (this.target == null){
		return false;
		}
		else
		{
			double distance = this.charger.getDistanceSqToEntity(this.target);
			if (distance < MinimumRange || distance > MaximumRange){
				return false;
			}
			else if (!this.charger.onGround)
			{
				return false;
			}
			else
			{
				Vec3 chargePos = findChargePoint(charger, target, 2.1);
				boolean canSeeTargetFromDest = target.worldObj.rayTraceBlocks(Vec3.createVectorHelper(target.posX, target.posY + target.getEyeHeight(), target.posZ), chargePos) == null;
            	if (chargePos == null || !canSeeTargetFromDest){
            		return false;
            	}
            	else{
            		chargeX = chargePos.xCoord;
            		chargeY = chargePos.yCoord;
            		chargeZ = chargePos.zCoord;
            		
            		return this.charger.getRNG().nextInt(Frequency) == 0;
            	}
			}
		}
	}
	 @Override
		public void startExecuting()
	    {
	    	this.ChargeWindup = 15 + this.charger.getRNG().nextInt(30);
	    }
	   @Override
		public boolean continueExecuting()
	    {
	        return ChargeWindup > 0 || !this.charger.getNavigator().noPath();
	    }
	   @Override
	   public void updateTask(){
		   this.charger.getLookHelper().setLookPosition(chargeX, chargeY - 1, chargeZ, 10.0F, this.charger.getVerticalFaceSpeed());
		   if(ChargeWindup > 0){
			   if(--ChargeWindup == 0){
				   this.charger.getNavigator().tryMoveToXYZ(chargeX, chargeZ, chargeZ, this.ChargeSpeed);
			   }
			   else{
				   this.charger.limbSwingAmount += 0.8;
				   if (this.charger instanceof ICharger){
					   ((ICharger)charger).setCharging(true);
				   }
			   }
		   }
		   double var1 = this.charger.width * 2.1F * this.charger.width * 2.1F;
		   if(this.charger.getDistanceSq(this.target.posX, this.target.boundingBox.minY, this.target.posZ) <= var1){
			   if (!this.hasAttacked){
				   this.hasAttacked = true;
				   this.charger.attackEntityAsMob(this.target);
			   }
		   }
	   }
	   @Override
	   public void resetTask(){
		   this.ChargeWindup = 0;
		   this.target = null;
		   this.hasAttacked = false;
		   if (this.charger instanceof ICharger){
			   ((ICharger)charger).setCharging(false);
		   }
	   }
	   protected Vec3 findChargePoint(Entity attacker, Entity target, double overshoot) {
		   
	    	// compute angle
	        double vecx = target.posX - attacker.posX;
	        double vecz = target.posZ - attacker.posZ;
	        float rangle = (float)(Math.atan2(vecz, vecx));
	        
	        double distance = MathHelper.sqrt_double(vecx * vecx + vecz * vecz);
	        double dx = MathHelper.cos(rangle) * (distance + overshoot);
	        double dz = MathHelper.sin(rangle) * (distance + overshoot);
	        

	    	return Vec3.createVectorHelper(attacker.posX + dx, target.posY, attacker.posZ + dz);
	    }
}
