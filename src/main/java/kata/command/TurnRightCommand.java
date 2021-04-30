package kata.command;

import kata.MarsRover;

public class TurnRightCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnRight();
    }
}
