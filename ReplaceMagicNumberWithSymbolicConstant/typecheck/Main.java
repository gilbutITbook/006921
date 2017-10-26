public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(0); // Compile error!
        robot.order(Robot.COMMAND_STOP); // stop
        robot.order(Robot.COMMAND_JUMP); // jump
    }
}
