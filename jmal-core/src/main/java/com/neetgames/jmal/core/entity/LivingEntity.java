package com.neetgames.jmal.core.entity;

import com.neetgames.jmal.core.location.WorldBound;

public interface LivingEntity extends Entity, WorldBound {

    boolean isAlive();
}
