package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeEditLeaveTypePage {
	public WebDriver driver;
	@FindBy(xpath = "//span[.='pudina']")
	private WebElement leavetypenameLink;
	
	@FindBy(xpath = "//input[@id='inputDiv']")
	private WebElement editnameTextfield;
	
	@FindBy(xpath = "(//div[@class='applyButton'])[2]")
	private WebElement applyButton;
	
	
	public ActitimeEditLeaveTypePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void editleavetypeMethod() throws AWTException
	{
		leavetypenameLink.click();
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		
		editnameTextfield.click();
		editnameTextfield.sendKeys("bacardi");
		
		applyButton.click();
		
	}

}
