package io.github.seraphjack.enderclay.block;

import io.github.seraphjack.enderclay.item.ItemLoader;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class BlockEnderClay extends Block{

	public BlockEnderClay() {
		super(Material.ground);
		setBlockName("enderclay.enderclayblock");
		setBlockTextureName("enderclay:enderclayblock");
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.5F);
		setStepSound(soundTypeGravel);
		setHarvestLevel("shovel", 0);
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
