package Class32;

import Utils.ConfigReader;

import java.util.Properties;
import java.io.IOException;

public class ConfigReaderDemo {
    public static void main(String[] args) throws IOException {


        Properties properties= ConfigReader.read();
        System.out.println(properties.getProperty("user"));
    }
}
