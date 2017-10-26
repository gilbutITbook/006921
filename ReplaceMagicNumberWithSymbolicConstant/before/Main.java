public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(0); // walk
        robot.order(1); // stop
        robot.order(2); // jump
    }
}
