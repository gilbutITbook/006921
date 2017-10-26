import java.io.*;
import java.util.*;
import java.util.regex.*;

public class SimpleDatabase {
    private Map<String,String> _map = new HashMap<String,String>();
    private static Pattern _pattern = Pattern.compile("([^=]+)=(.*)");
    public SimpleDatabase(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            Matcher matcher = _pattern.matcher(line);
            if (matcher.matches()) {
                String key = matcher.group(1);
                String value = matcher.group(2);
                _map.put(key, value);
            }
        }
    }
    public void putValue(String key, String value) {
        _map.put(key, value);
    }
    public String getValue(String key) {
        return _map.get(key);
    }
    public Iterator<String> iterator() {
        return _map.keySet().iterator();
    }
}
