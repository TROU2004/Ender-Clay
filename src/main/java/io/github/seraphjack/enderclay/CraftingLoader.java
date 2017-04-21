package io.github.seraphjack.enderclay;

import io.github.seraphjack.enderclay.item.ItemLoader;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.crafting.IRecipe;

public class CraftingLoader {
	public CraftingLoader(){
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCursedLasso), new Object[]{"aba", "bcb", "aba", 'a', Items.ghast_tear, 'b', Items.string, 'c', Items.ender_eye});
	}
}
