package data_Sources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyReader {
	static String result = "";
	static InputStream inputStream;
	
	public static void main(String[] args) throws IOException{
		/*String url = getPropValues("C:/OLDLaptop/Selenium/Jan2021API/DataSource/TestData/config.properties", 
				"password");
		System.out.println(url);
		
		url = getPropertyValue("C:/OLDLaptop/Selenium/Jan2021API/DataSource/TestData/config.properties", 
			"url");
		System.out.println(url);*/
	}
	public static String getPropValues(String File, String keyToSearch) throws IOException {
 
		try {
			Properties prop = new Properties();
			inputStream = new FileInputStream(File);
			
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + File + "' not found in the classpath");
			}
			
			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				if(key.equals(keyToSearch)){
					result = prop.getProperty(key);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
	
	public static String getPropertyValue (String File, String key) throws IOException{
		Properties prop = new Properties();
		inputStream = new FileInputStream(File);
		prop.load(inputStream);
		return prop.getProperty(key);
	}
}