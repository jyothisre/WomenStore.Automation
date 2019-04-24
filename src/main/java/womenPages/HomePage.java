package womenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import womenBaseScript.DriverScript;

public class HomePage extends DriverScript {
	
	//WebDriver driver;
	
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	private WebElement imglogo;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement singin;
	
	@FindBy(linkText="Women")
	private WebElement womenTab;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy(xpath="//*[@id='header_logo']")
	private WebElement LikTShirt;
	
	@FindBy(xpath="//*[@id='search_query_top']")
	private WebElement searchButton;
	
	//@FindBy(xpath="//div[@id='special_block_right']")
	//private WebElement SpecialOffers;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement Singin;
	
	@FindBy(linkText="Popular")
	private WebElement popular;
	
	//intionliaagtion Webelements
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
       
	
	public boolean verifylogo1()
       {
    	return imglogo.isDisplayed();
    	  //System.out.println(flag);
       }
      
	public void ClickSingIn()
       {
    	   singin.click();
       }
       
      public void womenTab()
       {
    	   womenTab.click();
       }
      
	public void LinkTShirt()
       {
    	   Actions action=new Actions(driver);
    	   action.moveToElement(LikTShirt).build().perform();
       }
       
    	
	public String HomepageTitle()
       {
    	return driver.getTitle();
    	   
       }
     public void ActionOnDresses()
       {
    	   Actions action=new Actions(driver);
    	   action.moveToElement(Dresses).build().perform();
    	   
       }
      
	public void SearchButtonIseble()
       {
    	   searchButton.isEnabled();
       }
	public boolean verifysearchButton()
    {
 	return searchButton.isDisplayed();
 	
    }
	public boolean verifyLikTShirt()
    {
 	return  LikTShirt.isDisplayed();
	
    }
	public boolean verifyDresses()
    {
 	return Dresses.isDisplayed();
    }
	//public boolean verifySpecialOffers()
  //  {
 	//return SpecialOffers.isDisplayed();
   // }
	
    public boolean verifypopular()
  {
 	return popular.isDisplayed();
  }
	public boolean verifywomenTab()
    {
 	return  womenTab.isDisplayed();
    }
       
	
	public void ClickOnSinginButton()
    {
 	  Singin.click();
 	 
 	  
    }


	
	}
      
      
       
      
       

