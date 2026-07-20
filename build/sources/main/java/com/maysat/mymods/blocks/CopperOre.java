package com.maysat.mymods.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends Block {
    public CopperOre() {
        super(Material.rock);
        this.setUnlocalizedName("copper_ore");
        this.setRegistryName("copper_ore");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
