package ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/user/submit_tt.do");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("Logged IN successfully");

		driver.findElement(By.id("container_tasks")).click();
		System.out.println("Clicked");
		driver.findElement(By.className("ellipsis")).click();
		Thread.sleep(5000);
		System.out.println("Clicked");
		driver.findElement(By.className("createNewCustomer")).click();
		//(//input[@placeholder='Enter Customer Name'])[2]

	}

}
