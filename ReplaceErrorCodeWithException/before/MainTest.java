import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;
import com.hyuki.refbook.StandardOutputTest;

public class MainTest extends StandardOutputTest {
    @Test public void testNew() {
        Robot robot = new Robot("Andrew");
        String actual = robot.toString();
        String expected = "[ Robot: Andrew position(0, 0), direction(0, 1) ]";
        assertEquals(expected, actual);
    }

    @Test public void testFRF() {
        Robot robot = new Robot("Andrew");
        robot.execute("forward right forward");
        String actual = robot.toString();
        String expected = "[ Robot: Andrew position(1, 1), direction(1, 0) ]";
        assertEquals(expected, actual);
    }

    @Test public void testFRFLBLF() {
        Robot robot = new Robot("Andrew");
        robot.execute("forward right forward");
        robot.execute("left backward left forward");
        String actual = robot.toString();
        String expected = "[ Robot: Andrew position(0, 0), direction(-1, 0) ]";
        assertEquals(expected, actual);
    }

    @Test public void testError() {
        Robot robot = new Robot("Andrew");
        robot.execute("farvard");
        String actual = getActualOutput();
        String expected = getExpectedOutput("Invalid command: farvard");
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
