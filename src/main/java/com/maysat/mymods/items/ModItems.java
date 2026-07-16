package com.maysat.mymods.items;

import com.maysat.mymods.MyMods;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item copperIngot;
    public static ItemSword copperSword;
    public static ItemAxe copperAxe;

    public static void init() {
        copperIngot = new Item().setUnlocalizedName("copper_ingot").setRegistryName("copper_ingot").setCreativeTab(CreativeTabs.tabMaterials);
        copperSword = new CopperSword();
        copperAxe = new CopperAxe();
    }

    public static void registers() {
        register(copperIngot);
        register(copperSword);
        register(copperAxe);
    }

    public static void register(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("mymods:"+item.getUnlocalizedName().substring(5), "inventory"));
    }
}
