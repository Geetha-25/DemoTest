package com.patientLoginTestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.ChangePassword;
import com.patientLogin.Dateformat;
import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;

public class ChangePasswordTestcase extends patientLogin{
	@Test
	public void patientPassword() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Settings_manageYourAccount patient = new Settings_manageYourAccount(driver);
		patient.call_settings();
		
		ChangePassword password = PageFactory.initElements(driver,  ChangePassword.class);
		Thread.sleep(3000);
		password.changeYourPassword().click();
		password.oldPassword().sendKeys("3");
		password.change().click();
		password.alert2();
		password.oldPassword().clear();
		password.change().click();
		password.alert1();
		password.oldPassword().sendKeys("1");
		password.change().click();
		password.oldPassword().clear();
		password.oldPassword().sendKeys("1");
		password.newPassword().sendKeys("2");
		password.change().click();
		password.oldPassword().clear();
		password.oldPassword().sendKeys("1");
		password.newPassword().clear();
		password.newPassword().sendKeys("2");
		password.confirmPassword().sendKeys("3");
		password.change().click();
		password.alert3();
		password.oldPassword().clear();
		password.oldPassword().sendKeys("1");
		password.newPassword().clear();
		password.newPassword().sendKeys("1");
		password.confirmPassword().clear();
		password.confirmPassword().sendKeys("1");
		password.change().click();
		password.alert4();
	
	
}
}