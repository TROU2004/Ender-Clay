package io.github.seraphjack.enderclay.block;

import io.github.seraphjack.enderclay.item.ItemLoader;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockEnderClay extends Block{

	public BlockEnderClay() {
		super(Material.ground);
		this.setBlockName("enderclay.enderclayblock");
		this.setBlockTextureName("enderclay:enderclayblock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.5F);
		this.setStepSound(soundTypeCloth);
	}
	
	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_){
		return ItemLoader.ItemEnderClay;
	}
	
	@Override
	public int quantityDropped(Random p_149745_1_){
		return 4;
	}
	
}
