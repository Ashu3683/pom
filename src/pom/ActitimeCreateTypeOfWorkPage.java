package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateTypeOfWorkPage 
{
	@FindBy(xpath = "//input[@name='name']")
	private WebElement newworknameTextfield;
	
	@FindBy(xpath = "(//input[@name='billable'])[1]")
	private WebElement billableRadiobutton;
	
	@FindBy(xpath = "//input[@id='billingRate_input']")
	private WebElement billrateTextfield;
	
	@FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;
	
	
	public ActitimeCreateTypeOfWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createtypeofworkMethod()
	{
		newworknameTextfield.sendKeys("sleeping");
		billableRadiobutton.click();
		billrateTextfield.sendKeys("1000");
		submitButton.click();
		
	}
	

}
