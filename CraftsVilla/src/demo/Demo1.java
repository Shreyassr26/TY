package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.craftsvilla.com");
	}
}
