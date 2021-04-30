package kata.direction;

import kata.Coordinate;

public class EastDirection implements Direction {
    @Override
    public void forward(Coordinate coordinate) {
        coordinate.increaseX();

    }

    @Override
    public void back(Coordinate coordinate) {
        coordinate.decreaseX();
    }
}
