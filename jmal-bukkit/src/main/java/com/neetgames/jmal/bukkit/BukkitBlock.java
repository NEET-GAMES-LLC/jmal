package com.neetgames.jmal.bukkit;

import jmal.block.BlockWrapper;
import jmal.location.World;
import org.bukkit.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BukkitBlock<T extends Block> extends BlockWrapper<T> {
    private final World world;

    protected BukkitBlock(@NotNull T block) {
        super(block);
        this.world = () -> block.getWorld().getName();
    }

    @Override
    public int getX() {
        return block.getX();
    }

    @Override
    public int getY() {
        return block.getY();
    }

    @Override
    public int getZ() {
        return block.getZ();
    }


    @Override
    public @Nullable World getWorld() {
        return world;
    }
}
