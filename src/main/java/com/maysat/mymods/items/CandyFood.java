package com.maysat.mymods.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class CandyFood extends ItemFood {
    public CandyFood() {
        super(1, 3, false);
        this.setUnlocalizedName("candy");
        this.setRegistryName("candy");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setPotionEffect(1, 5, 2, 0.6F);
    }
}
