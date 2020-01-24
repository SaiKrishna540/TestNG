package myTestNGPackage;

import org.testng.annotations.Test;

public class Prioritydemo {

	@Test
	public void startapp() {
		System.out.println("Start Application");
	}
	
	@Test(priority=1)
	public void login() {
		System.out.println("Login into Application");
	}
	
	@Test(priority=1)
	public void logoff() {
		System.out.println("Logout of Application");
	}
}
