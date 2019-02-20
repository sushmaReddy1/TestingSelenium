package ca.kijiji.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuyandSellTest {
	
	
	
WebDriver driver;
	
	public BuyandSellTest(WebDriver driver2)
	{
		  this.driver = driver2;
	}
	
	
	@FindBy(how = How.LINK_TEXT, using = "Buy & Sell")
	WebElement buysell;
	
	@FindBy(how = How.LINK_TEXT, using = "Audio")
	WebElement audio;
	
	//@FindBy(how = How.LINK_TEXT,)
	
	  
	public void clickbuysell()
	{
		Actions act = new Actions(driver);
			act.moveToElement(buysell).click().build().perform();
		
	}
	
	public void clickAudio()
	{
		audio.click();
	}
	
	
}
	
