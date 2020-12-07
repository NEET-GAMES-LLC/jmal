package com.neetgames.jmal.bukkit;

import jmal.block.BlockWrapper;
import org.bukkit.block.Block;
import org.jetbrains.annotations.NotNull;

public class BukkitWrapper {
    public static @NotNull BlockWrapper<Block> wrapBlock(@NotNull Block block) {
        return new BukkitBlock<>(block);
    }

    public static Block unwrapBlock(@NotNull BukkitBlock<Block> bukkitBlock) {
        return bukkitBlock.getBlock();
    }
}
