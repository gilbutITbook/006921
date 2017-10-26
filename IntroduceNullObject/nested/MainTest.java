import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;
import com.hyuki.refbook.StandardOutputTest;

public class MainTest extends StandardOutputTest {
    @Test public void testLabel() {
        Label alice = new Label("Alice");
        String expected = "\"Alice\"";
        String actual = alice.toString();
        assertEquals(expected, actual);
    }

    @Test public void testNullLabel() {
        Label alice = new Label(null);
        String expected = "\"null\"";
        String actual = alice.toString();
        assertEquals(expected, actual);
    }

    @Test public void testNullMail() {
        Person alice = new Person(new Label("Alice"));
        String expected = "[ Person: name=\"Alice\" mail=\"(none)\" ]";
        String actual = alice.toString();
        assertEquals(expected, actual);
    }

    @Test public void testToString() {
        Person alice = new Person(new Label("Alice"), new Label("alice@example.com"));
        String expected = "[ Person: name=\"Alice\" mail=\"alice@example.com\" ]";
        String actual = alice.toString();
        assertEquals(expected, actual);
    }

    @Test public void testDisplay() {
        Person alice = new Person(new Label("Alice"), new Label("alice@example.com"));
        alice.display();
        String expected = getExpectedOutput(
            "display: Alice",
            "display: alice@example.com");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
