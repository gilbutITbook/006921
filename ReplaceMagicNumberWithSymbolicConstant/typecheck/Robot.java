public class Robot {
    private final String _name;
    public static final RobotCommand COMMAND_WALK = new RobotCommand() {
        public void apply(Robot robot) {
            System.out.println(robot._name + " walks.");
        }
    };
    public static final RobotCommand COMMAND_STOP = new RobotCommand() {
        public void apply(Robot robot) {
            System.out.println(robot._name + " stops.");
        }
    };
    public static final RobotCommand COMMAND_JUMP = new RobotCommand() {
        public void apply(Robot robot) {
            System.out.println(robot._name + " jumps.");
        }
    };
    public Robot(String name) {
        _name = name;
    }
    public void order(RobotCommand command) {
        command.apply(this);
    }
}
