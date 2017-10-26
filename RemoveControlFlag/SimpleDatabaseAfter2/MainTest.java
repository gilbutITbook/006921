import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;

import java.io.*;

public class MainTest {
    private static String FILENAME = "testfile.txt";

    @Before public void setUp() throws IOException {
        PrintWriter writer = new PrintWriter(FILENAME);
        writer.println("hyuki@example.com=Hiroshi Yuki");
        writer.println("sato@example.com=Sato Hanako");
        writer.println("tomura@example.com=Tomura");
        writer.close();
    }

    @After public void tearDown() throws IOException {
        new File(FILENAME).delete();
    }

    @Test public void testFound() throws IOException {
        SimpleDatabase db = new SimpleDatabase(new FileReader(FILENAME));
        String expected = "Hiroshi Yuki";
        String actual = db.getValue("hyuki@example.com");
        assertEquals(expected, actual);
    }

    @Test public void testNotFound() throws IOException {
        SimpleDatabase db = new SimpleDatabase(new FileReader(FILENAME));
        String expected = null;
        String actual = db.getValue("unknown@example.com");
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
