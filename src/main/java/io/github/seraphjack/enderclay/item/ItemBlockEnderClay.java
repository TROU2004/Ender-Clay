package io.github.seraphjack.enderclay.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.seraphjack.enderclay.block.BlockLoader;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemBlockEnderClay extends ItemBlock {

    public ItemBlockEnderClay(Block block) {
        super(BlockLoader.BlockEnderClay);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
        list.add(StatCollector.translateToLocal("tile.enderclay.enderclayblock.display0"));
        list.add(StatCollector.translateToLocal("tile.enderclay.enderclayblock.display1"));
        list.add(StatCollector.translateToLocal("tile.enderclay.enderclayblock.display2"));
        super.addInformation(stack, player, list, advanced);
    }
}
