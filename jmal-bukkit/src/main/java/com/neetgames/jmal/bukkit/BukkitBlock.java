package com.neetgames.jmal.bukkit;

import jmal.block.BlockWrapper;
import org.bukkit.block.Block;
import org.jetbrains.annotations.NotNull;

public class BukkitBlock<T extends Block> extends BlockWrapper<T> {
    protected BukkitBlock(@NotNull T block) {
        super(block);
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
}
