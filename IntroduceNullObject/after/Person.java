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
        return "[ Person: name=" + _name + " mail=" + _mail + " ]";
    }
}
