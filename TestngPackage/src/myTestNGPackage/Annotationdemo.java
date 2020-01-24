package myTestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationdemo {

	@BeforeSuite
	public void setproperty() {
		System.out.println("Set the driver path");
	}
		

	@BeforeTest
	public void openchrome() {
		System.out.println("Open Chrome");
	}
		
	@BeforeClass
	public void openapp() {
		System.out.println("Application");
	}
		
	@BeforeMethod
	public void gettitle() {
		System.out.println("Display Title");
	}
		
	@Test
	public void checktitle() {
		System.out.println("Check Title");
	}
		
	@AfterMethod
	public void login() {
		System.out.println("Login to Test");
	}
		
	@AfterClass
	public void logout() {
		System.out.println("Logout of Test");
	}
		
	@AfterTest
	public void closebrowser() {
		System.out.println("Close Browser");
	}
}
