package kata;

import kata.command.CommandFactory;
import kata.direction.DirectionFactory;
import kata.direction.Directions;

import java.util.Arrays;

public class MarsRover {
    private String direction;
    private final Coordinate coordinate;

    public MarsRover(int x, int y, String direction) {
        this.coordinate = new Coordinate(x, y);
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        Arrays.stream(commands.split("")).forEach(this::execute);
    }

    public void execute(String command) {
        CommandFactory.of(command).execute(this);
    }

    public void back() {
        DirectionFactory.of(direction).back(coordinate);
    }

    public void forward() {
        DirectionFactory.of(direction).forward(coordinate);
    }

    public void turnRight() {
        direction = Directions.right(direction);
    }

    public void turnLeft() {
        direction = Directions.left(direction);
    }

    public int getX() {
        return coordinate.x();
    }

    public int getY() {
        return coordinate.y();
    }

    public String getDirection() {
        return direction;
    }

}
