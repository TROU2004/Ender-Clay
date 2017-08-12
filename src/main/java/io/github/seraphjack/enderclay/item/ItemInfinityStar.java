package io.github.seraphjack.enderclay.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.seraphjack.enderclay.block.BlockEnderClay;
import io.github.seraphjack.enderclay.block.BlockLoader;
import io.github.seraphjack.enderclay.common.ConfigLoader;
import io.github.seraphjack.enderclay.utils.Point;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemInfinityStar extends Item {
    public static Point[] ritual = {new Point(1, 0, 1), new Point(0, 0, 1), new Point(-1, 0, 1),
            new Point(1, 0, 0), new Point(-1, 0, 0),
            new Point(1, 0, -1), new Point(0, 0, -1), new Point(-1, 0, -1)};

    public ItemInfinityStar() {
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("enderclay.infinity_star");
        setTextureName("enderclay:infinity_star");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack, int pass) {
        return true;
    }

    @Override
    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int facing, float hitX, float hitY, float hitZ) {
        if (world.isRemote)
            return true;
        Point p = new Point(x, y, z);
        Point point;
        if (checkRitual(p, world)) {
            item.stackSize--;
            if (item.stackSize <= 0)
                player.clearItemInUse();
            for (Point aRitual : ritual) {
                point = p.add(aRitual);
                world.setBlockToAir(point.getX(), point.getY(), point.getZ());
            }
            world.setBlockToAir(x, y, z);
            EntityItem entityItem = new EntityItem(world, x, y + 1, z, new ItemStack(BlockLoader.BlockInfinityClay));
            world.spawnEntityInWorld(entityItem);
            return true;
        }
        return false;
    }

    private boolean checkRitual(Point p, World world) {
        if (!(Point.getBlockByPoint(world, p) instanceof BlockEnderClay))
            return false;
        Point point;
        for (Point aRitual : ritual) {
            point = p.add(aRitual);
            if (!Point.getBlockByPoint(world, point).getUnlocalizedName().equals(getRitualPart(aRitual)))
                return false;
        }
        return true;
    }

    private String getRitualPart(Point point) {
        if (point.getX() == 0 || point.getZ() == 0)
            return ConfigLoader.ritualBlock1;
        return ConfigLoader.ritualBlock2;
    }
}