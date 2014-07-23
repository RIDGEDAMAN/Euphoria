package com.ridgedaman.euphoria.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

    public static void init(){

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testItem), " x ", "xox", " x ",
                'x', "gemLapis",
                'o', "slimeball"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.testBlock), "xox", "oto", "xox",
                'x', "dyeOrange",
                'o', "ingotIron",
                't', "blockCoal"));
    }
}
