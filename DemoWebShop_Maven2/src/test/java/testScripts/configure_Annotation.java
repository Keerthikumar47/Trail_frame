package testScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class configure_Annotation {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Establish connection to server");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Establish connection to Data Base");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launching the browser");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Login");
	}
	
	@Test
	public void testCase01() {
		System.out.println("Test case one pass");
	}
	@Test
	public void testCase2() {
		System.out.println("Test case two pass");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Log Out");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Close the Browser");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Disconnect DB");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Disconnect from server");
	}
	
	
}
