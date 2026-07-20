package com.maysat.mymods.items;

import com.maysat.mymods.MyMods;
import net.minecraft.item.ItemAxe;

public class CopperAxe extends ItemAxe {
    public CopperAxe() {
        super(MyMods.copperMaterial);
        this.setRegistryName("copper_axe");
        this.setUnlocalizedName("copper_axe");
    }
}
