package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeDeleteTypeOfWorkPage
{
	public WebDriver driver ;
	
	@FindBy(xpath = "//a[.='sleeping']")
	private WebElement sleepingLink;
	
	@FindBy(xpath = "//input[@value='Delete This Type of Work']")
	private WebElement deletetypeofworkButton ;
	  
	
	public ActitimeDeleteTypeOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void deletetypeofworkMethod() throws InterruptedException
	{
		sleepingLink.click();
		deletetypeofworkButton.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
	}
	
	

}
