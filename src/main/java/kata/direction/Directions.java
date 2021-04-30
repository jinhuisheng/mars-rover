package kata.direction;

import java.util.ArrayList;
import java.util.List;

public class Directions {

    private static final List<String> DIRECTIONS;

    static {
        DIRECTIONS = new ArrayList<>();
        DIRECTIONS.add("N");
        DIRECTIONS.add("E");
        DIRECTIONS.add("S");
        DIRECTIONS.add("W");
    }

    public static String left(String direction) {
        int index = DIRECTIONS.indexOf(direction);
        return DIRECTIONS.get((index + DIRECTIONS.size() - 1) % DIRECTIONS.size());
    }

    public static String right(String direction) {
        int index = DIRECTIONS.indexOf(direction);
        return DIRECTIONS.get((index + DIRECTIONS.size() + 1) % DIRECTIONS.size());
    }
}
