package kata;

public class WestDirection implements Direction {
    @Override
    public void forward(MarsRover marsRover) {
        marsRover.decreaseX();
    }

    @Override
    public void back(MarsRover marsRover) {
        marsRover.increaseX();
    }
}
