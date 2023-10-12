package TestNg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	@Parameters({"url"})
	@Test
   
	public void GoogleTest(String url) {
		
			WebDriver driver = WebDriverManager.edgedriver().create();

			driver.manage().window().maximize();

			driver.get(url);
}
}
