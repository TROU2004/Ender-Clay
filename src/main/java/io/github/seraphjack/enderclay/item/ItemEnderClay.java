package io.github.seraphjack.enderclay.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemEnderClay extends Item{
	ItemEnderClay(){
		setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("enderclay.enderclay");
        setTextureName("enderclay:enderclay");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List list, boolean par4){
		list.add(StatCollector.translateToLocal("item.enderclay.enderclay.display"));
		super.addInformation(ItemStack, EntityPlayer, list, par4);
	}
}
