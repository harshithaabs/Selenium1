package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Get text from confirmation pop up
		Alert a=driver.switchTo().alert();
		a.getText();
		System.out.println(a.getText());
		//Click on ok on confirmation pop up
		a.accept();
		System.out.println("Clicked on ok button on confirmation PopUp");
		
		//click on cancel on confirmation pop up
		//a.dismiss();
		//System.out.println("Clicked on cancel button on confirmation PopUp");
	}
}