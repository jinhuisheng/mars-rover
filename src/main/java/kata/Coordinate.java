package kata;

/**
 * @author huisheng.jin
 * @date 2020/10/9.
 */
public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinate forward(Direction direction) {
        switch (direction) {
            case N:
                return new Coordinate(x, this.y += 1);
            case S:
                return new Coordinate(x, this.y -= 1);
            case W:
                return new Coordinate(this.x -= 1, y);
            case E:
                return new Coordinate(this.x += 1, y);
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
    }

    public Coordinate back(Direction direction) {
        switch (direction) {
            case N:
                return new Coordinate(x, this.y -= 1);
            case S:
                return new Coordinate(x, this.y += 1);
            case W:
                return new Coordinate(this.x += 1, y);
            case E:
                return new Coordinate(this.x -= 1, y);
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
    }
}
