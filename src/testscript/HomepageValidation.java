package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomepageValidation {

	public static WebDriver driver;
	
	@BeforeTest
	
	public static void browserSetup()
	{
		
		//driver = driverEngine.getBrowser("firefox");
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Romee Afroz\\Browsertest\\testscript\\chromedriver.exe");
		
		String appurl = "http://forum.digitalpoint.tech/";
		
		//String appurl1 ="http://forum.digitalpoint.tech/index.php/home/userregistration";
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	
				
		driver.get(appurl);
		
			}
	@Test
	
	public static void homepageValidation()
	
	{
		String eResult ="Digital Point Forum";
		String aResult= driver.getTitle();
		Assert.assertEquals(aResult, eResult);
	
	}
	
	@AfterTest 
	
	public static void teardown()
	
	{
		driver.quit();
	}
}

