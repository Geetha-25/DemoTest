package com.patientLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CareteamMember {

	
	WebDriver driver;
	public CareteamMember (WebDriver driver) {
		this.driver = driver;
	
		
	}
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'demo doctor')]")
	public WebElement careTeam ;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'demo standarduser')]")
	public WebElement careTeam1;
	
	
	public void check()
	{
		if(careTeam.isDisplayed())
		{
			System.out.println("doctor name is displayed");
		}
		else
		{
			System.out.println("doctor name is not displayed");
		}
		if(careTeam1.isDisplayed())
		{
			System.out.println("user name is displayed");
		}
		else
		{
			System.out.println("user name is not displayed");
		}
	}
	
}
