package com.neetgames.jmal.bukkit;

import com.neetgames.jmal.core.block.BlockWrapper;
import com.neetgames.jmal.core.player.PlayerWrapper;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BukkitWrapper {
    public static @NotNull BlockWrapper<Block> wrapBlock(@NotNull Block block) {
        return new BukkitBlock<>(block);
    }

    public static @NotNull Block unwrapBlock(@NotNull BukkitBlock<Block> bukkitBlock) {
        return bukkitBlock.getBlock();
    }

    public static @NotNull PlayerWrapper<Player> wrapPlayer(@NotNull Player player) {
        return new BukkitPlayer<>(player);
    }

    public static @NotNull Player unwrapPlayer(@NotNull PlayerWrapper<Player> playerWrapper) {
        return playerWrapper.getPlayer();
    }
}
