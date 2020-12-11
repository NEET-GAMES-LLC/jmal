package com.neetgames.jmal.core.player;

import com.neetgames.jmal.core.UniqueIdentity;
import com.neetgames.jmal.core.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface Player extends UniqueIdentity, Entity {

    /**
     * Get the name of this {@link Player}
     * @return the name of this {@link Player}
     */
    @NotNull String getName();

    boolean isOnline();
}
