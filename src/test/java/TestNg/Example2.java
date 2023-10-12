package TestNg;


	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.AfterSuite;

	public class Example2  {
		@Test(dataProvider = "dp")
		public void f(Integer n, String s) {

			System.out.println("This is my Main Test"+n+" "+s);
		}

		@BeforeMethod
		public void beforeMethod() {
			System.out.println("This is my Before method");
		}

		@AfterMethod
		public void afterMethod() {
			System.out.println("This is my After method");
		}

		@DataProvider
		public Object[][] dp() {
			return new Object[][] { new Object[] { 1, "Anil" }, new Object[] { 2, "Kumar" }, };
		}

		@BeforeClass
		public void beforeClass() {
			System.out.println("This is my Before Class");
		}

		@AfterClass
		public void afterClass() {
			System.out.println("This is my After Class");
		}

		@BeforeTest
		public void beforeTest() {
			System.out.println("This is my Before Test");
		}

		@AfterTest
		public void afterTest() {

			System.out.println("This is my After Test");
		}

		@BeforeSuite
		public void beforeSuite() {

			System.out.println("This is my Before Suite");
		}

		@AfterSuite
		public void afterSuite() {

			System.out.println("This is my After Suite");
		}

	}

