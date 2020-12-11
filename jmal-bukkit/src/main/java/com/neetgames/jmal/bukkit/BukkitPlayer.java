package com.neetgames.jmal.bukkit;

import com.neetgames.jmal.core.player.PlayerWrapper;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class BukkitPlayer<T extends Player> extends PlayerWrapper<T> {
    public BukkitPlayer(@NotNull T player) {
        super(player);
    }

    @Override
    public @NotNull UUID getIdentity() {
        return player.getUniqueId();
    }

    @Override
    public int getEntityId() {
        return 0;
    }

    @Override
    public @NotNull String getName() {
        return player.getName();
    }

    /**
     * Grab the display name of a player
     *
     * @return the display name of this player
     */
    public @NotNull String getDisplayName() {
        return player.getDisplayName();
    }

    @Override
    public boolean isOnline() {
        return player.isOnline();
    }
}
