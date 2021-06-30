package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTasksPage {
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewLink;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement createnewcustomerLink;
	
	public ActitimeTasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void newcustomer()
	{
		addnewLink.click();
		createnewcustomerLink.click();
		
	}

}
