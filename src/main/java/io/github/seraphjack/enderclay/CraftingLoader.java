package io.github.seraphjack.enderclay;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.seraphjack.enderclay.block.BlockLoader;
import io.github.seraphjack.enderclay.common.ConfigLoader;
import io.github.seraphjack.enderclay.item.ItemLoader;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingLoader {
	public CraftingLoader(){
		ConfigLoader.logger().info("Loading Recipes.");
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCursedLasso), "aba", "bcb", "aba", 'a', Items.ghast_tear, 'b', Items.string, 'c', Items.ender_eye);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockEnderClay), "aa","aa",'a',ItemLoader.ItemEnderClay);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockInfinityClay), "aa","aa",'a',ItemLoader.ItemInfinityClay);
	}
}
