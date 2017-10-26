public class ValueChangeEvent {
    private final Value _source;
    public ValueChangeEvent(Value source) {
        _source = source;
    }
    public Value getSource() {
        return _source;
    }
}
