package kata;

import kata.command.*;

import java.util.Arrays;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class MarsRover {
    private Direction direction;
    private Coordinate coordinate;
    private CommandContainer commandContainer;

    public MarsRover(Coordinate coordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = coordinate;
        this.commandContainer = new CommandContainer();
    }

    public void executeCommands(String commands) {
        Arrays.stream(commands.split("")).forEach(this::execute);
    }

    private void execute(String command) {
        Command commandHandler = commandContainer.get(command);
        commandHandler.execute(this);
    }

    public Integer getX() {
        return coordinate.getX();
    }

    public Integer getY() {
        return coordinate.getY();
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnLeft() {
        this.direction = this.direction.left();
    }

    public void turnRight() {
        this.direction = this.direction.right();
    }

    public void forward() {
        this.coordinate = this.coordinate.forward(this.direction);
    }

    public void back() {
        this.coordinate = this.coordinate.back(this.direction);
    }
}
