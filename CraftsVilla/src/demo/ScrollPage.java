package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollPage {
	
	
	@Test
	public void scrollPage()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/download");
		int x = driver.findElement(By.xpath("//h3[.='Selenium IDE Plugins']")).getLocation().getX();
		int y = driver.findElement(By.xpath("//h3[.='Selenium IDE Plugins']")).getLocation().getY();
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
	}

}
