import java.io.*;
import java.util.*;

public class AddressFile {
    private final Database _database;
    public AddressFile(String filename) {
        _database = new Database(filename);
    }
    public Enumeration names() {
        return _database.keys();
    }
    public void set(String key, String value) {
        _database.set(key, value);
    }
    public String get(String key) {
        return _database.get(key);
    }
    public void update() throws IOException {
        _database.update();
    }

    // 중첩 클래스

    private static class Database {
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
}
