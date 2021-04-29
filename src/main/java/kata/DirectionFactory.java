package kata;

import java.util.HashMap;

public class DirectionFactory {

    private static final HashMap<String, Direction> DIRECTION_MAP = new HashMap<>();

    static {
        DIRECTION_MAP.put("E", new EastDirection());
        DIRECTION_MAP.put("S", new SouthDirection());
        DIRECTION_MAP.put("W", new WestDirection());
        DIRECTION_MAP.put("N", new NorthDirection());
    }

    static Direction of(String direction) {
        return DIRECTION_MAP.get(direction);
    }
}
