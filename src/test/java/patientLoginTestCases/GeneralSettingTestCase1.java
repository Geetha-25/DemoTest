package com.patientLoginTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;


public class GeneralSettingTestCase1 extends patientLogin {
	
	
	@Test
	public void settings() throws InterruptedException
	{
		Settings_manageYourAccount patient=new Settings_manageYourAccount(driver);
		patient.call_settings();
		patient.call_manageaccount().click();
		patient.name("demo", "patient");
		patient.phonenum().clear();
		Thread.sleep(3000);
		patient.phonenum().sendKeys("+14155130868");
		patient.ID().clear();
		patient.ID().sendKeys("testing");
		patient.Insurance().clear();
		patient.Insurance().sendKeys("insurance");
		Thread.sleep(3000);
		patient.MoreButton().click();
		patient.title("click");
		patient.MoreButton().click();
		patient.middlename(" middlename");
		patient.MoreButton().click();
		patient.suffix("suffix");
		patient.MoreButton().click();
		patient.previousname("previous");
		patient.saveButton().click();
		Thread.sleep(3000);
		patient.editButton().click();
		patient.removefield();
		patient.saveButton().click();
		Thread.sleep(3000);
		patient.editButton().click();
		Thread.sleep(3000);
		driver.close();
	}
}
