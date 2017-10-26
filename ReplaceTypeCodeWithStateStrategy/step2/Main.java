public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("information #1");

        logger.start();
        logger.log("information #2");

        logger.start();
        logger.log("information #3");

        logger.stop();
        logger.log("information #4");

        logger.stop();
        logger.log("information #5");
    }
}
