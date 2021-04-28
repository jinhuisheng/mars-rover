package kata;

import java.util.Arrays;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class MarsRover {
    private Direction direction;
    private Coordinate coordinate;
    private final Commands commands;

    public MarsRover(Coordinate coordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = coordinate;
        this.commands = new Commands(this);
    }

    public void executeCommands(String commands) {
        Arrays.stream(commands.split("")).forEach(this::execute);
    }

    private void execute(String command) {
        commands.get(command).run();
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
        direction = direction.left();
    }

    public void turnRight() {
        direction = direction.right();
    }

    public void forward() {
        coordinate.forward(direction);
    }

    public void back() {
        coordinate.back(direction);
    }
}
