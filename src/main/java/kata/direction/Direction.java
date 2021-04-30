package kata.direction;

import kata.Coordinate;

public interface Direction {
    void forward(Coordinate coordinate);

    void back(Coordinate coordinate);
}
