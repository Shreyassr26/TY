package lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void openbrowser()
	{
		driver =new ChromeDriver();
				
		
		driver.get("https://www.craftsvilla.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@AfterMethod(alwaysRun=true)
	public void closeApplication()
	{
		driver.close();
	}
	
}
