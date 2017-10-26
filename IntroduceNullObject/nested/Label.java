public class Label {
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
    // 팩토리 메서드
    public static Label newNull() {
        return NullLabel.getInstance();
    }

    // 널 객체
    private static class NullLabel extends Label {
        // 싱글톤
        private static final NullLabel singleton = new NullLabel();
        private static NullLabel getInstance() {
            return singleton;
        }
        private NullLabel() {
            super("(none)");
        }
        @Override public void display() {
        }
        @Override public boolean isNull() {
            return true;
        }
    }
}
