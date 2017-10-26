public class Person {
    private final Label _name;
    private final Label _mail;
    public Person(Label name, Label mail) {
        _name = name;
        _mail = mail;
    }
    public Person(Label name) {
        this(name, new NullLabel());
    }
    public void display() {
        if (!_name.isNull()) {
            _name.display();
        }
        if (!_mail.isNull()) {
            _mail.display();
        }
    }
    public String toString() {
        String result = "[ Person:";

        result += " name=";
        if (_name.isNull()) {
            result += "\"(none)\"";
        } else {
            result += _name;
        }

        result += " mail=";
        if (_mail.isNull()) {
            result += "\"(none)\"";
        } else {
            result += _mail;
        }

        result += " ]";

        return result;
    }
}
