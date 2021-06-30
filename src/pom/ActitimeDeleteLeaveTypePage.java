package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeDeleteLeaveTypePage {
	public WebDriver driver; 
	
	@FindBy(xpath = "(//span[.='bacardi'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement deleteleavetypeButtom;
	
	public ActitimeDeleteLeaveTypePage(WebDriver driver)
	{   
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void deleteleavetypeMethod() throws InterruptedException
	{
		deleteleavetypeButtom.click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		
		
	}

}
