package TestNg;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	
	
	@Test
	public void GoogleTest() {
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
	@Test
	public void TestSynechron() {
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 String CurrentURL=driver.getCurrentUrl();
	    String expURL=driver.getCurrentUrl();
	    assertEquals(CurrentURL,expURL,"If url matches");
	   
		driver.findElement(By.id("APjFqb")).sendKeys("https://www.synechron.com/",Keys.ENTER);
		driver.findElement(By.xpath("//*[contains(text(),'Synechron: Technology and AI Consulting for Business')]")).click();
		System.out.println("get title:"+ driver.getTitle());
		driver.quit();
		
	}
	

}

