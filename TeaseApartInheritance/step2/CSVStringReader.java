import java.io.*;

public class CSVStringReader extends CSVReader {
    private final BufferedReader _bufReader;

    public CSVStringReader(String string) {
        _bufReader = new BufferedReader(new StringReader(string));
    }

    @Override public String[] readCSV() throws IOException {
        String line = _bufReader.readLine();
        if (line == null) {
            return null;
        } else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }
    }

    @Override public void close() throws IOException {
        _bufReader.close();
    }
}
