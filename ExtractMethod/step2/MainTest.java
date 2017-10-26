import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;
import com.hyuki.refbook.StandardOutputTest;
import com.hyuki.refbook.StandardOutputTest;

public class MainTest extends StandardOutputTest {
    @Test public void testHello() {
        Banner banner = new Banner("Hello");
        banner.print(1);

        String expected = getExpectedOutput(
            "+-----+",
            "|Hello|",
            "+-----+");
        String actual = getActualOutput();

        assertEquals(expected, actual);
    }

    @Test public void testWorld() {
        Banner banner = new Banner("Hello, World!");
        banner.print(3);

        String expected = getExpectedOutput(
            "+-------------+",
            "|Hello, World!|",
            "|Hello, World!|",
            "|Hello, World!|",
            "+-------------+");
        String actual = getActualOutput();

        assertEquals(expected, actual);
    }

    @Test public void testEmpty() {
        Banner banner = new Banner("");
        banner.print(2);

        String expected = getExpectedOutput(
            "++",
            "||",
            "||",
            "++");
        String actual = getActualOutput();

        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
