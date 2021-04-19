package com.PatientRateusTestcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientHomepage.LoginPage;
import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;

public class RateUsTestcase1 extends patientLogin {
	@Test
	public void rateus() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RateUs patient = PageFactory.initElements(driver,RateUs.class);
		Thread.sleep(8000);
		patient.patientProfile.click();
		Thread.sleep(3000);
		patient.signOut.click();
		Thread.sleep(5000);
		String rateUsPage=driver.getCurrentUrl();
		System.out.println(rateUsPage);
		if(rateUsPage.contains("rate"))
				{
			System.out.println("we are in rate us page");
				}
		else
		{
			System.out.println("Not navigating to rate us page");
		}
}
}

