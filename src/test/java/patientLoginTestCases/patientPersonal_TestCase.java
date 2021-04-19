package com.patientLoginTestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.Patient_Personal;
import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;

public class patientPersonal_TestCase  extends patientLogin {
	
	
	@Test
	public void f() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Settings_manageYourAccount patient = new Settings_manageYourAccount(driver);
		patient.call_settings();
		patient.call_manageaccount().click();

		Patient_Personal per = PageFactory.initElements(driver, Patient_Personal.class);
		per.Edit().click();
		per.personlAction("O", "09-09-2020", "ENGINEER");
		per.personlAction1("AP", "M");
		per.MoreButton().click();
		per.identity("Female");
		per.MoreButton().click();
		per.sexualorientation("Bisexual");
		per.MoreButton().click();
		per.race("df");
		per.MoreButton().click();
		per.ethnicity("declined");
		per.MoreButton().click();
		per.preferredlanguage("Achinese");
		per.MoreButton().click();
		per.deathDate("deathTime");

		per.removeField();
		per.saveButton().click();

		driver.close();
	}

}
