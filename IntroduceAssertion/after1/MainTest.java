import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;

public class MainTest {
    @Test public void testMain() {
        SortSample sorter = new SortSample(new int[]{ 3, 1, 4, 1, 5, 9 });
        sorter.sort();
        String actual = sorter.toString();
        String expected = "[ 1, 1, 3, 4, 5, 9, ]";
        assertEquals(expected, actual);
    }

    @Test public void testZero() {
        SortSample sorter = new SortSample(new int[]{});
        sorter.sort();
        String actual = sorter.toString();
        String expected = "[ ]";
        assertEquals(expected, actual);
    }

    @Test public void testRandom() {
        SortSample sorter = new SortSample(new int[]{ 8, 3, 3, 0, 0, 3, 9, 9, 7, 7, });
        sorter.sort();
        String actual = sorter.toString();
        String expected = "[ 0, 0, 3, 3, 3, 7, 7, 8, 9, 9, ]";
        System.out.println();System.out.println(expected);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
