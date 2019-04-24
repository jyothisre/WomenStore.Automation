package womenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import womenBaseScript.DriverScript;

public class SinginPage extends DriverScript{
	
	/* Page Element Finding */
	
	@FindBy(id="email")
	public WebElement SinginID;
	
	@FindBy(id="passwd")
	public WebElement SinginPassword;
	
	@FindBy(xpath="//*[@id='SubmitLogin']/span")
	public WebElement SinginClick;
	
	public SinginPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void VerifySinginpage()
	{
		SinginID.sendKeys("automation@test.com");
		
		SinginPassword.sendKeys("pass@123");
		
		 SinginClick.click();
		
	}
	public void VerifySinginpage2(String username,String password)
	{
		SinginID.sendKeys(username);
		
		SinginPassword.sendKeys(password);
		
		 SinginClick.click();
		
	}


	
	}
	
	


