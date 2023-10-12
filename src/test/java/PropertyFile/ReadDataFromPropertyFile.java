package PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		//Step1:Take the property file path
		FileInputStream fis=new 	FileInputStream(".\\src\\test\\resources\\CommonData.properties");

	//Step 2:Create the object of the property file
		
		Properties p=new Properties();
		
		//Step 3:Load the file into object of properties
		p.load(fis);
		
		//Step4:Get the values of the property file based on key
	String BROWSER	=p.getProperty("browser");
	String URL	=p.getProperty("url");
	String USERNAME	=p.getProperty("username");
	String PASSWORD	=p.getProperty("password");
	
	
	System.out.println(BROWSER);
	System.out.println( URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
	}

}
