import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;

public class MainTest {
    @Test public void testFound() {
        int[] data = {
            1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
        };
        boolean actual = FindInt.find(data, 5);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test public void testNotFound() {
        int[] data = {
            1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
        };
        boolean actual = FindInt.find(data, 10);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
