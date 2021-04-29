package kata;

import java.util.Arrays;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        Arrays.stream(commands.split("")).forEach(this::execute);
    }

    public void execute(String command) {
        CommandFactory.of(command).execute(this);
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

    public String getDirection() {
        return direction;
    }

}
