package testScript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import womenBaseScript.DriverScript;
import womenPages.AddToCartPage;
import womenPages.HomePage;
import womenPages.ProductPage;
import womenPages.TShartPage;
import womenPages.TopsPage;

public class AddToCartTest extends DriverScript {
	
	HomePage hp1;
	 TopsPage TP;
    TShartPage TSP;
    ProductPage Product;
    AddToCartPage Addtocart;
	
	public  AddToCartTest()
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
		 Product =new ProductPage();
		 
		 Addtocart =new AddToCartPage();
	 }
	 @Test
	 public void AddTOCartTest(){
		 hp1.womenTab();
		 TP.ClickOnTops();
		 TSP.ClickTShart();
		 Product.clickTheProduct();
		
	   Addtocart.verifyAddToCartButton();
		
	 }
	 
	 @Test
	 public void GetTitle(){
		 
		 Addtocart.GetTitleofPage();
	 }
	 
	 
	 @AfterMethod
	 public void teardown()
	 {
		 driver.quit();
	 }
	
	

}
