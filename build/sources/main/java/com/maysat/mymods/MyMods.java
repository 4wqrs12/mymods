package com.maysat.mymods;

import com.maysat.mymods.blocks.ModBlocks;
import com.maysat.mymods.items.ModItems;
import com.maysat.mymods.other.Recipes;
import com.maysat.mymods.proxies.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Config.MODID, version = Config.VERSION)
public class MyMods {
    public static final Item.ToolMaterial copperMaterial = EnumHelper.addToolMaterial("copper_material", 1, 190, 5.5F, 1.5F, 5);

    @SidedProxy(clientSide = Config.CLIENT_PROXY, serverSide = Config.COMMON_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModItems.registers();

        ModBlocks.init();
        ModBlocks.registers();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenders();
        Recipes.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
