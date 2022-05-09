package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoiceInformation {
	
	@FindBy(css="span.lvtHeaderText")
	private WebElement invoiceSuccessMsg;
	
	public InvoiceInformation(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}

	public WebElement getInvoiceSuccessMsg() {
		return invoiceSuccessMsg;
	}
}

