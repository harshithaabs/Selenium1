package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[text()='text.txt']")).click();
		Thread.sleep(5000);
		System.out.println("File Downloaded");
}
}
