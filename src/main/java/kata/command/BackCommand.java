package kata.command;

import kata.MarsRover;

public class BackCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.back();
    }
}
