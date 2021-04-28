package kata.direction;

import kata.Coordinate;

public class EastDirection implements IDirection {
    @Override
    public void forward(Coordinate coordinate) {
        coordinate.forwardToEast();
    }

    @Override
    public void back(Coordinate coordinate) {
        coordinate.backToEast();
    }
}
