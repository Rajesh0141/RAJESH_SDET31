package org.vtiger.genericRepo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.vtiger.elementRepo.LoginPage;
import org.vtiger.elementRepo.LogoutPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver moniterDriver;
	public DemoUtility data=new DemoUtility();
	
	@BeforeClass(alwaysRun=true)
	public void configBC() throws IOException {
		System.out.println("----------Browser Launch----------");
		System.setProperty(AutomationUtilities.EDGEKEY, AutomationUtilities.EDGEVALUE);
		driver=new EdgeDriver();
		moniterDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(data.accessPropertyData("url"));
	}
	@BeforeMethod(alwaysRun=true)
	public void configBM() throws IOException {
		System.out.println("----------Login to Application-------------");
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys(data.accessPropertyData("username"));
		lp.getPassword().sendKeys(data.accessPropertyData("password"));
		lp.getLoginBtn().click();
	}
	@AfterMethod(alwaysRun=true)
	public void configAM() {
		System.out.println("----------Logout to Application-------------");
        LogoutPage lop=new LogoutPage(driver);
        WebElement user=lop.getAdministator();
		
        Actions act=new Actions(driver);
        act.moveToElement(user);
	    lop.getSignOut().click();
	}
	@AfterClass(alwaysRun=true)
	public void configAC() {
		System.out.println("----------Browser Closed-------------");
		driver.quit();
	}
	public static void MoniterDriver() {
		// TODO Auto-generated method stub
		
	}
}
