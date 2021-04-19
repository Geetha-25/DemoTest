package com.PatientMessageTestcase;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.patientLogin;
import com.patientmessage.message;

public class SentMessage extends patientLogin {
	@Test
	public void messages() throws InterruptedException  {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		message patient = PageFactory.initElements(driver,message.class);
		Thread.sleep(3000);
		patient.msg();
		Thread.sleep(3000);
		patient.sent();
}
}