package jmal.player;

import jmal.UniqueIdentity;
import jmal.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface Player extends UniqueIdentity, Entity {

    /**
     * Get the name of this {@link Player}
     * @return the name of this {@link Player}
     */
    @NotNull String getName();

    boolean isOnline();
}
