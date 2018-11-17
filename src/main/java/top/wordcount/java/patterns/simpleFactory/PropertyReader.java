package top.wordcount.java.patterns.simpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * 新增配置文件读取类，将读出来的内容存储到一个map中
 */
public class PropertyReader {
    public static Map<String, String> map = new HashMap<>();

    public Map<String, String> readPropertyFile(String fileName) {
        Properties pro = new Properties();
        InputStream in = getClass().getResourceAsStream(fileName);
        try {
            pro.load(in);
            Iterator<String> iterator = pro.stringPropertyNames().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                String value = pro.getProperty(key);
                map.put(key, value);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}
