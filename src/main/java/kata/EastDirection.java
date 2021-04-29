package kata;

public class EastDirection implements Direction {
    @Override
    public void forward(MarsRover marsRover) {
        marsRover.increaseX();

    }

    @Override
    public void back(MarsRover marsRover) {
        marsRover.decreaseX();
    }
}
