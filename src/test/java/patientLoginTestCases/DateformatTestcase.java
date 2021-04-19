package com.patientLoginTestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.Autologout;
import com.patientLogin.Dateformat;
import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;

public class DateformatTestcase extends patientLogin{
	@Test
	public void time() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Settings_manageYourAccount patient = new Settings_manageYourAccount(driver);
		patient.call_settings();
		
		Dateformat format = PageFactory.initElements(driver,  Dateformat.class);
		Thread.sleep(3000);
		format.date().click();
		format.setDateformat();
		
}
}