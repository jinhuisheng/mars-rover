package kata;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private final static Map<String, Command> EXECUTORS;

    static {
        EXECUTORS = new HashMap<>();
        EXECUTORS.put("L", new TurnLeftCommand());
        EXECUTORS.put("R", new TurnRightCommand());
        EXECUTORS.put("F", new ForwardCommand());
        EXECUTORS.put("B", new BackCommand());
    }

    public static Command of(String command) {
        return EXECUTORS.get(command);
    }
}
