package io.github.seraphjack.enderclay.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEnderClay extends Item{
	public ItemEnderClay(){
		setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("enderclay.enderclay");
        setTextureName("enderclay:enderclay");
	}
}
