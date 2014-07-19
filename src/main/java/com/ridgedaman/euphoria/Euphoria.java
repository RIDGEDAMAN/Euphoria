package com.ridgedaman.euphoria;

import com.ridgedaman.euphoria.Handler.ConfigurationHandler;
import com.ridgedaman.euphoria.init.ModBlocks;
import com.ridgedaman.euphoria.init.ModItems;
import com.ridgedaman.euphoria.proxy.IProxy;
import com.ridgedaman.euphoria.reference.Reference;
import com.ridgedaman.euphoria.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInterModComms.IMCEvent;
import cpw.mods.fml.common.event.*;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Euphoria {

    @Instance(Reference.MOD_ID)
    public static Euphoria instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event){

    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event){

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModBlocks.init();
        ModItems.init();

        LogHelper.info("PreInitialization Complete!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

        LogHelper.info("Initialization Complete!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("PostInitialization Complete!");
    }

    @EventHandler
    public void handleIMCMessages(IMCEvent event){
        
    }
}
