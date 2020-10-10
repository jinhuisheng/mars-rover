package kata;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class Coordinate {
    private final int x;
    private final int y;

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

    public Coordinate forward(Direction direction) {
        if (direction == Direction.N) {
            return new Coordinate(this.x, this.y + 1);
        }
        if (direction == Direction.S) {
            return new Coordinate(this.x, this.y - 1);
        }
        if (direction == Direction.E) {
            return new Coordinate(this.x + 1, this.y);
        }
        if (direction == Direction.W) {
            return new Coordinate(this.x - 1, this.y);
        }
        return null;
    }

    public Coordinate back(Direction direction) {
        if (direction == Direction.N) {
            return new Coordinate(this.x, this.y - 1);
        }
        if (direction == Direction.S) {
            return new Coordinate(this.x, this.y + 1);
        }
        if (direction == Direction.E) {
            return new Coordinate(this.x - 1, this.y);
        }
        if (direction == Direction.W) {
            return new Coordinate(this.x + 1, this.y);
        }
        return null;
    }
}
