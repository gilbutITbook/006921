import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;
import com.hyuki.refbook.StandardOutputTest;

public class MainTest extends StandardOutputTest {
    @Test public void testMain() {
        Main.main(new String[0]);
        String expected = getExpectedOutput(
            "book = [ 0, 세계 역사, 4800 ]",
            "dvd  = [ 1, 뉴욕의 꿈 특별판, 3000 ]",
            "soft = [ 2, 튜링 머신 에뮬레이터, 3200 ]");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
