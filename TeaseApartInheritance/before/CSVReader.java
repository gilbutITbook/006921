import java.io.*;
import java.util.regex.*;

public abstract class CSVReader {
    protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");
    public abstract String[] readCSV() throws IOException;
    public abstract void close() throws IOException;
}
