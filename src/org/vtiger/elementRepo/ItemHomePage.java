package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemHomePage {
	
	@FindBy(xpath="//table[@class='small' and @style]/tbody/tr[2]/td[2]/a")
	private WebElement selectedProducts;

	public ItemHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSelectedProducts() {
		return selectedProducts;
	}
	
	
}
