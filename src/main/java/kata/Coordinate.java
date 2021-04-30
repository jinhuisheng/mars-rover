package kata;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void decreaseX() {
        x -= 1;
    }

    public void increaseX() {
        x += 1;
    }

    public int x() {
        return x;
    }

    public void decreaseY() {
        y -= 1;
    }

    public void increaseY() {
        y += 1;
    }

    public int y() {
        return y;
    }
}
