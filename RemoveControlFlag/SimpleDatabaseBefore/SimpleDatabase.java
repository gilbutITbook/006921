import java.io.*;
import java.util.*;

public class SimpleDatabase {
    private Map<String,String> _map = new HashMap<String,String>();
    public SimpleDatabase(Reader r1) throws IOException {
        BufferedReader r2 = new BufferedReader(r1);
        boolean flag = false;
        String tmp;
        while (!flag) {
            tmp = r2.readLine();
            if (tmp == null) {
                flag = true;
            } else {
                boolean flag2 = true;
                StringBuffer s1 = new StringBuffer();
                StringBuffer s2 = new StringBuffer();
                for (int i = 0; i < tmp.length(); i++) {
                    char tmp2 = tmp.charAt(i);
                    if (flag2) {
                        if (tmp2 == '=') {
                            flag2 = false;
                        } else {
                            s1.append(tmp2);
                        }
                    } else {
                        s2.append(tmp2);
                    }
                }
                String ss1 = s1.toString();
                String ss2 = s2.toString();
                _map.put(ss1, ss2);
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
