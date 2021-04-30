package kata.direction;

import kata.Coordinate;

public class SouthDirection implements Direction {
    @Override
    public void forward(Coordinate coordinate) {
        coordinate.decreaseY();
    }

    @Override
    public void back(Coordinate coordinate) {
        coordinate.increaseY();
    }
}
