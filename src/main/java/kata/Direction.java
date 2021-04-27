package kata;

import java.util.ArrayList;
import java.util.List;

public class Direction {

    private static final List<String> directions;

    static {
        directions = new ArrayList<>();
        directions.add("N");
        directions.add("E");
        directions.add("S");
        directions.add("W");
    }

    public static String left(String direction) {
        int index = directions.indexOf(direction);
        return directions.get((index + directions.size() - 1) % directions.size());
    }

    public static String right(String direction) {
        int index = directions.indexOf(direction);
        return directions.get((index + directions.size() + 1) % directions.size());
    }
}
