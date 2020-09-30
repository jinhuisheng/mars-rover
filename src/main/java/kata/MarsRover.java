package kata;

/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction directionNum) {
        this.x = x;
        this.y = y;
        this.direction = directionNum;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
}
