package testscript;


//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class browserTest {

	public static WebDriver driver;
@Test

	public static void luanchWeb()
	{
			
	//public static WebDriver driver;
	
	{
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Romee Afroz\\Browsertest\\testscript\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Romee Afroz\\Browsertest\\testscript\\chromedriver.exe");
	//driver=new FirefoxDriver();
	driver=new ChromeDriver();
	//System.out.println("Launching firefox browser");
	System.out.println("Launching Chrome browser");
	driver.get("https://www.amazon.com");
	}
	}}


