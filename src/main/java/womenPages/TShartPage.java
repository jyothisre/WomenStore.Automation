package womenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import womenBaseScript.DriverScript;

public class TShartPage extends  DriverScript {
	
    @FindBy(xpath="//*[@id='categories_block_left']/div/ul/li[1]/a")
	private WebElement TShart;
	
	//@FindBy(linkText="T-shirts")
	//private WebElement css;
	
	@FindBy(xpath="//img[@id='bigpic']")
    private WebElement imgClick;
	
	public  TShartPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public void ClickTShart()
			{
		TShart.click();
				
			}
	public void imgClick()
	{
		imgClick.click();
	}
	
	}//*[@id="categories_block_left"]/div/ul/li[1]/a
	
		


