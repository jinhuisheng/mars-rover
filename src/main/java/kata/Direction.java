package kata;

import java.util.Arrays;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public enum Direction {
    S("E", "W"),
    N("W", "E"),
    E("N", "S"),
    W("S", "N");

    private final String left;
    private final String right;

    Direction(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public Direction left() {
        return getDirection(this.left);
    }

    public Direction right() {
        return getDirection(this.right);
    }

    private Direction getDirection(String name) {
        return Arrays.stream(Direction.values())
                .filter(item -> item.name().equals(name))
                .findFirst()
                .get();
    }

}
