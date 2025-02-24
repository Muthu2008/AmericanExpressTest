package AmericanExpressTest.TestPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileLipMethods {
	 public Properties properties = new Properties();

	    // Method to load the properties file
	    public void loadProperties(String filePath) throws IOException {
	        FileInputStream fileInputStream = new FileInputStream(filePath);
	        properties.load(fileInputStream);
	        
	        
	    }
	    public String  getProperties(String key)
	    {
	    	return properties.getProperty(key);
	    }
	   

	   	
}
