package me.minecraftfunzie.tutorialmod.items;

import scala.language;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {
	
	public static ItemsTM CopperIngot = new ItemCopperIngot();
	
	public static void RegisterItems(){
		GameRegistry.registerItem(CopperIngot, "CopperIngot");
		
		RegisterLanguage();
	}
	
	private static void RegisterLanguage(){
		LanguageRegistry.addName(CopperIngot, "Copper Ingot");
	}

}
