package womenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import womenBaseScript.DriverScript;

public class AddToCartPage extends DriverScript{
	
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement AddtoCartelement;
	
	
	
	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyAddToCartButton()
	{
		 AddtoCartelement.click();
		   
		 
	}
	
	public String GetTitleofPage()
	{
		String title = driver.getTitle();
		System.out.println("Print the title of the page::===>"+title);
		return title;
	}
	
	

}
