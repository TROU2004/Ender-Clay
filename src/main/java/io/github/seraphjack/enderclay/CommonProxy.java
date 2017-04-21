package io.github.seraphjack.enderclay;

import io.github.seraphjack.enderclay.item.ItemLoader;

public class CommonProxy {

    public void preInit() {
    	new ItemLoader();
    }

    public void init() {
        new CraftingLoader();
    }

    public void posInit() {
    }
}
