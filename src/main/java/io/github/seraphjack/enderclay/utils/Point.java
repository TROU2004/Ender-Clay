package io.github.seraphjack.enderclay.utils;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class Point {
    private int x, y, z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public Point add(Point p) {
        return new Point(this.x + p.getX(), this.y + p.getY(), this.z + p.getZ());
    }

    public static Block getBlockByPoint(World world, Point point) {
        return world.getBlock(point.getX(), point.getY(), point.getZ());
    }
}