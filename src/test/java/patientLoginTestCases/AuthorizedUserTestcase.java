package com.patientLoginTestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.AuthorizedUser;
import com.patientLogin.ChangePassword;
import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;

public class AuthorizedUserTestcase extends patientLogin {
	@Test
	public void user() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Settings_manageYourAccount patient = new Settings_manageYourAccount(driver);
		patient.call_settings();
		
		 AuthorizedUser users = PageFactory.initElements(driver,   AuthorizedUser.class);
		Thread.sleep(3000);
		users.authorized().click();
		users.authorized1().sendKeys("p1@g.com");
		users.authorized2().click();

		users.authorized3().click();
		users.authorized5().sendKeys("new@p.com");
		users.authorized6().click();
		Thread.sleep(3000);
		users.authorized().click();
	
}
}