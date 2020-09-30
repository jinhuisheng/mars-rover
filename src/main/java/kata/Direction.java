package kata;

import java.util.Arrays;

/**
 * @author huisheng.jin
 * @date 2020/9/30.
 */
public enum Direction {
    /**
     *
     */
    W("S", "W", "N"),
    E("N", "E", "S"),
    S("E", "S", "W"),
    N("W", "N", "E");

    private String left;
    private String value;
    private String right;

    Direction(String left, String value, String right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }

    public Direction left() {
        return Arrays.stream(Direction.values())
                .filter(direction -> direction.getValue().equals(this.left))
                .findFirst().get();
    }

    public Direction right() {
        return Arrays.stream(Direction.values())
                .filter(direction -> direction.getValue().equals(this.right))
                .findFirst().get();
    }


    public String getValue() {
        return value;
    }
}
