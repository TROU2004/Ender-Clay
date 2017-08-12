package io.github.seraphjack.enderclay.block;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.seraphjack.enderclay.common.ConfigLoader;
import io.github.seraphjack.enderclay.item.ItemBlockEnderClay;
import net.minecraft.block.Block;

public class BlockLoader {
	public static Block BlockEnderClay;
	public static Block BlockInfinityClay;
	public BlockLoader(){
		ConfigLoader.logger().info("Loading Blocks.");
		BlockEnderClay = new BlockEnderClay();
		BlockInfinityClay = new BlockInfinityClay();
		GameRegistry.registerBlock(BlockEnderClay, ItemBlockEnderClay.class, "enderclayblock");
		GameRegistry.registerBlock(BlockInfinityClay,"starclayblock");
	}
}
