package kata.command;

import kata.MarsRover;

public class TurnLeftCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnLeft();
    }
}
