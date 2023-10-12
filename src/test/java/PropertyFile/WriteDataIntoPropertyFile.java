package PropertyFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertyFile {
	public static void main(String[] args) throws Exception  {
		
		//Create the object
		Properties p=new Properties();
		
		//step2:Provide the keys and values details
		p.setProperty("browser","edge");
		p.setProperty("username","admin");
		
		//step3 path for property file
		
		FileOutputStream fos =new FileOutputStream(".\\src\\test\\resources\\CommonDataWrite.properties");
	
	  
		//step4 load the property file
				p.store(fos, "This is my common data file");
	
	}
	
	

}
