package com.maysat.mymods.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperBlock extends Block {
    public CopperBlock() {
        super(Material.iron);
        this.setUnlocalizedName("copper_block");
        this.setRegistryName("copper_block");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
