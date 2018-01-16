package scripts;

import org.testng.annotations.Test;

import lib.BaseTest;
import pom.Homepage;
import pom.MensFashion;

public class Test1 extends BaseTest  {
	
	@Test
	
	 public void test1() throws InterruptedException
	{
		
		Homepage h=new Homepage(driver);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		h.clickSignIn();
		Thread.sleep(2000);
		h.enterEmail();
		Thread.sleep(2000);
		h.clickContinue();
		Thread.sleep(9000);
		h.enterPassword();
		Thread.sleep(40000);
		h.clickLogin();
		Thread.sleep(5000);
		h.mensLogic(driver);
		Thread.sleep(4000);
		
		MensFashion m=new MensFashion(driver);
		m.clickHighToLow();
		Thread.sleep(5000);
		m.listOfKurta();
	}
	
	
	@Test(enabled=false)
	public void maximumDiscount(String browser) throws InterruptedException
	{
		
		
		Homepage h=new Homepage(driver);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		h.clickSignIn();
		Thread.sleep(4000);
		h.enterEmail();
		Thread.sleep(4000);
		h.clickContinue();
		Thread.sleep(4000);
		h.enterPassword();
		Thread.sleep(40000);
		h.clickLogin();
		Thread.sleep(4000);
		h.mensLogic(driver);
		Thread.sleep(4000);
		
		MensFashion m=new MensFashion(driver);
		
		Thread.sleep(3000);
		m.maximumDiscount();
		
		
		
	}

}
