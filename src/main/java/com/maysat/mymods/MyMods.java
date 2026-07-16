package com.maysat.mymods;

import com.maysat.mymods.items.ModItems;
import com.maysat.mymods.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Config.MODID, version = Config.VERSION)
public class MyMods {

    @SidedProxy(clientSide = Config.CLIENT_PROXY, serverSide = Config.COMMON_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModItems.registers();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenders();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
