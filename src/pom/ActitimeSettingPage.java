package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeSettingPage {
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement typeofworkLink;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement createtypeofworkLink;
	
	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement leavetypesLink;
	
	@FindBy(xpath = "//div[@id='ext-gen7']")
	private WebElement createleavetypeLink;
	
	
	public ActitimeSettingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void typeofworkMethod()
	{
		typeofworkLink.click();
		
	}
	public void createtypeofworkMethod()
	{
		createtypeofworkLink.click();
	}
	
	public void leavetypesMethod()
	{
		leavetypesLink.click();
		
	}
	public void createleavetypeMethod()
	{
		createleavetypeLink.click();
	}
	

}
