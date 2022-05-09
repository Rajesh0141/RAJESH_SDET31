package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsHomePage {

	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement createNewContacts;
	
	public ContactsHomePage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	public WebElement getcreateNewContacts() {
		return createNewContacts;
	}
}
