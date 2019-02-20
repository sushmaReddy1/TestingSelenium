package com.spiceJet.Page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Calender {
	
	
	WebDriver driver;
	
	
	public Calender(WebDriver driver2)
	{
		this.driver = driver2;
	}
	
	
	@FindBy(how = How.ID, using = "ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")
	WebElement roundTrip;
	
	
	@FindBy(how = How.ID, using = "ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")
	WebElement departure;
	
	@FindBy(how = How.LINK_TEXT, using = "Madurai (IXM)")
	WebElement madurai;
	

	@FindBy(how = How.ID, using = "ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")
	WebElement arrival;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'dropdownDiv']/a[@text = 'Goa (GOI)']")
	WebElement arrivalGuwahati;
	
	
	@FindBy(how=How.XPATH, using = "//a[@id=\"dropdownGroup1\"]/div/ul[2]/li[3]/a")
	WebElement selectDestination;
	
	@FindBy(how = How.XPATH, using = "//a[@class = 'ui-datepicker-next ui-corner-all']")
	WebElement calender;
	
	@FindBy(how= How.XPATH, using = "//table[@class = 'ui-datepicker-calendar']/tbody/tr[4]/td[5]")
	WebElement date;
	

	@FindBy(how= How.NAME, using = "ctl00$mainContent$view_date2")
	WebElement return1;
	
	
	public void selectDestination() {
		String[] cityList = {"Ahmedabad", "Hyderabad", "Mumbai"};
		for(String city: cityList) 
		{
			String cityXpath = "//div[@id = 'glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']";
			cityXpath += "//div[@id = 'dropdownGroup1']//a[contains(text(),'" + city + "')]";
			
			WebElement cityLink = driver.findElement(By.xpath(cityXpath));
			
			System.out.println("Selecting Dest:" + city);
			cityLink.click();
		}
		
		
		
		//List<WebElement> myLinks = driver.findElements(By.xpath("//a[contains(text(),'Goa (GOI)')]"));
		//myLinks.get(1).click();	
		//selectDestination.click();
		
	}
	
	
	public void clickRoundTrip()
	{
		if(roundTrip.isSelected() == false)
		{
			roundTrip.click();
			System.out.println("RoundTrip Selected");
			
			//driver.switchTo().alert().accept();
		}
	}
	
	public void selectDeparture()
	{
		departure.click();
		madurai.click();
		//arrival.click();
		//arrivalGuwahati.click();
	
	}
	
	public void selectDate()
	{
		//calender.click();
		List <WebElement>  dates =driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr[4]/td[5]"));
		dates.get(1).click();
		//return1.click();
		
	}

}
