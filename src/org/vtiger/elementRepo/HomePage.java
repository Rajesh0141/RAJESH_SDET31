package org.vtiger.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText="Leads")
	private WebElement leads;
	
	@FindBy(linkText="Contacts")
	private WebElement contacts;
	
	@FindBy(linkText="Organizations")
	private WebElement organizations;
	
	@FindBy(linkText="Email")
	private WebElement email;
	
	@FindBy(linkText="Opportunities")
	private WebElement opportunities;
	
	@FindBy(linkText="Products")
	private WebElement products;
	
	@FindBy(linkText="More")
	private WebElement more;
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver , this);
	}
	
	public WebElement getContacts() {
		return contacts;
	}
	public WebElement getLeads() {
		return leads;
	}
	public WebElement getOrganizations() {
		return organizations;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getOpportunities() {
		return opportunities;
	}
	public WebElement getProducts() {
		return products;
	}
	public WebElement getMore() {
		return more;
	}

}
