package com.PatientRateusTestcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;

public class RateUsTestcase2 extends patientLogin{
	@Test
	public void rateusPage() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RateUs patient = PageFactory.initElements(driver,RateUs.class);
		Thread.sleep(8000);
		patient.patientProfile.click();
		Thread.sleep(3000);
		patient.signOut.click();
		Thread.sleep(3000);
		if(patient.WhatDidYouLikeTheBest.isDisplayed())
		{
			System.out.println("What Did You Like The Best is displaying in rate us page ");
		}
		
		if(patient.HowWasexperience.isDisplayed())
		{
			System.out.println("How Was experience  is displaying in rate us page ");
		}
		
		if(patient.submit.isDisplayed())
		{
			System.out.println("submit button is displaying in rate us page ");
		}
		if(patient.ratings.isDisplayed())
		{
		System.out.println("Rating is displaying in rate us page");
		}
}
}