package io.github.seraphjack.enderclay;

import io.github.seraphjack.enderclay.block.BlockLoader;
import io.github.seraphjack.enderclay.item.ItemLoader;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingLoader {
	public CraftingLoader(){
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCursedLasso), new Object[]{"aba", "bcb", "aba", 'a', Items.ghast_tear, 'b', Items.string, 'c', Items.ender_eye});
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockEnderClay), new Object[]{"aa","aa",'a',ItemLoader.ItemEnderClay});
	}
}
