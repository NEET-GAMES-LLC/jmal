package com.neetgames.jmal.core.block;

import org.jetbrains.annotations.NotNull;

public abstract class BlockWrapper<T> implements Block {
    protected final @NotNull T block;

    protected BlockWrapper(@NotNull T block) {
        this.block = block;
    }

    public @NotNull T getBlock() {
        return block;
    }
}
