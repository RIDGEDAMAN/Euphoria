package com.ridgedaman.euphoria.init;

import com.ridgedaman.euphoria.block.BlockEuph;
import com.ridgedaman.euphoria.block.BlockTestBlock;
import com.ridgedaman.euphoria.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockEuph testBlock = new BlockTestBlock();

    public static void init(){

        GameRegistry.registerBlock(testBlock, "testBlock");
    }
}
