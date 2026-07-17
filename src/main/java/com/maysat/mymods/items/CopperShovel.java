package com.maysat.mymods.items;

import com.maysat.mymods.MyMods;
import net.minecraft.item.ItemSpade;

public class CopperShovel extends ItemSpade {
    public CopperShovel() {
        super(MyMods.copperMaterial);
        this.setUnlocalizedName("copper_shovel");
        this.setRegistryName("copper_shovel");
    }
}
