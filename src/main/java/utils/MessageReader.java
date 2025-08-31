package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MessageReader {
    private static Properties properties;

    static {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config/message.properties");
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("Config dosyası okunamadı" + e.getMessage());
        }
    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }



}
