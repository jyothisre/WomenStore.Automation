package womenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import womenBaseScript.DriverScript;

public class TopsPage extends  DriverScript {
	
	@FindBy(xpath="//*[@id='category']")
	private WebElement TopsTab;
	
	
	
	public TopsPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public void ClickOnTops()
	{
		TopsTab.click();
	
	
	}
	
	

}
