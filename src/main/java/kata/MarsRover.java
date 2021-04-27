package kata;

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
        return map;
    }

    public void execute(String command) {
        if (command.equals("L") || command.equals("R")) {
            commandExecutors.get(command).execute(this);
            return;
        }
        if (command.equals("B")) {
            y = y - 1;
            return;
        }

        forward();
    }

    private void forward() {
        if (direction.equals("E")) {
            x += 1;
            return;
        }
        y = y + 1;
    }

    public void turnRight() {
        direction = Direction.right(direction);
    }

    public void turnLeft() {
        direction = Direction.left(direction);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void executeCommands(String commands) {
        for (String command : commands.split("")) {
            execute(command);
        }
    }

    public String getDirection() {
        return direction;
    }

}
