package com.xetosphere.futureaccel;

import com.xetosphere.futureaccel.init.ModBlocks;
import com.xetosphere.futureaccel.handler.ConfigurationHandler;
import com.xetosphere.futureaccel.init.ModItems;
import com.xetosphere.futureaccel.proxy.IProxy;
import com.xetosphere.futureaccel.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class FutureAccel
{
    @Mod.Instance(Reference.MOD_ID)
    public static FutureAccel instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModBlocks.init();

        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
