package com.patientLoginTestCases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.Billing;
import com.patientLogin.ChangePassword;
import com.patientLogin.patientLogin;

public class BillingTestcase extends patientLogin{
	@Test
	public void billings() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Billing patient = PageFactory.initElements(driver,Billing.class);
		Thread.sleep(3000);
		patient.billingButton();
		patient.bill();
		patient.billing();
		driver.navigate().back();
		Thread.sleep(1000);
		patient.printing();

}
}