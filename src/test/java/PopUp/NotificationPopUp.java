package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriverManager.chromedriver().setup();
		WebDriver	driver=new ChromeDriver(options);
		*/
		
		//EdgeOptions options =new EdgeOptions();
		//options.addArguments("--disable-notification");
		
		WebDriverManager.edgedriver().setup();
		WebDriver	driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");
		
		
}
}

