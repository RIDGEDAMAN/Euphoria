package com.ridgedaman.euphoria.init;

import com.ridgedaman.euphoria.item.ItemEuph;
import com.ridgedaman.euphoria.item.ItemTestItem;
import com.ridgedaman.euphoria.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemEuph testItem = new ItemTestItem();

    public static void init(){

        GameRegistry.registerItem(testItem, "testItem");
    }
}
