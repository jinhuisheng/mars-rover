package kata.direction;

import kata.Coordinate;

public class WestDirection implements IDirection {
    @Override
    public void forward(Coordinate coordinate) {
        coordinate.forwardToWest();
    }

    @Override
    public void back(Coordinate coordinate) {
        coordinate.backToWest();
    }
}
