package com.maysat.mymods.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item copperIngot;

    public static void init() {
        copperIngot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(CreativeTabs.tabMaterials);
    }

    public static void registers() {
        register(copperIngot);
    }

    public static void register(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }
}
