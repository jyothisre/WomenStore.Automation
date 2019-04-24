package testScript;

import javax.naming.ldap.ExtendedResponse;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import womenBaseScript.DriverScript;
import womenPages.HomePage;
import womenPages.TShartPage;
import womenPages.TopsPage;

public class TestWomenHomePage  extends DriverScript{
	 
	 HomePage hp1;
	 TopsPage TP;
     TShartPage TSP;
     
     public static ExtentReports reports;
     public static ExtentTest testlog;
     

	
	
 public TestWomenHomePage()
 {
	 super();
 }
 
 @BeforeMethod
 public void PreCondition()
 {
	 init();
	 hp1 = new HomePage();
	 TP = new  TopsPage();
	 TSP = new TShartPage();
 }
 
 @Test
	public void testHome()
	{
	 reports = new ExtentReports(".\\WomenStore.Automation\\WomenReport",true);
		
			 testlog=reports.startTest("testHome");
		
		 hp1.ClickSingIn();
		 hp1.womenTab();
		 TP.ClickOnTops();
		 TSP.ClickTShart();
		 hp1.HomepageTitle();
		 hp1.ActionOnDresses();
		 
		 boolean flag = hp1.verifylogo1();
			System.out.println(flag);
	}
 @AfterMethod
 public void teardown()
 {
	 driver.close();
 }
 }
