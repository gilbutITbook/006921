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
        _name.display();
        _mail.display();
    }
    public String toString() {
        String result = "[ Person:";

        result += " name=";
        result += _name;

        result += " mail=";
        result += _mail;

        result += " ]";

        return result;
    }
}
