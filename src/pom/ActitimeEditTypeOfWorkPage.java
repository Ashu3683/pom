package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeEditTypeOfWorkPage {
	@FindBy(xpath = "//a[.='sleeping']")
	private WebElement sleepingLink;
	
	@FindBy(xpath = "//input[@id='billingRate_input']") 
	private WebElement billingrateTextfield;
	
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement savechangesButton;
	
	public  ActitimeEditTypeOfWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void edittypeofworkMethod() throws AWTException
	{
		sleepingLink.click();
		billingrateTextfield.click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		billingrateTextfield.click();
		billingrateTextfield.sendKeys("999");
		savechangesButton.click();
		
	}

}
