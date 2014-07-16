package com.ridgedaman.euphoria.creativetab;

import com.ridgedaman.euphoria.init.ModItems;
import com.ridgedaman.euphoria.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEuph {

    public static final CreativeTabs EUPH_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {

            return ModItems.testItem;
        }
    };
}
