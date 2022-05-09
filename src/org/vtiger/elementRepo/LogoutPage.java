package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	@FindBy(xpath="//span[text()=' Administrator']/../following-sibling::td[1]/img")
	private WebElement administator;
	
	@FindBy(linkText="Sign Out")
	private WebElement signout;
	
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	public WebElement getAdministator() {
		return administator;
	}
	public WebElement getSignOut() {
		return signout;
	}

}
