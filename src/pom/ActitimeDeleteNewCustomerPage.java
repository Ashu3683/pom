package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeDeleteNewCustomerPage {
	public WebDriver driver;
	@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchcustomerTextfield;
	
	@FindBy(xpath = "(//span[.='uganda'])[1]")
	private WebElement newcustomernameLink;
	
	@FindBy(xpath = "//div[@class='components_button collapseCPPanelButton']")
	private WebElement arrowButton;
	
	@FindBy(xpath = "//div[@title='uganda']/../..//div[@class='editButton']")
	private WebElement newcustomersettingLink;
	
	@FindBy(xpath = "(//div[@class='actions'])[1]")
	private WebElement actionButton;
	
	@FindBy(xpath = "(//div[.='Delete'])[2]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//span[.='Delete permanently']")
	private WebElement deletepermanentlyButton;
	
	public ActitimeDeleteNewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void deletenewcustomernameMethod() throws InterruptedException
	{
		searchcustomerTextfield.sendKeys("uganda");
		newcustomernameLink.click();
		arrowButton.click();
		newcustomersettingLink.click();
		Thread.sleep(3000);
		actionButton.click();
		deleteButton.click();
		deletepermanentlyButton.click();
		Thread.sleep(5000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguements[0].click()", newcustomersettingLink);
//		js.executeScript("arguements[0].click()", actionButton);
//		js.executeScript("arguements[0].click()", deleteButton);
//		js.executeScript("arguements[0].click()", deletepermanentlyButton);
	}
	
	
	

}
