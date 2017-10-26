import java.util.*;

public class Command {
    public static final Command FORWARD = new Command("forward");
    public static final Command BACKWARD = new Command("backward");
    public static final Command TURN_RIGHT = new Command("right");
    public static final Command TURN_LEFT = new Command("left");
    private static final Map<String,Command> _commandNameMap = new HashMap<String,Command>();
    static {
        _commandNameMap.put(FORWARD._name, FORWARD);
        _commandNameMap.put(BACKWARD._name, BACKWARD);
        _commandNameMap.put(TURN_RIGHT._name, TURN_RIGHT);
        _commandNameMap.put(TURN_LEFT._name, TURN_LEFT);
    }
    private final String _name;
    private Command(String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }
    public static Command parseCommand(String name) {
        if (!_commandNameMap.containsKey(name)) {
            return null;
        }
        return _commandNameMap.get(name);
    }
}
