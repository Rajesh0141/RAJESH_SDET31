package org.vtiger.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.vtiger.elementRepo.ContactsHomePage;
import org.vtiger.elementRepo.ContactsInFormationPage;
import org.vtiger.elementRepo.CreateNewContacts;
import org.vtiger.elementRepo.HomePage;
import org.vtiger.genericRepo.BaseClass;

@Listeners(org.vtiger.genericRepo.ExecutionMoniter.class)
public class CreateContact extends BaseClass {
	@Test
	public void CreateContactInApp() throws EncryptedDocumentException, IOException {
		
		HomePage hp=new HomePage(driver);
		hp.getContacts().click();

		ContactsHomePage chp=new ContactsHomePage(driver);
		chp.getcreateNewContacts().click();
		
		CreateNewContacts cnc=new CreateNewContacts(driver);
		cnc.getLastname().sendKeys(data.accessExcelData("Contact", 1, 3));
		
		cnc.getSave().click();
		ContactsInFormationPage cif=new ContactsInFormationPage(driver);
		String actMsg=cif.getContactSuccessMsg().getText();
		String expMsg="Contact Information";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actMsg, expMsg);
		sf.assertAll();
		
	}

}
