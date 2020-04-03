package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration {
public static WebDriver driver;
	
	@BeforeMethod
	public static void broserSetup()
	
	{
	    // launching chrome browser 
		//driver = driverEngine.getBrowser("chrome");
		driver= new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Romee Afroz\\Browsertest\\testscript\\chromedriver.exe");
		
		// loading application under Test 
		driver.get("http://forum.digitalpoint.tech/index.php/home/userregistration");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
	}
	
	
	
	
	@Test
	
	public static void newuserRegistration()
	
	{
		new Select (driver.findElement(By.name("language"))).selectByVisibleText("English");
		new Select (driver.findElement(By.name("titles"))).selectByVisibleText("Mr");
		driver.findElement(By.name("fname")).sendKeys("Rafik");
		driver.findElement(By.name("lname")).sendKeys("Ahmed");
		driver.findElement(By.name("email")).sendKeys("rafik@digitalpoint.tech");
		driver.findElement(By.name("phone")).sendKeys("1234567899");
		driver.findElement(By.name("password")).sendKeys("abcde12345");
        driver.findElements(By.name("gender")).get(0).click();
        new Select ( driver.findElement(By.name("course"))).selectByVisibleText("Apache JMeter");
        driver.findElement(By.xpath("//*[@id='home']/div/div[1]/div[6]/input")).click();
        driver.findElement(By.xpath("//*[@id='home']/div/div[2]/input")).click();
        
	}
	
	
	@AfterMethod
	
	public static void teardown()
	
	{
		//driver.close();
		
	}


}
