package kata.command;

import kata.MarsRover;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public interface Command {
    void execute(MarsRover marsRover);
}
