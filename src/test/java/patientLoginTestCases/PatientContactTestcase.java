package com.patientLoginTestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.patientLogin.patientContact;
import com.patientLogin.patientLogin;

public class PatientContactTestcase extends patientLogin{

	@Test
	public void contact() throws InterruptedException
	{
		patientContact patient=new patientContact(driver);
		patient.call_settings();
		patient.call_manageaccount().click();
		if(driver.findElement(By.xpath("//div[@id='add-btn']//span[contains(text(),'Add')]")).isDisplayed())
		{
			patient.add1();
		patient.Enteraddress1().sendKeys("fg");
		patient.Enteraddress2().sendKeys("rftg");
		patient.City().sendKeys("Califonia");
		patient.Country().click();
		patient.US().click();
		patient.State().click();
		patient.Georgia().click();
		patient.PostalCode().sendKeys("6000");
		patient.phonenum1().sendKeys("4158773032");
		patient.phonenum2().sendKeys("4158303771");
		patient.notes().sendKeys("gfh");
		patient.save().click();
		}
		Thread.sleep(3000);
		patient.Edit();
		patient.Enteraddress1().clear();
		patient.Enteraddress1().sendKeys("address");
		patient.Enteraddress2().clear();
		patient.Enteraddress2().sendKeys("address");
		patient.City().clear();
		patient.City().sendKeys("Califonia");
		patient.Country().click();
		patient.US().click();
		patient.State().click();
		patient.Georgia().click();
		patient.PostalCode().clear();
		patient.PostalCode().sendKeys("5000");
		patient.phonenum1().clear();
		patient.phonenum1().sendKeys("+14158773032");
		patient.phonenum2().clear();
		patient.phonenum2().sendKeys("+14158303771");
		patient.notes().clear();
		patient.notes().sendKeys("gfh");
		patient.save().click();
		
	}
	
	
	
	}
	

