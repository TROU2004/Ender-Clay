package io.github.seraphjack.enderclay.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class ItemLoader {
    public static Item ItemCursedLasso;
    public static Item ItemEnderClay;
    public ItemLoader(){
        ItemCursedLasso = new ItemCursedLasso();
        ItemEnderClay = new ItemEnderClay();
        GameRegistry.registerItem(ItemCursedLasso, "cursed_lasso");
        GameRegistry.registerItem(ItemEnderClay, "itemenderclay");
    }
}
