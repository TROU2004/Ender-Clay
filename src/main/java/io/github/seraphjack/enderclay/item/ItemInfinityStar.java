package io.github.seraphjack.enderclay.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.seraphjack.enderclay.block.BlockEnderClay;
import io.github.seraphjack.enderclay.common.ConfigLoader;
import io.github.seraphjack.enderclay.utils.Point;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

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
            EntityItem entityItem = new EntityItem(world, x, y + 1, z, new ItemStack(ItemLoader.ItemInfinityClay));
            world.spawnEntityInWorld(entityItem);
            return true;
        }
        return false;
    }

    private boolean checkRitual(Point p, World world) {
        if (!(Point.getBlockByPoint(world, p) instanceof BlockEnderClay))
            return false;
        for (Point aRitual : ritual) {
            if (!checkRitualPart(world, p, aRitual))
                return false;
        }
        return true;
    }

    private boolean checkRitualPart(World world, Point p, Point ritual) {
        int[] ids;

        ids = OreDictionary.getOreIDs(new ItemStack(Point.getBlockByPoint(world, p.add(ritual))));
        if (ritual.getX() == 0 || ritual.getZ() == 0) {
            for (int oreID : ids) {
                if (OreDictionary.getOreName(oreID).trim().equals(ConfigLoader.ritualBlock1))
                    return true;
            }
        } else {
            for (int oreID : ids) {
                if (OreDictionary.getOreName(oreID).equals(ConfigLoader.ritualBlock2))
                    return true;
            }
        }
        return false;
    }
}