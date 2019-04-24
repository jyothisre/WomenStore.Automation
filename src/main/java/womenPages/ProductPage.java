package womenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import womenBaseScript.DriverScript;

public class ProductPage extends DriverScript {
	
	@FindBy(xpath="//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
	WebElement ProductID;
	
	
	
	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickTheProduct()
	{
		ProductID.click();
	}
	
	
	

}
