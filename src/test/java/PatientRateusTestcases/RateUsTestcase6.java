package com.PatientRateusTestcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;

public class RateUsTestcase6 extends patientLogin{
	@Test
	public void rateus() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RateUs patient = PageFactory.initElements(driver, RateUs.class);
		Thread.sleep(8000);
		patient.patientProfile.click();
		Thread.sleep(3000);
		patient.signOut.click();
		Thread.sleep(5000);
		patient.easyofuse.click();
		if (patient.easyofuse.isSelected()) {
			System.out.println("easyofuse is able to select");
		}
		patient.featurevalue.click();

		if (patient.featurevalue.isSelected()) {
			System.out.println(" featurevalue is able to select");
		}

		patient.userExperience.click();
		if (patient.userExperience.isSelected()) {
			System.out.println("userExperienceis able to select");
		}
		patient.userInterface.click();

		if (patient.userInterface.isSelected()) {
			System.out.println("userInterface is able to select");
		}

		patient.easyofuse.click();
		if (!patient.easyofuse.isSelected()) {
			System.out.println("easyofuse is able to unselect");
		}
		patient.featurevalue.click();

		if (!patient.featurevalue.isSelected()) {
			System.out.println(" featurevalue is able to unselect");
		}

		patient.userExperience.click();
		if (!patient.userExperience.isSelected()) {
			System.out.println("userExperienceis able to unselect");
		}
		patient.userInterface.click();

		if (!patient.userInterface.isSelected()) {
			System.out.println("userInterface is able to unselect");
		}

	}
}