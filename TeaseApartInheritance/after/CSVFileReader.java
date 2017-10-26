import java.io.*;

public class CSVFileReader extends CSVReader {
    public CSVFileReader(String filename) throws IOException {
        super(new BufferedReader(new FileReader(filename)));
    }
}
