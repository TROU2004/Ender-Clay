package io.github.seraphjack.enderclay;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.seraphjack.enderclay.achievement.AchievementLoader;
import io.github.seraphjack.enderclay.block.BlockLoader;
import io.github.seraphjack.enderclay.common.ConfigLoader;
import io.github.seraphjack.enderclay.item.ItemLoader;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	new ItemLoader();
    	new BlockLoader();
    	new ConfigLoader(e);
    }

    public void init(FMLInitializationEvent e) {
        new CraftingLoader();
        new AchievementLoader();
    }

    public void posInit(FMLPostInitializationEvent e) {
    }
}
