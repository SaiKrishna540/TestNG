package listenersDemoSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyGooglePageTest {

	WebDriver driver;
	@BeforeMethod
	public void startapp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Start Application");
	}
	
	@Test
	public void checktitle() {
		String expectedtitle = "Google";
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(expectedtitle, actualtitle);
		System.out.println("Title Checked");
	}
	
	@Test()
	public void checklogo() {
		boolean logo = driver.findElement(By.id("hplogo")).isDisplayed();
		
		Assert.assertTrue(logo);
		System.out.println("Logo Checked");
	}
	
	@AfterMethod
	public void closebrowser() {
		System.out.println("Browser Closed");
		driver.close();
	}
}
