package jmal;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface UniqueIdentity {
    @NotNull UUID getIdentity();
}
