package org.vtiger.testscript;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.vtiger.elementRepo.CreatingNewInvoice;
import org.vtiger.elementRepo.HomePage;
import org.vtiger.elementRepo.InvoiceHomePage;
import org.vtiger.elementRepo.InvoiceInformation;
import org.vtiger.elementRepo.ItemHomePage;
import org.vtiger.elementRepo.MorePage;
import org.vtiger.elementRepo.OrganizationHomePage;
import org.vtiger.genericRepo.BaseClass;

@Listeners(org.vtiger.genericRepo.ExecutionMoniter.class)
public class CreateInvoice extends BaseClass {
	@Test
	public void CreateInvoiceInAPP() throws EncryptedDocumentException, IOException {
		
		HomePage hp=new HomePage(driver);
		WebElement more=hp.getMore();
	
		Actions act=new Actions(driver);
		act.moveToElement(more).perform();
		
		MorePage mp=new MorePage(driver);
		mp.getInvoice().click();
		
		InvoiceHomePage ihp=new InvoiceHomePage(driver);
		ihp.getCreateNewInvoice().click();
		
		CreatingNewInvoice cni=new CreatingNewInvoice(driver);
		cni.getSubject().sendKeys(data.accessExcelData("Sheet1", 1, 3));
		cni.getOrganizationName().click();		
		
		String mainId=driver.getWindowHandle();
		Set<String> allId=driver.getWindowHandles();
		for(String id : allId)
		{
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
			}
		}
		OrganizationHomePage ohp=new OrganizationHomePage(driver);
		ohp.getOrganizationName().click();
		driver.switchTo().alert().accept();
		driver.switchTo().window(mainId);
		cni.getItemName().click();
		allId=driver.getWindowHandles();
		for(String id : allId)
		{
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
				
			}
		}
		ItemHomePage ip=new ItemHomePage(driver);
		ip.getSelectedProducts().click();
		driver.switchTo().window(mainId);
		
		cni.getQty().sendKeys(data.accessExcelData("Sheet1", 2, 3));
	
		cni.getSave().click();

		InvoiceInformation iinfo=new InvoiceInformation(driver);
		
		String invoiceMsg=iinfo.getInvoiceSuccessMsg().getText();
		
		if(invoiceMsg.contains(data.accessExcelData("Sheet1", 3, 3)))
		{
			System.out.println("Invoice Created Succesfully");
		}else
		{
			System.out.println("Invoice Creation Failed ");
		}

		
	}

}
