package io.github.seraphjack.enderclay.item;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.seraphjack.enderclay.common.ConfigLoader;
import net.minecraft.item.Item;


public class ItemLoader {
    public static Item ItemCursedLasso;
    public static Item ItemEnderClay;
    public ItemLoader(){
        ConfigLoader.logger().info("Loading Items.");
        ItemCursedLasso = new ItemCursedLasso();
        ItemEnderClay = new ItemEnderClay();
        GameRegistry.registerItem(ItemCursedLasso, "cursed_lasso");
        GameRegistry.registerItem(ItemEnderClay, "itemenderclay");
    }
}
