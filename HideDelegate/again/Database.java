import java.io.*;
import java.util.*;

public class Database {
    private final Properties _properties;
    private final String _filename;
    public Database(String filename) {
        _filename = filename;
        _properties = new Properties();
        try {
            _properties.load(new FileInputStream(_filename));
        } catch (IOException ignore) {
        }
    }
    public void set(String key, String value) {
        _properties.setProperty(key, value);
    }
    public String get(String key) {
        return _properties.getProperty(key, null);
    }
    public void update() throws IOException {
        _properties.store(new FileOutputStream(_filename), "");
    }
    public Enumeration keys() {
        return _properties.propertyNames();
    }
}
