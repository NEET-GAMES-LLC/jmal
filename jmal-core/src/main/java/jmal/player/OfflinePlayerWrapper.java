package jmal.player;

import org.jetbrains.annotations.NotNull;

public abstract class OfflinePlayerWrapper<T> implements OfflinePlayer {
    private final @NotNull T player;

    public OfflinePlayerWrapper(@NotNull T player) {
        this.player = player;
    }

    public @NotNull T getPlayer() {
        return player;
    }
}
