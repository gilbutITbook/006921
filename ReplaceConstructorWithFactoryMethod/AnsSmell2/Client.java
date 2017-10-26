public class Client {
    private final Printer _printer;
    public Client(Printer printer) {
        _printer = printer;
    }
    public void execute() {
        int[] table = { 3, 1, 4, 1, 5, 9 };
        for (int n : table) {
            _printer.println(n);
        }
    }
}
