package pom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MensFashion {
	
	@FindBy(xpath="//span[@class='product-offer-price']")
	private List<WebElement> listCraftsVilla;
	
	@FindBy(xpath="//span[@class='product-off']")
	private List<WebElement> offerList;

	@FindBy(id="discountedPriceOrder_DESC")
	private WebElement HighToLow;
	
	public MensFashion(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void listOfKurta()
	{
		TreeSet<String> sort = new TreeSet<String>();
		
		
		for(int i=0;i<listCraftsVilla.size();i++)
		{
			WebElement element = listCraftsVilla.get(i);
			String text = element.getText();
			sort.add(text);
		}	
		
		ArrayList<String> firstSort = new ArrayList<String>(sort);
		
		
//		Reporter.log("Sorting",true);
//		for (String string : sort) {
//			
//			Reporter.log(string,true);			 
//		}
		Reporter.log("Less price of the product list is ",true);
		
		Reporter.log(firstSort.get(0),true);
	}
	
	public void maximumDiscount()
	{
	
		ArrayList<String> max = new ArrayList<String>();
		for(int i=0;i<offerList.size();i++)
		{
			WebElement element = offerList.get(i);
			String text = element.getText();
			max.add(text);
		}
		Collections.sort(max);
		Reporter.log(max.get(0)+" is the maximum discount you get in Craftsvilla",true);
	}
	
	public void clickHighToLow()
	{
		HighToLow.click();
	}
}
