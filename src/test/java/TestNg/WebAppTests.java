package TestNg;

import org.testng.annotations.Test;

public class WebAppTests {
	//WebDriver driver;
	public void setUp() {
		//System.setProperty();
		//driver=new chromeDriver();
		
	}
		@Test(groups= {"login"})
		public void testValidLogin() {
			System.out.println("TestValidLogin");
		}
		
		@Test(groups= {"registration"})
		public void testSuccessfulRegistration() {
			System.out.println("TestValidtestSuccessfulRegistration");
		}
		
		@Test(groups= {"registration"})
		public void testDuplicateRegistration() {
			System.out.println("TestDuplicateRegistration");
		}
		
	//	@AfterClass
	//	public void tearDown() {
	//		driver.quit();
		}
		
	


