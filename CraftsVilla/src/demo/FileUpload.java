package demo;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import lib.BaseTest;

public class FileUpload extends BaseTest{
	
	//String URL = "https://encodable.com/uploaddemo/";
	@Test
	public void testUpload() throws InterruptedException
	{
		
		driver.findElement(By.name("uploadname1")).click();
		
		WebElement element = driver.findElement(By.xpath("//select[@class='upform_field picksubdir_field']"));
		
		Select select=new Select(element);
		select.selectByIndex(0);
		element.click();
		uploadFile("Downloads/TestPlan.doc");
		Thread.sleep(2000);
	}
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	public static void uploadFile(String fileLocation) {
        try {
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } 
        catch (Exception exp) {
        	exp.printStackTrace();
        }
	}
}
