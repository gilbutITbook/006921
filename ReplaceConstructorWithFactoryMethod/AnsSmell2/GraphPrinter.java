public class GraphPrinter extends Printer {
    public void println(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.printf(" (%d)", n);
        System.out.println();
    }
}
