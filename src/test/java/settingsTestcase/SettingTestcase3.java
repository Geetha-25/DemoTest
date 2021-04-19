package com.settingsTestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.Dateformat;
import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;
import com.qa.test.Settings;
import com.settings.Settings1;

public class SettingTestcase3 extends patientLogin  {
	@Test
	public void set() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Settings_manageYourAccount patient = new Settings_manageYourAccount(driver);
		patient.call_settings();
		
		Settings1 patient1 = PageFactory.initElements(driver,  Settings1.class);
		Thread.sleep(3000);
		patient1.applicationSetting.click();
		if(patient1.otherPreference.isDisplayed())
		{
			System.out.println("Other preference displaying under application setting");
		}
}
}