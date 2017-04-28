package io.github.seraphjack.enderclay;

import io.github.seraphjack.enderclay.achievement.AchievementLoader;
import io.github.seraphjack.enderclay.block.BlockLoader;
import io.github.seraphjack.enderclay.item.ItemLoader;

public class CommonProxy {

    public void preInit() {
    	new ItemLoader();
    	new BlockLoader();
    }

    public void init() {
        new CraftingLoader();
        new AchievementLoader();
    }

    public void posInit() {
    }
}
