package me.minecraftfunzie.tutorialmod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block Star = new Block_Star(2000, Material.glass);
	
	public static void RegisterBlocks(){
		GameRegistry.registerBlock(Star, "Star");
		
		RegisterLanguage();
	}
	
	@SuppressWarnings({ "unused", "deprecation" })
	private static void RegisterLanguage(){
		LanguageRegistry.addName(Star, "Star");		
	}

}
