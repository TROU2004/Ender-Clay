package io.github.seraphjack.enderclay.block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockLoader {
	public static Block BlockEnderClay;
	public BlockLoader(){
		BlockEnderClay = new BlockEnderClay();
		GameRegistry.registerBlock(BlockEnderClay, "blockenderclay");
	}
}
