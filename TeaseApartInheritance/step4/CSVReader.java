import java.util.regex.*;
import java.io.*;

public class CSVReader {
    protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");
    protected final BufferedReader _bufReader;
    protected CSVReader(BufferedReader bufReader) {
        _bufReader = bufReader;
    }
    public String[] readCSV() throws IOException {
        String line = _bufReader.readLine();
        if (line == null) {
            return null;
        } else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }
    }
    public void close() throws IOException {
        _bufReader.close();
    }
}
