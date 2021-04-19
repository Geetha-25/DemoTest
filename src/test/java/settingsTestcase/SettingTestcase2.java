package com.settingsTestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.Dateformat;
import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;
import com.qa.test.Settings;
import com.settings.Settings1;

public class SettingTestcase2 extends patientLogin  {
	@Test
	public void set() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Settings_manageYourAccount patient = new Settings_manageYourAccount(driver);
		patient.call_settings();
		
		Settings1 patient1 = PageFactory.initElements(driver,  Settings1.class);
		Thread.sleep(3000);
		patient1.accountSetting.click();
		Thread.sleep(3000);
		if(patient1.manageAccount.isDisplayed())
		{
			System.out.println("manage account displaying under account setting");
		}
		if(patient1.changePassword.isDisplayed())
		{
			System.out.println("change password displaying under account setting");
		}
		if(patient1.authorisedUser.isDisplayed())
		{
			System.out.println("Authorized user displaying under account setting");
		}
		
}
}