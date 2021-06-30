package test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ActitimeCreateLeaveTypePage;
import pom.ActitimeCreateNewCustomerPage;
import pom.ActitimeCreateTypeOfWorkPage;
import pom.ActitimeDeleteLeaveTypePage;
import pom.ActitimeDeleteNewCustomerPage;
import pom.ActitimeDeleteTypeOfWorkPage;
import pom.ActitimeEditLeaveTypePage;
import pom.ActitimeEditTypeOfWorkPage;
import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.ActitimeSettingPage;
import pom.ActitimeTasksPage;

public class TestActitime {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		{
			System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com");
			
			ActitimeLoginPage login=new ActitimeLoginPage(driver);
			login.loginMethod();
			
//			//create customer
//			
////			
//			ActitimeHomePage home=new ActitimeHomePage(driver);
//			home.task();
//			ActitimeTasksPage task=new ActitimeTasksPage(driver);
//			task.newcustomer();
//			ActitimeCreateNewCustomerPage customer=new ActitimeCreateNewCustomerPage(driver);
//			customer.createnewcustomerMethod();
			
			
			
//			//create type of work
//			
//			ActitimeHomePage home=new ActitimeHomePage(driver);
//			home.settingMethod();
//			 
//			ActitimeSettingPage setting=new ActitimeSettingPage(driver);
//			setting.typeofworkMethod();
//			setting.createtypeofworkMethod();
//			
//			ActitimeCreateTypeOfWorkPage work=new ActitimeCreateTypeOfWorkPage(driver);
//			work.createtypeofworkMethod();
			
//			//create leave type
//			
			ActitimeHomePage home=new ActitimeHomePage(driver);
			home.settingMethod();
			
			ActitimeSettingPage setting=new ActitimeSettingPage(driver);
			setting.leavetypesMethod();
			setting.createleavetypeMethod();
			
			ActitimeCreateLeaveTypePage leave=new ActitimeCreateLeaveTypePage(driver);
			leave.createleavetypeMethod();
		
//			//edit leave type
//			
//			ActitimeHomePage home=new ActitimeHomePage(driver);
//			home.settingMethod();
//			
//			ActitimeSettingPage setting=new ActitimeSettingPage(driver);
//			setting.leavetypesMethod();
//			
//		    ActitimeEditLeaveTypePage editleave=new ActitimeEditLeaveTypePage(driver);
//		    editleave.editleavetypeMethod();
			
//			//edit type of work
//			
//			ActitimeHomePage home=new ActitimeHomePage(driver);
//			home.settingMethod();
//			
//			ActitimeSettingPage setting=new ActitimeSettingPage(driver);
//			setting.typeofworkMethod();
//			
//			ActitimeEditTypeOfWorkPage editwork=new ActitimeEditTypeOfWorkPage(driver);
//			editwork.edittypeofworkMethod();
			
//			//delete customer
			
//			ActitimeHomePage home=new ActitimeHomePage(driver);
//			home.task();
//			
//			ActitimeDeleteNewCustomerPage deletecustomer=new ActitimeDeleteNewCustomerPage(driver);
//			deletecustomer.deletenewcustomernameMethod();
			
//			//delete leave type
//			
//
//			ActitimeHomePage home=new ActitimeHomePage(driver);
//			home.settingMethod();
//			
//			ActitimeSettingPage setting=new ActitimeSettingPage(driver);
//			setting.leavetypesMethod();
//			
//		    ActitimeDeleteLeaveTypePage deleteleave=new ActitimeDeleteLeaveTypePage(driver);
//		    deleteleave.deleteleavetypeMethod();
			
//			//delete type of work
//		    
//		    ActitimeHomePage home=new ActitimeHomePage(driver);
//			home.settingMethod();
//			
//			ActitimeSettingPage setting=new ActitimeSettingPage(driver);
//			setting.typeofworkMethod();
//			
//			ActitimeDeleteTypeOfWorkPage deletework=new ActitimeDeleteTypeOfWorkPage(driver);
//			deletework.deletetypeofworkMethod();
			

			
			
			home.logoutMethod();
			
			
			
			
		}
	
		

	}

}
