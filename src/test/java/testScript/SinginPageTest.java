package testScript;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import womenBaseScript.DriverScript;
import womenPages.HomePage;
import womenPages.SinginPage;
import womenPages.TShartPage;
import womenPages.TopsPage;
import womensupport.Utilfile;

public class SinginPageTest extends DriverScript {

	HomePage hp1;
	SinginPage Singin;
	 
	 TopsPage TP;
     TShartPage TSP;
	
	public SinginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		
		 init();
		 hp1 = new HomePage();
		 Singin  =new SinginPage();
		 TP = new  TopsPage();
		 TSP = new TShartPage();
		
		
	}
	@Test
	public void Singintest()
	{
		 hp1.ClickOnSinginButton();
		 //Assert.assertTrue(arg0);
		
	}
	@Test(dataProvider="WomenSingin")
	public void  VerifySinginpageTest(String username,String password)
	{
		
		hp1.ClickOnSinginButton();
		//Singin.VerifySinginpage2(prop.getProperty("username"), prop.getProperty("password"));
		Singin.VerifySinginpage2(username, password);
		
	}
	
	@DataProvider(name="WomenSingin")
	public  Object[][] Exceldata()
	{
		Utilfile Exceldata = new Utilfile(".\\WomenTestData\\WomenExcelData.xlsx");
	int row = Exceldata.getrowvalue(0);
	Object[][] data = new Object[row][2];
	
	for(int i=0;i<row;i++)
	{
		data[i][0]=Exceldata.getData(0, 1, 1);
	     data[i][0]=Exceldata.getData(0, 1, 0);
	     
	}
		return data;
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
}
