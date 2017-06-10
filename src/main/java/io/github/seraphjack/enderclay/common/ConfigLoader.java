package io.github.seraphjack.enderclay.common;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Logger;

public class ConfigLoader {
    private Configuration config;
    private static Logger logger;
    public static boolean useNewFeature;
    public ConfigLoader(FMLPreInitializationEvent e){
        logger = e.getModLog();
        config = new Configuration(e.getSuggestedConfigurationFile());
        config.load();
        load();
    }

    public void load(){
        logger.info("I'm being create");
        logger.info("Loading Configuration.");
        useNewFeature = config.get(Configuration.CATEGORY_GENERAL,"useNewFeature",false,"If this is enable, lassos nbt won't change when you interact with lasso in creative mode").getBoolean();
        config.save();
    }

    public static Logger logger(){
        return logger;
    }
}
