package jmal.player;

import org.jetbrains.annotations.NotNull;

public abstract class OnlinePlayerWrapper<T> implements OnlinePlayer {
    private final @NotNull T player;

    public OnlinePlayerWrapper(@NotNull T player) {
        this.player = player;
    }

    public @NotNull T getPlayer() {
        return player;
    }
}
