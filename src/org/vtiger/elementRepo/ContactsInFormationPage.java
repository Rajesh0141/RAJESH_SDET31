package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInFormationPage {
	
	@FindBy(css="span.dvHeaderText")
	private WebElement contactSuccessMsg;
	
	public ContactsInFormationPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}

	public WebElement getContactSuccessMsg() {
		return contactSuccessMsg;
	}
}
