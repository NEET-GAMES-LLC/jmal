package jmal.entity;

import org.jetbrains.annotations.NotNull;

public abstract class LivingEntityWrapper<T> implements LivingEntity {
    private final @NotNull T entity;

    public LivingEntityWrapper(@NotNull T entity) {
        this.entity = entity;
    }

    public @NotNull T getPlayer() {
        return entity;
    }
}
