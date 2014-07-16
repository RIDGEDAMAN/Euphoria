package com.ridgedaman.euphoria.block;

import com.ridgedaman.euphoria.creativetab.CreativeTabEuph;
import com.ridgedaman.euphoria.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockEuph extends Block{

    public BlockEuph(){

        super(Material.rock);
        this.setCreativeTab(CreativeTabEuph.EUPH_TAB);
    }

    public BlockEuph(Material material){

        super(material);
        this.setCreativeTab(CreativeTabEuph.EUPH_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
