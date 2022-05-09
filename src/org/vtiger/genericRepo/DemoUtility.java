package org.vtiger.genericRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoUtility {
	
	public String accessPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream(AutomationUtilities.PROPERTYPATH);
		Properties poj=new Properties();
		poj.load(fis);
		return poj.getProperty(key);
	}
    
		public String accessExcelData(String sheetname , int rownum,int celnum) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream(AutomationUtilities.EXCELPATH);
			Workbook book=WorkbookFactory.create(fis);
			DataFormatter format=new DataFormatter();
			return format.formatCellValue(book.getSheet(sheetname).getRow(rownum).getCell(celnum));
	
			
		}
		
	}

