package com.PatientRateusTestcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;

public class RateusTestcases8 extends patientLogin {
	@Test
	public void rateus() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RateUs patient = PageFactory.initElements(driver, RateUs.class);
		Thread.sleep(8000);
		patient.patientProfile.click();
		Thread.sleep(3000);
		patient.signOut.click();
		Thread.sleep(5000);
		patient.submit.click();
		if (patient.feedback.isDisplayed()) {
			System.out.println("Please give us a rating or feedback or what you liked alert popup is displaying");
		} else {
			System.out.println("Please give us a rating or feedback or what you liked alert popup is not displaying");
		}
	}
}