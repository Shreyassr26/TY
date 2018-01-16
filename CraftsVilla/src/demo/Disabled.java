package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Disabled {
	
	@Test
	public void handleDisbled() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Shreyas/disabled.html");
		Thread.sleep(5000);
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementById('t2').value='Jspiders'");
		Thread.sleep(3000);
		driver.close();
	}

}
