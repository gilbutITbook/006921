import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PersonTest {
    private Person _person;

    @Before public void setUp() {
        _person = new Person("Alice", "alice@example.com");
    }

    @After public void tearDown() {
    }

    @Test public void testName() {
        assertEquals("getName test", "Alice", _person.getName());
    }

    @Test public void testMail() {
        assertEquals("getMail test", "alice@example.com", _person.getMail());
    }

    @Test public void testSetName() {
        _person.setName("Bobby");
        assertEquals("setName test", "Bobby", _person.getName());
    }

    @Test public void testSetMail() {
        _person.setMail("bobby@example.org");
        assertEquals("setMail test", "bobby@example.org", _person.getMail());
    }

    @Test public void testToString() {
        assertEquals("toString test", "Alice <alice@example.com>", _person.toString());
    }
}
