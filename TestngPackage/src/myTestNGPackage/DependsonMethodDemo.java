package myTestNGPackage;

import org.testng.annotations.Test;

public class DependsonMethodDemo {
	@Test
	public void startapp() {
		System.out.println("Start Application");
	}
	
	@Test(dependsOnMethods="startapp")
	public void login() {
		System.out.println("Login into Application");
	}
	
	@Test(dependsOnMethods="login")
	public void logoff() {
		System.out.println("Logout of Application");
	}


}
