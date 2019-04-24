package womenBaseScript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {
    
	public static WebDriver driver;
	 public static Properties prop;
	 FileInputStream file;
	
	
	public DriverScript()
	{
		try
		{
			prop=new Properties();
		
			file = new FileInputStream("C:\\Users\\JYOTHI\\workspace\\HybridFrameWork\\WomenStore.Automation\\WomenConfigaration\\women.properties");
			
			prop.load(file);
		}
		
		catch(Exception e)
		{
		
		System.out.println("sorry file not found"+e.getMessage());
		
		
		}
		}
	
	public void init()
	{
		String browser = prop.getProperty("Browser");
		
		if ( browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\WomenBrowser\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", ".\\WomenBrowser\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(prop.getProperty("TURL"));
	}
	
	
	
	

}
