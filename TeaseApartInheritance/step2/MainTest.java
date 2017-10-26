import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;
import com.hyuki.refbook.StandardOutputTest;

import java.io.*;

public class MainTest extends StandardOutputTest {
    @Test public void testMain() throws IOException {
        Main.main(new String[0]);

        String expected = getExpectedOutput(
            "<table>",
            "<tr><td>좋은 아침입니다.</td><td>Good morning.</td></tr>",
            "<tr><td>안녕하세요~</td><td>Hello.</td></tr>",
            "<tr><td>안녕하세요.</td><td>Good evening.</td></tr>",
            "<tr><td>안녕히 주무세요.</td><td>Good night.</td></tr>",
            "</table>",
            "java",
            "    applet",
            "        Applet",
            "        AppletContext",
            "    awt",
            "        ActiveEvent",
            "        Button",
            "        Canvas",
            "        color",
            "            ColorSpace",
            "        datatransfer",
            "            Clipboard",
            "        event",
            "            ActionEvent",
            "            ActionListener",
            "    io",
            "        BufferedInputStream",
            "        BufferedOutputStream",
            "    lang",
            "        Object",
            "        String",
            "        StringBuffer",
            "    util",
            "        ArrayList",
            "        EventListener",
            "        Map",
            "        jar",
            "            JarInputStream",
            "            JarOutputStream",
            "        logging",
            "            Formatter",
            "            Logger",
            "        regex",
            "            Pattern",
            "        zip",
            "            CheckedInputStream",
            "            CheckedOutputStream");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
