package com.patientLoginTestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.Alternatecontact;
import com.patientLogin.CareteamMember;
import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;

public class CareTeamMemberTestcase extends patientLogin{

	@Test
	public void alternateContact() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Settings_manageYourAccount patient = new Settings_manageYourAccount(driver);
		patient.call_settings();
		patient.call_manageaccount().click();

		 CareteamMember team = PageFactory.initElements(driver,  CareteamMember.class);
		 team.check();
		 
		 
		 
}
	
}