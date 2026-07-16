package com.maysat.mymods.proxies;

import com.maysat.mymods.items.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        ModItems.registerRender(ModItems.copperIngot);
    }
}
