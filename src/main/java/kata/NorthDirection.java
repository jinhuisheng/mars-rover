package kata;

public class NorthDirection implements Direction {
    @Override
    public void forward(MarsRover marsRover) {
        marsRover.increaseY();
    }

    @Override
    public void back(MarsRover marsRover) {
        marsRover.decreaseY();

    }
}
