package kata;

import kata.direction.DirectionFactory;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void forward(Direction direction) {
        DirectionFactory.of(direction).forward(this);
    }

    public void forwardToWest() {
        this.x -= 1;
    }

    public void forwardToEast() {
        this.x += 1;
    }

    public void forwardToSouth() {
        this.y -= 1;
    }

    public void forwardToNorth() {
        this.y += 1;
    }

    public void back(Direction direction) {
        DirectionFactory.of(direction).back(this);
    }

    public void backToEast() {
        this.x -= 1;
    }

    public void backToNorth() {
        this.y -= 1;
    }

    public void backToSouth() {
        this.y += 1;
    }

    public void backToWest() {
        this.x += 1;
    }
}
