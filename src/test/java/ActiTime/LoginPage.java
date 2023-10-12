package ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
		
	
WebDriver	driver=WebDriverManager.edgedriver().create();
driver.manage().window().maximize();
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/user/submit_tt.do");
String url=driver.getCurrentUrl();
String title=driver.getTitle();
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manage");


driver.findElement(By.xpath("//div[text()='Login ']")).click();

System.out.println("Logged IN successfully");
driver.findElement(By.xpath("//label[text()='Keep me logged in']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
driver.findElement(By.xpath("//input[@placeholder='Your Email or Username']")).sendKeys("admin");
Thread.sleep(5000);
driver.findElement(By.xpath("//div[text()='Request Login Info']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//a[text()='Return to login page']")).click();
Thread.sleep(5000);
System.out.println("login page returned successfully");
//driver.findElement(By.xpath("//a[text()='Logout']")).click();
//System.out.println("Logout successfully");
}
}