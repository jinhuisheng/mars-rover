package kata.direction;

import kata.Coordinate;

public class SouthDirection implements IDirection {
    @Override
    public void forward(Coordinate coordinate) {
        coordinate.forwardToSouth();
    }

    @Override
    public void back(Coordinate coordinate) {
        coordinate.backToSouth();
    }
}
