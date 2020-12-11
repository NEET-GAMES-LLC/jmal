package com.neetgames.jmal.core.location;

import org.jetbrains.annotations.NotNull;

public abstract class WorldWrapper<T> implements World {
    private final @NotNull T world;

    protected WorldWrapper(@NotNull T world) {
        this.world = world;
    }

    public @NotNull T getWorld() {
        return world;
    }
}
