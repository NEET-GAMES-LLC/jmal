package jmal.location;

public interface PrecisionCoordinates extends GridCoordinates {
    double getExactX();

    double getExactY();

    double getExactZ();
}
