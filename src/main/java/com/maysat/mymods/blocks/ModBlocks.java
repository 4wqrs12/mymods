package com.maysat.mymods.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block copperBlock;
    public static Block copperOre;

    public static void init() {
        copperBlock = new CopperBlock();
        copperOre = new CopperOre();
    }

    public static void registers() {
        register(copperBlock);
        register(copperOre);
    }

    public static void register(Block block) {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("mymods:"+item.getUnlocalizedName().substring(5), "inventory"));
    }
}
