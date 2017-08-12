package io.github.seraphjack.enderclay;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;

@Mod(modid = "enderclay", name = "EnderClay", version = "1.0.7")
public class EnderClay {
    @SidedProxy(clientSide="io.github.seraphjack.enderclay.ClientProxy",serverSide="io.github.seraphjack.enderclay.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
        for(int i=0;i<101;i++){
            System.out.println(Blocks.diamond_block.getUnlocalizedName());
        }
    }
}
