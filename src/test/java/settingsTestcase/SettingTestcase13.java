package com.settingsTestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.Dateformat;
import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;
import com.qa.test.Settings;
import com.settings.Settings1;

public class SettingTestcase13 extends patientLogin  {
	@Test
	public void set() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Settings_manageYourAccount patient = new Settings_manageYourAccount(driver);
		patient.call_settings();
		
		Settings1 patient1 = PageFactory.initElements(driver,  Settings1.class);
		Thread.sleep(3000);
		patient1.formatdropdown.click();
		Thread.sleep(5000);
		patient1.format1.isDisplayed();
		patient1.format2.isDisplayed();
		patient1.format3.isDisplayed();
		patient1.format4.isDisplayed();
		patient1.format5.isDisplayed();
		patient1.format6.isDisplayed();
		patient1.format7.isDisplayed();
		patient1.format8.isDisplayed();
		patient1.format9.isDisplayed();
	System.out.println("All date format is showing in setting page");	
		
		
}
}