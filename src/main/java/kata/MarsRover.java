package kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private int x;
    private int y;
    private String direction;
    private final Map<String, Command> commandExecutors;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.commandExecutors = initCommands();
    }

    private Map<String, Command> initCommands() {
        Map<String, Command> map = new HashMap<>();
        map.put("L", new TurnLeftCommand());
        map.put("R", new TurnRightCommand());
        map.put("F", new ForwardCommand());
        map.put("B", new BackCommand());
        return map;
    }

    public void execute(String command) {
        commandExecutors.get(command).execute(this);
    }

    public void back() {
        DirectionFactory.of(direction).back(this);
    }

    public void forward() {
        DirectionFactory.of(direction).forward(this);
    }

    public void decreaseX() {
        x -= 1;
    }

    public void decreaseY() {
        y -= 1;
    }

    public void increaseX() {
        x += 1;
    }

    public void increaseY() {
        y = y + 1;
    }

    public void turnRight() {
        direction = Directions.right(direction);
    }

    public void turnLeft() {
        direction = Directions.left(direction);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void executeCommands(String commands) {
        Arrays.stream(commands.split("")).forEach(this::execute);
    }

    public String getDirection() {
        return direction;
    }

}
