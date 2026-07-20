package com.maysat.mymods.items;

import com.maysat.mymods.MyMods;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item copperIngot;
    public static ItemSword copperSword;
    public static ItemAxe copperAxe;
    public static ItemSpade copperShovel;
    public static ItemPickaxe copperPickaxe;
    public static ItemHoe copperHoe;

    public static void init() {
        copperIngot = new Item().setUnlocalizedName("copper_ingot").setRegistryName("copper_ingot").setCreativeTab(CreativeTabs.tabMaterials);
        copperSword = new CopperSword();
        copperAxe = new CopperAxe();
        copperShovel = new CopperShovel();
        copperPickaxe = new CopperPickaxe();
        copperHoe = new CopperHoe();
    }

    public static void registers() {
        register(copperIngot);
        register(copperSword);
        register(copperAxe);
        register(copperShovel);
        register(copperPickaxe);
        register(copperHoe);
    }

    public static void register(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("mymods:"+item.getUnlocalizedName().substring(5), "inventory"));
    }
}
