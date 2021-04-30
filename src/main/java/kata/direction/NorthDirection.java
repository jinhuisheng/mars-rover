package kata.direction;

import kata.Coordinate;

public class NorthDirection implements Direction {
    @Override
    public void forward(Coordinate coordinate) {
        coordinate.increaseY();
    }

    @Override
    public void back(Coordinate coordinate) {
        coordinate.decreaseY();

    }
}
