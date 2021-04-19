package com.patientLoginTestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.Alternatecontact;
import com.patientLogin.Patient_Personal;
import com.patientLogin.Settings_manageYourAccount;
import com.patientLogin.patientLogin;

public class AlternatecontactTestcase extends patientLogin {

	@Test(priority = 0)
	public void alternateContact() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Settings_manageYourAccount patient = new Settings_manageYourAccount(driver);
		patient.call_settings();
		patient.call_manageaccount().click();

		Alternatecontact contact = PageFactory.initElements(driver, Alternatecontact.class);
		contact.alternateContact.click();
		contact.fullname.clear();
		contact.fullname.sendKeys("12");
		contact.Save().click();
		contact.incorrect1();
		contact.fullname.clear();
		contact.fullname.sendKeys("demo");
		contact.phoneNumber().clear();
		contact.phoneNumber().sendKeys("");
		contact.Save().click();
		contact.incorrect2();
		contact.fullname.clear();
		contact.fullname.sendKeys("demo");
		contact.phoneNumber().clear();
		contact.phoneNumber().sendKeys("+141551308682222222");
		contact.Save().click();
		contact.incorrect3();
		contact.fullname.clear();
		contact.fullname.sendKeys("demo");
		contact.phoneNumber().clear();
		contact.phoneNumber().sendKeys("+14155130868");
		contact.relation();
		contact.Save().click();
		contact.Edit().click();
		contact.fullname.clear();
		contact.fullname.sendKeys("demopatient");
		contact.phoneNumber().clear();
		contact.phoneNumber().sendKeys("+14155130868");
		contact.relation();
		contact.Save().click();
		contact.Edit().click();
		contact.deleteDetails().click();

	}

}
