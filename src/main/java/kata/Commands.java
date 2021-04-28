package kata;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class Commands {
    private Map<String, Runnable> commandExecutors;

    public Commands(MarsRover marsRover) {
        commandExecutors = new HashMap<>();
        commandExecutors.put("l", marsRover::turnLeft);
        commandExecutors.put("r", marsRover::turnRight);
        commandExecutors.put("f", marsRover::forward);
        commandExecutors.put("b", marsRover::back);
    }

    public Runnable get(String command) {
        return commandExecutors.get(command);
    }
}
