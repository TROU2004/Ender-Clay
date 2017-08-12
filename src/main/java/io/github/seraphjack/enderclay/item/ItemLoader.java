package io.github.seraphjack.enderclay.item;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.seraphjack.enderclay.common.ConfigLoader;
import net.minecraft.item.Item;


public class ItemLoader {
    public static Item ItemCursedLasso;
    public static Item ItemEnderClay;
    public static Item ItemInfinityClay;
    public static Item ItemInfinityStar;

    public ItemLoader() {
        ConfigLoader.logger().info("Loading Items.");
        ItemCursedLasso = new ItemCursedLasso();
        ItemEnderClay = new ItemEnderClay();
        ItemInfinityClay = new ItemInfinityClay();
        ItemInfinityStar = new ItemInfinityStar();
        GameRegistry.registerItem(ItemCursedLasso, "cursed_lasso");
        GameRegistry.registerItem(ItemEnderClay, "itemenderclay");
        GameRegistry.registerItem(ItemInfinityClay, "itemstarclay");
        GameRegistry.registerItem(ItemInfinityStar, "itemclaystar");
    }
}
