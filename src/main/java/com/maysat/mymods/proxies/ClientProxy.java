package com.maysat.mymods.proxies;

import com.maysat.mymods.blocks.ModBlocks;
import com.maysat.mymods.items.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        ModItems.registerRender(ModItems.copperIngot);

        ModItems.registerRender(ModItems.copperSword);
        ModItems.registerRender(ModItems.copperAxe);
        ModItems.registerRender(ModItems.copperShovel);
        ModItems.registerRender(ModItems.copperPickaxe);
        ModItems.registerRender(ModItems.copperHoe);

        ModItems.registerRender(ModItems.candy);


        ModBlocks.registerRender(ModBlocks.copperBlock);
        ModBlocks.registerRender(ModBlocks.copperOre);
    }
}
