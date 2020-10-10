package kata.command;

import kata.MarsRover;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class ForwardCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.forward();
    }
}
