package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContacts {
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement save;
	
	public CreateNewContacts(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
        public WebElement getLastname() {
			
			return lastname;
		}

		public WebElement getSave() {
			return save;
		}
				

}
