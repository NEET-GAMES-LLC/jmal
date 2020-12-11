package com.neetgames.jmal.core.location;

import org.jetbrains.annotations.NotNull;

public abstract class LocationWrapper<T> implements Location {
    private final @NotNull T location;

    public LocationWrapper(@NotNull T location) {
        this.location = location;
    }

    public @NotNull T getLocation() {
        return location;
    }
}
