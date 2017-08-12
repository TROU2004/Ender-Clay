package io.github.seraphjack.enderclay.block;

import io.github.seraphjack.enderclay.item.ItemLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockInfinityClay extends Block{
    public BlockInfinityClay(){
        super(Material.ground);
        setBlockName("enderclay.infinity_clay_block");
        setBlockTextureName("enderclay:infinity_clay_block");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(0.5F);
        setStepSound(soundTypeGravel);
        setHarvestLevel("shovel", 0);
    }
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_){
        return ItemLoader.ItemInfinityClay;
    }

    @Override
    public int quantityDropped(Random p_149745_1_){
        return 4;
    }
}
