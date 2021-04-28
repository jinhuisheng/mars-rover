package kata.direction;

import kata.Coordinate;

public class NorthDirection implements IDirection {
    @Override
    public void forward(Coordinate coordinate) {
        coordinate.forwardToNorth();
    }

    @Override
    public void back(Coordinate coordinate) {
        coordinate.backToNorth();
    }
}
