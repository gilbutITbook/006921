public class Label {
    public final static Label NULL = new NullLabel();
    private final String _label;
    public Label(String label) {
        _label = label;
    }
    public void display() {
        System.out.println("display: " + _label);
    }
    public String toString() {
        return "\"" + _label + "\"";
    }
    public boolean isNull() {
        return false;
    }

    // 널 객체
    private static class NullLabel extends Label {
        public NullLabel() {
            super("(none)");
        }
        @Override public void display() {
        }
        @Override public boolean isNull() {
            return true;
        }
    }
}
