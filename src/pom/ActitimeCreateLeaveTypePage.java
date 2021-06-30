package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateLeaveTypePage {
	@FindBy(xpath = "//input[@id='leaveTypeLightBox_nameField']")
	private WebElement leavetypenameTextfield;
	
	@FindBy(xpath = "//div[@class='greyButton withIcon commitBtn']")
    private WebElement createButton;



public ActitimeCreateLeaveTypePage(WebDriver driver) 
{ 
	PageFactory.initElements(driver,this);
}

public void createleavetypeMethod() throws InterruptedException
{
	leavetypenameTextfield.sendKeys("pudina");
	createButton.click();
	Thread.sleep(2000);
	
}
}