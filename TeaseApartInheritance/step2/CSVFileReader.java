import java.io.*;

public class CSVFileReader extends CSVReader {
    private final BufferedReader _bufReader;

    public CSVFileReader(String filename) throws IOException {
        _bufReader = new BufferedReader(new FileReader(filename));
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
