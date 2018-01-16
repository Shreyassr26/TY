package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	
	@FindBy(xpath="//span[.='Sign In']")
	private WebElement clickSighIn;
	
	@FindBy(id="emailId")
	private WebElement enterEmail;
	
	@FindBy(xpath="//div[.='CONTINUE']")
	private WebElement clickContinue;
	
	@FindBy(id="userPassword")
	private WebElement enterPassword;
	
	@FindBy(xpath="//div[.='Login']")
	private WebElement clickLogin;
	
	@FindBy(xpath="//a[contains(@href, '/mens-fashion')]")
	private WebElement MensFashion;
	
	@FindBy(xpath="//a[.='Silk Kurta Pyjamas']")
	private WebElement skillKurtapyjama;
	
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSignIn()
	{
		clickSighIn.click();
	}
	
	public void enterEmail()
	{
		enterEmail.sendKeys("shreyassr26@gmail.com");
	}
	public void clickContinue()
	{
		clickContinue.click();
	}
	public void enterPassword()
	{
		enterPassword.sendKeys("9Xvhbo");
	}
	public void clickLogin() throws InterruptedException
	{
		Thread.sleep(7000);
		
		clickLogin.click();
	}
	
	public void mensLogic(WebDriver driver) throws InterruptedException
	{
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(MensFashion).perform();
		Thread.sleep(6000);
		skillKurtapyjama.click();
	}
	
	
	
	

		
	
	

}
