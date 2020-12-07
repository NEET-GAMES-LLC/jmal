package jmal.block;

import jmal.location.WorldBound;

public interface Block extends WorldBound {
    int getX();

    int getY();

    int getZ();
}
