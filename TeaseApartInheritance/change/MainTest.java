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
            "<tr><td>java</td><td>applet</td><td>Applet</td></tr>",
            "<tr><td>java</td><td>applet</td><td>AppletContext</td></tr>",
            "<tr><td>java</td><td>awt</td><td>ActiveEvent</td></tr>",
            "<tr><td>java</td><td>awt</td><td>Button</td></tr>",
            "<tr><td>java</td><td>awt</td><td>Canvas</td></tr>",
            "<tr><td>java</td><td>awt</td><td>color</td><td>ColorSpace</td></tr>",
            "<tr><td>java</td><td>awt</td><td>datatransfer</td><td>Clipboard</td></tr>",
            "<tr><td>java</td><td>awt</td><td>event</td><td>ActionEvent</td></tr>",
            "<tr><td>java</td><td>awt</td><td>event</td><td>ActionListener</td></tr>",
            "<tr><td>java</td><td>io</td><td>BufferedInputStream</td></tr>",
            "<tr><td>java</td><td>io</td><td>BufferedOutputStream</td></tr>",
            "<tr><td>java</td><td>lang</td><td>Object</td></tr>",
            "<tr><td>java</td><td>lang</td><td>String</td></tr>",
            "<tr><td>java</td><td>lang</td><td>StringBuffer</td></tr>",
            "<tr><td>java</td><td>util</td><td>ArrayList</td></tr>",
            "<tr><td>java</td><td>util</td><td>EventListener</td></tr>",
            "<tr><td>java</td><td>util</td><td>Map</td></tr>",
            "<tr><td>java</td><td>util</td><td>jar</td><td>JarInputStream</td></tr>",
            "<tr><td>java</td><td>util</td><td>jar</td><td>JarOutputStream</td></tr>",
            "<tr><td>java</td><td>util</td><td>logging</td><td>Formatter</td></tr>",
            "<tr><td>java</td><td>util</td><td>logging</td><td>Logger</td></tr>",
            "<tr><td>java</td><td>util</td><td>regex</td><td>Pattern</td></tr>",
            "<tr><td>java</td><td>util</td><td>zip</td><td>CheckedInputStream</td></tr>",
            "<tr><td>java</td><td>util</td><td>zip</td><td>CheckedOutputStream</td></tr>",
            "</table>",
            "좋은 아침입니다.",
            "    Good morning.",
            "안녕하세요~",
            "    Hello.",
            "안녕하세요.",
            "    Good evening.",
            "안녕히 주무세요.",
            "    Good night.");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
