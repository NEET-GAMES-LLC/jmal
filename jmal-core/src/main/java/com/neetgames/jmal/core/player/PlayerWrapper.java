package com.neetgames.jmal.core.player;

import org.jetbrains.annotations.NotNull;

public abstract class PlayerWrapper<T> implements Player {
    protected final @NotNull T player;

    public PlayerWrapper(@NotNull T player) {
        this.player = player;
    }

    public @NotNull T getPlayer() {
        return player;
    }
}
