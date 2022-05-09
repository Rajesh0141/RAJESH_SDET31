package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MorePage {
	
	@FindBy(xpath="//a[text()='Invoice']")
	private WebElement invoice;
	
	@FindBy(name="Vendors")
	private WebElement vendors;
	
	public MorePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getInvoice() {
		return invoice;
	}
	public WebElement getVendors() {
		return vendors;
	}
}
