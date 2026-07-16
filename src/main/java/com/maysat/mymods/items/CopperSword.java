package com.maysat.mymods.items;

import com.maysat.mymods.MyMods;
import net.minecraft.item.ItemSword;

public class CopperSword extends ItemSword {
    public CopperSword() {
        super(MyMods.copperMaterial);
        this.setUnlocalizedName("copper_sword");
        this.setRegistryName("copper_sword");
    }
}
