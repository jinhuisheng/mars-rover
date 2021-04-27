package kata;

public class TurnLeftCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnLeft();
    }
}
