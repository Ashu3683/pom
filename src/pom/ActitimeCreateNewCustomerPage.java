package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateNewCustomerPage {
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement newcustomerTextfield;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerdescriptionTextfield;
	
	@FindBy(xpath = "(//div[.='- Select Customer -'])[1]")
	private WebElement selectcustomerLink;
	
	@FindBy(xpath = "(//div[.='Jaanu'])[2]")
	private WebElement jannuLink;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomerLink;
	
	
	
	public ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createnewcustomerMethod()
	{
		
		newcustomerTextfield.sendKeys("uganda");
		customerdescriptionTextfield.sendKeys("kicchi nahi");
		createcustomerLink.click();
	}

}
