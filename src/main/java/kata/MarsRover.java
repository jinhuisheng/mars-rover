package kata;

import kata.command.*;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class MarsRover {
    private Direction direction;
    private Coordinate coordinate;
    private HashMap<String, Command> commandHandlers = new HashMap<>();

    public MarsRover(Coordinate coordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = coordinate;
        initCommandHandler();
    }

    private void initCommandHandler() {
        commandHandlers.put("l", new TurnLeftCommand());
        commandHandlers.put("r", new TurnRightCommand());
        commandHandlers.put("f", new ForwardCommand());
        commandHandlers.put("b", new BackCommand());
    }

    public void executeCommands(String commands) {
        Arrays.stream(commands.split("")).forEach(this::execute);
    }

    private void execute(String command) {
        Command commandHandler = commandHandlers.get(command);
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
