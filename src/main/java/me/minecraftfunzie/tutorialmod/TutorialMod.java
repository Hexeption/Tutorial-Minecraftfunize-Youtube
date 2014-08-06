package me.minecraftfunzie.tutorialmod;

import me.minecraftfunzie.tutorialmod.Proxy.CommonProxy;
import me.minecraftfunzie.tutorialmod.blocks.Block_Star;
import me.minecraftfunzie.tutorialmod.blocks.ModBlocks;
import me.minecraftfunzie.tutorialmod.items.ModItems;
import me.minecraftfunzie.tutorialmod.util.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = References.MODID, version = References.VERSION)
public class TutorialMod
{
    
    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	ModBlocks.RegisterBlocks();
    	ModItems.RegisterItems();
    }
    
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
