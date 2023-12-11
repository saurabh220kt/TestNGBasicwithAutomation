package Tpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoThreeAssertionTutorial {

	// Test cases ran on the basis of alphabetical order by default, but if you set
	// priority then it will follow priority number

	@AfterClass //will be executed after the class execution
	public void closure() {
		System.out.println("Closing the browser");
	}
	
	@BeforeClass //will be executed before the class execution
	public void setup() {
		
		System.out.println("Launching the chrome browser and opening the application url");
	}

//	@AfterMethod //After every test method, AfterMethod will execute
//	public void closure() {
//		System.out.println("Closing the browser");
//	}
//	
//	@BeforeMethod //Before every test method, BeforeMethod will execute
//	public void setup() {
//		
//		System.out.println("Launching the chrome browser and opening the application url");
//	}

	@Test(priority = 0)
	public void testRegisteration() {

		System.out.println("Registeration Test got executed");
	}

	@Test(priority = 1)
	public void loginPage() {

		System.out.println("Login successfully");
	}

	@Test(priority = 2)
	public void HomePage() {

		System.out.println("Home page displayed successfully");
	}
}
