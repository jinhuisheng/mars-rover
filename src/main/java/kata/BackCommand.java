package kata;

public class BackCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.back();
    }
}
