package com.ModMayhem.POTCMod.Blocks;

import com.ModMayhem.POTCMod.POTCMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class LockerSandBlock extends Block{

	protected LockerSandBlock(Material w) {
		super(w);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.textureName = POTCMod.MODID + "";
	}
}
