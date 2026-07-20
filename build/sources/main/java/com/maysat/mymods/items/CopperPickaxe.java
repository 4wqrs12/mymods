package com.maysat.mymods.items;

import com.maysat.mymods.MyMods;
import net.minecraft.item.ItemPickaxe;

public class CopperPickaxe extends ItemPickaxe {
    protected CopperPickaxe() {
        super(MyMods.copperMaterial);
        this.setRegistryName("copper_pickaxe");
        this.setUnlocalizedName("copper_pickaxe");
    }
}
