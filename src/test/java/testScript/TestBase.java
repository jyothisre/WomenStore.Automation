package testScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import womenBaseScript.DriverScript;
import womenPages.HomePage;
import womenPages.TShartPage;
import womenPages.TopsPage;

public class TestBase extends  DriverScript {
	 HomePage hp1;
	 
	 
	 public static ExtentReports reports;
	 public static ExtentTest testlog;
	     
	
	 @BeforeMethod
	 public void PreCondition()
	 {
		reports = new ExtentReports("./WomenReport/WomensReports.html",true);
		 
		 init();
		 hp1 = new HomePage();
		
	 }
	 
	 
	 
	 @AfterMethod
	 public void teardown()
	 {
		 
		 
		 driver.close();
		 reports.endTest(testlog);
		 reports.flush();
	 }
	 
	 }
	 


