public abstract class Printer {
    public abstract void println(int n);
    public static Printer create(boolean graphical) {
        if (graphical) {
            return new GraphPrinter();
        } else {
            return new DigitPrinter();
        }
    }
}
