import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;
import com.hyuki.refbook.StandardOutputTest;

public class MainTest extends StandardOutputTest {
    @Test public void testMain() {
        Main.main(new String[0]);

        String expected = getExpectedOutput(
            "name=Hiroshi Yuki, mail=hyuki@example.com",
            "name=Tomura, mail=tomura@example.com",
            "name=Hanako Sato, mail=hanako@example.com");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
