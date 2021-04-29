package kata;

public class SouthDirection implements Direction {
    @Override
    public void forward(MarsRover marsRover) {
        marsRover.decreaseY();
    }

    @Override
    public void back(MarsRover marsRover) {
        marsRover.increaseY();
    }
}
