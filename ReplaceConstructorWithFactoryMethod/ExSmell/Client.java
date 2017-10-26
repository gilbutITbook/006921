public class Client {
    private final Printer _printer;
    public Client(boolean graphical) {
        if (graphical) {
            _printer = new GraphPrinter();
        } else {
            _printer = new DigitPrinter();
        }
    }
    public void execute() {
        int[] table = { 3, 1, 4, 1, 5, 9 };
        for (int n : table) {
            _printer.println(n);
        }
    }
}
