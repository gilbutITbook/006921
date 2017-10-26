import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;

public class MainTest {
    @Test public void testMain() {
        ImmutableAuthor immutable = new Author("Mr.Mutable", "mutable@example.com");
        String actual = immutable.getName() + ":" + immutable.getMail();
        String expected = "Mr.Mutable:mutable@example.com";
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
