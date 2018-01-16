package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopUp {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		
		FirefoxProfile profile=new FirefoxProfile();
		String key="browser.helperApp.neverAsk.saveToDisk";
		
		String value="application/zip";
		profile.setPreference(key, value);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=2.35/");
		String xpath="//a[contains(.,'win32.zip')]";
		driver.findElement(By.xpath(xpath)).click();
		
		
		
				
	
	}

}
