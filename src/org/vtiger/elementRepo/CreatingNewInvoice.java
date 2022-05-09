package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewInvoice {
	
	@FindBy(name="subject")
	private WebElement subject;
	
	@FindBy(xpath="//input[@id='single_accountid']/following-sibling::img")
	private WebElement organizationName;
	
	@FindBy(id="searchIcon1")
	private WebElement itemName;

	@FindBy(id="qty1")
	private WebElement qty;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement save;
	
	public CreatingNewInvoice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSubject() {
		return subject;
	}
	public WebElement getOrganizationName() {
		return organizationName;
	} 
	public WebElement getItemName() {
		return itemName;
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getSave() {
		return save;
	}

	
}
