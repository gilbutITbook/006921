import java.util.*;

public class Robot {
    private final String _name;
    private final Position _position = new Position(0, 0);
    private final Direction _direction = new Direction(0, 1);
    public Robot(String name) {
        _name = name;
    }
    public void execute(String commandSequence) {
        StringTokenizer tokenizer = new StringTokenizer(commandSequence);
        try {
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                executeCommand(token);
            }
        } catch (InvalidCommandException e) {
            System.out.println("Invalid command: " + e.getMessage());
        }
    }
    public void executeCommand(String commandString) throws InvalidCommandException {
        Command command = Command.parseCommand(commandString);
        executeCommand(command);
    }
    public void executeCommand(Command command) throws InvalidCommandException {
        if (command == Command.FORWARD) {
            _position.relativeMove(_direction._x, _direction._y);
        } else if (command == Command.BACKWARD) {
            _position.relativeMove(-_direction._x, -_direction._y);
        } else if (command == Command.TURN_RIGHT) {
            _direction.setDirection(_direction._y, -_direction._x);
        } else if (command == Command.TURN_LEFT) {
            _direction.setDirection(-_direction._y, _direction._x);
        } else {
            throw new InvalidCommandException();
        }
    }
    public String toString() {
        return "[ Robot: " + _name + " "
            + "position(" + _position._x + ", " + _position._y + "), "
            + "direction(" + _direction._x + ", " + _direction._y + ") ]";
    }
}
