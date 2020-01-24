package listenersDemoSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunDemo {

	WebDriver driver;
	
	@Test
	public void startapp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	
		System.out.println("Start Application");
	}

	@Test(dependsOnMethods="startapp")
	public void checktitle() {
		driver.findElement(By.id("Email")).sendKeys("saikrishna12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Sai143");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		String expectedname = "Demo Web Shop";
		String actualname = driver.getTitle();
		
		System.out.println(expectedname);
		System.out.println(actualname);
		
		Assert.assertEquals(expectedname, actualname);
		System.out.println("Login into Application");
	}

	@Test(dependsOnMethods="checktitle", alwaysRun=true)
	public void logoff() {
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.close();
		System.out.println("Logout of Application");
	}
}
