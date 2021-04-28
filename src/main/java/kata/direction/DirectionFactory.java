package kata.direction;

import kata.Direction;

import java.util.HashMap;
import java.util.Map;

public class DirectionFactory {
    private static final Map<Direction, IDirection> map = new HashMap<>();

    static {
        map.put(Direction.N, new NorthDirection());
        map.put(Direction.S, new SouthDirection());
        map.put(Direction.E, new EastDirection());
        map.put(Direction.W, new WestDirection());
    }

    public static IDirection of(Direction direction) {
        return map.get(direction);
    }
}
