package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.MensFashion;

public class ParallelTests {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	@Parameters({"browser"})
	@Test
	public void runMultiple(String browser) throws InterruptedException
	{
		WebDriver driver;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.craftsvilla.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Homepage h=new Homepage(driver);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		h.clickSignIn();
		Thread.sleep(2000);
		h.enterEmail();
		Thread.sleep(2000);
		h.clickContinue();
		Thread.sleep(4000);
		h.enterPassword();
		Thread.sleep(40000);
		h.clickLogin();
		Thread.sleep(5000);
		h.mensLogic(driver);
		Thread.sleep(4000);
		
		MensFashion m=new MensFashion(driver);
		Thread.sleep(5000);
		m.listOfKurta();
		
	}

}
