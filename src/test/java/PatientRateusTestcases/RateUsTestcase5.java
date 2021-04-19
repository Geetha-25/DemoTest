package com.PatientRateusTestcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;

public class RateUsTestcase5 extends patientLogin{
	@Test
	public void rateus() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RateUs patient = PageFactory.initElements(driver,RateUs.class);
		Thread.sleep(8000);
		patient.patientProfile.click();
		Thread.sleep(3000);
		patient.signOut.click();
		Thread.sleep(5000);
		if(patient.userExperience.isDisplayed()&&patient.userInterface.isDisplayed()&&patient.easyofuse.isDisplayed()&&patient.featurevalue.isDisplayed())
		
		{
			System.out.println("user experience,easy of use, user interface, feature value are displaying");
		}
}
}