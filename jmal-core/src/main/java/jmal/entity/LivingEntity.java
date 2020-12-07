package jmal.entity;

import jmal.location.WorldBound;

public interface LivingEntity extends Entity, WorldBound {

    boolean isAlive();
}
