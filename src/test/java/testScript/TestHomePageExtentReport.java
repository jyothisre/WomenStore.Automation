package testScript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import womenBaseScript.DriverScript;
import womenPages.HomePage;
import womenPages.TShartPage;
import womenPages.TopsPage;

public class TestHomePageExtentReport extends TestBase
{
        public TestHomePageExtentReport()
	      {
	    	  super();
	      }
	   @Test
 	public void testHome()
 	{
    	 //reports = new ExtentReports("./WomenReport/WomensReports.html",true);
 		
 			 testlog=reports.startTest("testHome");
 			 
 			String title = hp1.HomepageTitle();
 			Assert.assertEquals(title, "My Store");
 			testlog.log(LogStatus.PASS, "Home PageTitle");
 			
 			boolean logoflag = hp1.verifylogo1();
 			Assert.assertTrue(logoflag);
 			testlog.log(LogStatus.PASS, "verify Logo");
 			
 			boolean womenTab = hp1.verifywomenTab();
 			Assert.assertTrue(womenTab);
 			testlog.log(LogStatus.PASS, "verify women Tab");
 			
 			boolean Dress = hp1.verifyDresses();
 			Assert.assertTrue(Dress);
 			testlog.log(LogStatus.PASS, "verify womenDress");
 			
			boolean Linkts = hp1.verifyLikTShirt();
 			Assert.assertTrue(Linkts);
 			testlog.log(LogStatus.PASS, "verify llink");
 			
 			//boolean our = hp1.verifyOurStores();
 			//Assert.assertTrue(our);
 			//testlog.log(LogStatus.PASS, "Home PageOurStore");
 			
 			boolean button = hp1.verifysearchButton();
 			Assert.assertTrue(button);
 			testlog.log(LogStatus.PASS, "Home PageSearch");
 			
 			//boolean special = hp1.verifySpecialOffers();
 			//Assert.assertTrue(special);
 			//testlog.log(LogStatus.PASS, "Home PageSpecialOffers");
 			
 			
 			boolean popularr = hp1.verifypopular();
 			Assert.assertTrue(popularr );
 			testlog.log(LogStatus.PASS, "Home Pagepopularr");
 			
 			
 			
 			
 			
 		
 	}
  
   
  }


