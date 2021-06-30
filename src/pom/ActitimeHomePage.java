package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage 
{

	
	@FindBy(xpath = "(//div[.='Switch to actiPLANS'])[1]")
	private WebElement switchtoactitimeLink;

	@FindBy(xpath = "//div[.='Time-Track']")
	private WebElement timetrackLink;
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasksLink;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportsLinks;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement usersLink;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[1]")
	private WebElement menuicon1Link;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settingLink;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[3]")
	private WebElement menuicon3Link;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[4]")
	private WebElement menuicon4Link;
	

	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logoutLink;
	


	
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void settingMethod()
	{
		settingLink.click();
	}
	public void task()
	{
		tasksLink.click();
	}
	
	
	public void logoutMethod()
	{
		logoutLink.click();
		
	}
	
}
