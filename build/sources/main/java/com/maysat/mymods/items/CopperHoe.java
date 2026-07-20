package com.maysat.mymods.items;

import com.maysat.mymods.MyMods;
import net.minecraft.item.ItemHoe;

public class CopperHoe extends ItemHoe {
    public CopperHoe() {
        super(MyMods.copperMaterial);
        this.setRegistryName("copper_hoe");
        this.setUnlocalizedName("copper_hoe");
    }
}
