package ActiTime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageWithDDT {
	public static void main(String[] args) throws IOException {


		//	Step1 :Read data from property file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");

		//Step 2:Create the object of the property file

		Properties p=new Properties();

		//Step 3:Load the file into object of properties
		p.load(fis);

		//Step4:Get the values of the property file based on key
		String BROWSER	=p.getProperty("browser");
		String URL	=p.getProperty("url");
		String USERNAME	=p.getProperty("username");
		String PASSWORD	=p.getProperty("password");


		WebDriver driver=null;
		if(BROWSER.equalsIgnoreCase("edge")) {
			driver=WebDriverManager.edgedriver().create();
			System.out.println("Edge browser is launched");
		}
		else {
			System.out.println("inavid launched");
		}



		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/user/submit_tt.do");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("Logged IN successfully");
		//driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("Logout successfully");
	}
}
