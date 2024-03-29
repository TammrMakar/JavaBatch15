package Class31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        //Location or path of the file from which we want to read tha data
        String path="Files/config.properties";
        //A class that helps is nevigate to that folder where file is stored
        //if you face ab issues have you move mouse adn click on add exception to method signature
        FileInputStream fileInputStream=new FileInputStream(path);

        /*this "Properties" class will assist us to read adn write data to .properties files*/

        Properties properties=new Properties();
        //Loads all the data from file inside the above object "properties"
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));

        fileInputStream.close();
    }
}
