package me.minecraftfunzie.tutorialmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Block_Star extends Block {

	public Block_Star(int i ,Material glass) {
		super(glass);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeGlass);
		this.setHardness(4F);
		this.setResistance(6F);
		this.setLightLevel(0.8F);
		this.setBlockName("Star");
		this.setBlockTextureName("tutorialmod:Star");
	}
	
	public boolean isOpaqueCube(){
		return false;
	}

}
