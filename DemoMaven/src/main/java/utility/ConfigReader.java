package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
		 public static Properties initProperties() {
		        Properties prop = new Properties();
		        try {
		            FileInputStream ip = new FileInputStream("src/test/resources/resource/data.properties");
		            prop.load(ip);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        return prop;
		    }
		}



