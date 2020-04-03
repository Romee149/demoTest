package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
public static WebDriver driver;
	
	@BeforeMethod
	public static void broserSetup()
	
	{
	    // launching chrome browser 
		//driver = browserSetup.getBrowser("chrome");
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Romee Afroz\\Browsertest\\testscript\\chromedriver.exe");
		// loading application under Test 
		driver.get("http://forum.digitalpoint.tech/user/index.php/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
	}
	
	
	@Test
	
	public static void userLogin()
	
	{
		driver.findElement(By.name("email")).sendKeys("rafik@digitalpoint.tech");
		driver.findElement(By.name("password")).sendKeys("abcde12345");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
		//logCollection.debug("Login is completed successfully");
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/ul/li[4]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='navbar-right']/li/a")).click();
        //driver.findElement(By.xpath("//*[@id='navbar-right']/li/ul/li/a")).click();
        //logCollection.debug("Logout is completed successfully");
		
		
		
	}


@AfterMethod

public static void teardown()

{
	driver.close();
	
}


}
