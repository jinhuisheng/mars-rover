package kata.command;

import java.util.HashMap;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class CommandContainer {
    private HashMap<String, Command> commandHandlers;

    public CommandContainer() {
        commandHandlers = new HashMap<>();
        commandHandlers.put("l", new TurnLeftCommand());
        commandHandlers.put("r", new TurnRightCommand());
        commandHandlers.put("f", new ForwardCommand());
        commandHandlers.put("b", new BackCommand());
    }

    public Command get(String command) {
        return commandHandlers.get(command);
    }
}
