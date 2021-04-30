package kata.direction;

import kata.Coordinate;

public class WestDirection implements Direction {
    @Override
    public void forward(Coordinate coordinate) {
        coordinate.decreaseX();
    }

    @Override
    public void back(Coordinate coordinate) {
        coordinate.increaseX();
    }
}
