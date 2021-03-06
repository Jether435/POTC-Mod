package com.ModMayhem.POTCMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.common.DimensionManager;
import com.ModMayhem.POTCMod.Blocks.*;
import com.ModMayhem.POTCMod.World.LockerWorldProvider;

@Mod(modid = POTCMod.MODID, version = POTCMod.Version)
public class POTCMod {
	public static int idEntityPirate;
	public static int DimID = 2;
public static final String MODID = "POTCMod";
public static final String Version = "1.0";
public static Block LockerSand;

@EventHandler
public void init (FMLPreInitializationEvent event){

}
@EventHandler
public void init (FMLInitializationEvent event){
	
	EntityRegistry.registerModEntity(com.ModMayhem.POTCMod.Entity.EntityPirate.class, "Pirate", idEntityPirate, this, 120, 5, true);
	DimensionManager.registerProviderType(DimID, LockerWorldProvider.class, true);
	DimensionManager.registerDimension(DimID, DimID);
}
@EventHandler
public void init (FMLPostInitializationEvent event){

}
}
//LockerSand = (new LockerSandBlock()).setBlockName("LockerSand");