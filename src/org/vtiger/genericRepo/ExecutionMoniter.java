package org.vtiger.genericRepo;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExecutionMoniter implements ITestListener {
	public void onTestFailure(ITestResult res) {
		String TestName=res.getName();
		String date=Calendar.getInstance().getTime().toString().replace(":" , "_");
		TakesScreenshot ts=(TakesScreenshot)BaseClass.moniterDriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./FailedScreenshot/"+TestName+date+".png"));
		}catch(IOException e){
	}
  } 
}   