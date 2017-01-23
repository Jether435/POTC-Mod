package com.ModMayhem.POTCMod.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderEnd;

public class EntityIguanaBeast extends EntityMob implements IEntityMultiPart, IMob{
	   
	private static float PartActivityMultiplier = 0.3F;
	private static int ChanceForTailMovement = 10;
	private static int ChanceForHeadMovement = 10;
	private static int Health = 360;
	public Entity partArray[];
	public EntityDragonPart body;
	public EntityDragonPart head;
	public EntityDragonPart tail;
	
	Entity currentTarget = null;
	
	public int TimeSinceDamage = 0;
	public int HealWait = 0;
	
	public EntityIguanaBeast(World w) {
		super(w);
		setSize(12F, 12F);
		partArray = (new Entity[]{
				body = new EntityDragonPart(this, "body", 2F, 2F), head = new EntityDragonPart(this, "head", 2F, 4F), tail = new EntityDragonPart(this, "tail", 0F, 4F),
		});
		
		ArrayList<Entity> partList = new ArrayList<Entity>();
		Collections.addAll(partList, partArray);
		this.ignoreFrustumCheck = true;
		isImmuneToFire = true;
	   public EntityIguanaBeast(World world, double x, double y, double z)
	    {
	        this(world);
	        this.setPosition(x, y, z);
	    }
		@Override
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(Health);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.28D);
	    }
	@SuppressWarnings("unchecked")
	@Override
    public void onLivingUpdate()
    {
		body.onUpdate();
		if (!this.worldObj.isRemote){
			this.dataWatcher.updateObject((int) Health, Integer.valueOf((int)this.getHealth()));
		
		}
		else{
			if (this.getHealth() > 0){
				this.deathTime = 0;
			}
		}
		this.TimeSinceDamage++;
		if (!this.worldObj.isRemote && this.TimeSinceDamage > HealWait && this.TimeSinceDamage % 5 == 0){
			this.heal(2);
		}
		if (this.isMovementBlocked()){
			this.isJumping = false;
			this.moveStrafing = 0.0F;
			this.moveForward = 0.0F;
			this.randomYawVelocity = 0.0F;
		}
		if (this.isJumping)
        {
            if (!this.isInWater() && !this.handleLavaMovement())
            {
                if (this.onGround)
                {
                    this.jump();
                }
            }
        }
		if (!this.worldObj.isRemote && this.hurtTime == 0)
        {
            this.collideWithEntities(this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.body.boundingBox), this.body);
            this.collideWithEntities(this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.tail.boundingBox), this.tail);
        }
		if (!this.worldObj.isRemote)
        {
			this.destroyBlocksInAABB(boundingBox);
        }
			}
        }
    		@Override
    	    protected void entityInit()
    	    {
    			super.entityInit();
    			this.dataWatcher.addObject(Health, new Integer(Health));
    	    }
    		@Override
    		protected void updateEntityActionState()
    		{
    			entityAge++;
    			despawnEntity();
    			moveStrafing = 0.0F;
    			moveForward = 0.0F;
    		}
    		private void attackEntity(Entity target, float distance) {
    			int BiteChance = 10;
    			boolean targetAbove = target.boundingBox.minY > this.boundingBox.maxY;   
    			if (distance > 1 && distance < 10 && rand.nextInt(BiteChance) == 0){
    				this.head(PartContainter.SetStateBiteStart);
    			}
    		}
    			  private void collideWithEntities(List<Entity> par1List, Entity part)
    			    {
    			    	double pushPower = 4.0D;
    			    	
    			        double centerX = (part.boundingBox.minX + part.boundingBox.maxX) / 2.0D;
    			        double centerY = (part.boundingBox.minZ + part.boundingBox.maxZ) / 2.0D;
    			        
    			        for (Entity entity : par1List)
    			        {
    			            if (entity instanceof EntityLivingBase)
    			            {
    			                double distX = entity.posX - centerX;
    			                double distZ = entity.posZ - centerY;
    			                double sqDist = distX * distX + distZ * distZ;
    			                entity.addVelocity(distX / sqDist * pushPower, 0.20000000298023224D, distZ / sqDist * pushPower);
    			            }
    			        }
    			    
    		}
    			    	@Override
    			        public int getVerticalFaceSpeed()
    			        {
    			            return 500;
    			        }
    			    	private boolean destroyBlocksInAABB(AxisAlignedBB p_70972_1_)
    			        {
    			            int i = MathHelper.floor_double(p_70972_1_.minX);
    			            int j = MathHelper.floor_double(p_70972_1_.minY);
    			            int k = MathHelper.floor_double(p_70972_1_.minZ);
    			            int l = MathHelper.floor_double(p_70972_1_.maxX);
    			            int i1 = MathHelper.floor_double(p_70972_1_.maxY);
    			            int j1 = MathHelper.floor_double(p_70972_1_.maxZ);
    			            boolean flag = false;
    			            boolean flag1 = false;

    			            for (int k1 = i; k1 <= l; ++k1)
    			            {
    			                for (int l1 = j; l1 <= i1; ++l1)
    			                {
    			                    for (int i2 = k; i2 <= j1; ++i2)
    			                    {
    			                        Block block = this.worldObj.getBlock(k1, l1, i2);

    			                        if (!block.isAir(worldObj, k1, l1, i2))
    			                        {
    			                            if (block.canEntityDestroy(worldObj, k1, l1, i2, this) && this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
    			                            {
    			                                flag1 = this.worldObj.setBlockToAir(k1, l1, i2) || flag1;
    			                            }
    			                            else
    			                            {
    			                                flag = true;
    			                            }
    			                        }
    			                    }
    			                }
    			            }

    			            if (flag1)
    			            {
    			                double d1 = p_70972_1_.minX + (p_70972_1_.maxX - p_70972_1_.minX) * (double)this.rand.nextFloat();
    			                double d2 = p_70972_1_.minY + (p_70972_1_.maxY - p_70972_1_.minY) * (double)this.rand.nextFloat();
    			                double d0 = p_70972_1_.minZ + (p_70972_1_.maxZ - p_70972_1_.minZ) * (double)this.rand.nextFloat();
    			                this.worldObj.spawnParticle("largeexplode", d1, d2, d0, 0.0D, 0.0D, 0.0D);
    			            }

    			            return flag;
    			        }
    			    	public void onDeath(DamageSource dmgSrc){
    			    		super.onDeath(dmgSrc);
    			    	}
    			    	protected void onDeathUpdate(){
    			    		
    			    	}
    			    	// At ATTACKFROMPART
    	}