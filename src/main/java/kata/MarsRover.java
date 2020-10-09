package kata;

/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class MarsRover {
    private Direction direction;
    private Coordinate coordinate;

    public MarsRover(int x, int y, Direction directionNum) {
        this.coordinate = new Coordinate(x, y);
        this.direction = directionNum;
    }

    public int getX() {
        return this.coordinate.getX();
    }

    public int getY() {
        return this.coordinate.getY();
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnLeft() {
        this.direction = direction.left();
    }

    public void turnRight() {
        this.direction = direction.right();
    }

    public void forward() {
        this.coordinate = coordinate.forward(this.direction);
    }

    public void back() {
        this.coordinate = coordinate.back(this.direction);
    }
}
