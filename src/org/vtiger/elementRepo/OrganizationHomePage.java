package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationHomePage {
	

	@FindBy(xpath="//table[@class='small' and @style]/tbody/tr[4]/td[1]/a")
	private WebElement organizationName;
	
	public OrganizationHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOrganizationName() {
		return organizationName;
	}

}
