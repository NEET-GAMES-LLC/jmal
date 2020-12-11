package com.neetgames.jmal.core;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface UniqueIdentity {
    @NotNull UUID getIdentity();
}
