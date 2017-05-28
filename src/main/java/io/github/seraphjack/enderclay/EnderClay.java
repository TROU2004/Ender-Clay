package io.github.seraphjack.enderclay;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "enderclay", name = "EnderClay", version = "1.0.3")
public class EnderClay {
    @SidedProxy(clientSide="io.github.seraphjack.enderclay.ClientProxy",serverSide="io.github.seraphjack.enderclay.CommonProxy")
    private static CommonProxy proxy;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
    }
}
