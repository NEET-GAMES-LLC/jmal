package com.neetgames.jmaw;

import org.jetbrains.annotations.NotNull;

public interface Player extends LivingEntity {

    /**
     * Get the name of this {@link Player}
     * @return the name of this {@link Player}
     */
    @NotNull String getName();
}
