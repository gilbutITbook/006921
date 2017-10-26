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
}
