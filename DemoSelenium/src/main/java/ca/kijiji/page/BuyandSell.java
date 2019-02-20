package ca.kijiji.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



import ca.kijiji.test.BuyandSellTest;

public class BuyandSell {
	
	WebDriver driver;
	@BeforeSuite
	public void lunchApp()
	{
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushm\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.kijiji.ca/");
			}
	}
	
	
	@BeforeMethod
	
	public void buyandsell()
	{
		BuyandSellTest  obj = PageFactory.initElements(driver, BuyandSellTest.class);
		 obj.clickbuysell();
	}
	
  @Test
  public void audioLink() throws Exception {
	  
	  BuyandSellTest  obj = PageFactory.initElements(driver, BuyandSellTest.class);
	 
		 obj.clickAudio();
		 driver.navigate().back();
	}
  
  
	
}
	
	
	
	