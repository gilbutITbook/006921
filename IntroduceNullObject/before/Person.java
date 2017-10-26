public class Person {
    private final Label _name;
    private final Label _mail;
    public Person(Label name, Label mail) {
        _name = name;
        _mail = mail;
    }
    public Person(Label name) {
        this(name, null);
    }
    public void display() {
        if (_name != null) {
            _name.display();
        }
        if (_mail != null) {
            _mail.display();
        }
    }
    public String toString() {
        String result = "[ Person:";

        result += " name=";
        if (_name == null) {
            result += "\"(none)\"";
        } else {
            result += _name;
        }

        result += " mail=";
        if (_mail == null) {
            result += "\"(none)\"";
        } else {
            result += _mail;
        }

        result += " ]";

        return result;
    }
}
