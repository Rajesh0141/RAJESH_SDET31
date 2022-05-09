package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoiceHomePage {
	
	@FindBy(xpath="//img[@alt='Create Invoice...']")
	private WebElement createnewInvoice;

	public InvoiceHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewInvoice() {
		return createnewInvoice;
	}
}
