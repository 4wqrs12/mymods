package com.maysat.mymods.other;

import com.maysat.mymods.blocks.ModBlocks;
import com.maysat.mymods.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
    public static void init() {
        copperBlockRecipe();
        copperIngotRecipe();

        copperSwordRecipe();
        copperPickaxeRecipe();
        copperAxeRecipe();
        copperShovelRecipe();
        copperHoeRecipe();
    }

    public static void copperBlockRecipe() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock), new Object[] {
                "CCC",
                "CCC",
                "CCC",
                'C', ModItems.copperIngot
        });
    }

    public static void copperIngotRecipe() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperIngot, 9), new Object[] {
                ModBlocks.copperBlock
        });
    }

    public static void copperSwordRecipe() {
        GameRegistry.addRecipe(new ItemStack(ModItems.copperSword), new Object[]{
                " C ",
                " C ",
                " S ",
                'C', ModItems.copperIngot,
                'S', Items.stick
        });
    }

    public static void copperPickaxeRecipe() {
        GameRegistry.addRecipe(new ItemStack(ModItems.copperPickaxe), new Object[]{
                "CCC",
                " S ",
                " S ",
                'C', ModItems.copperIngot,
                'S', Items.stick
        });
    }

    public static void copperAxeRecipe() {
        GameRegistry.addRecipe(new ItemStack(ModItems.copperAxe), new Object[]{
                "CC ",
                "CS ",
                " S ",
                'C', ModItems.copperIngot,
                'S', Items.stick
        });
    }

    public static void copperShovelRecipe() {
        GameRegistry.addRecipe(new ItemStack(ModItems.copperShovel), new Object[]{
                " C ",
                " S ",
                " S ",
                'C', ModItems.copperIngot,
                'S', Items.stick
        });
    }

    public static void copperHoeRecipe() {
        GameRegistry.addRecipe(new ItemStack(ModItems.copperHoe), new Object[]{
                "CC ",
                " S ",
                " S ",
                'C', ModItems.copperIngot,
                'S', Items.stick
        });
    }
}