package com.PatientMessageTestcase;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.patientLogin.patientLogin;
import com.patientmessage.message;

public class ViewInboxMessage extends patientLogin {
	@Test
	public void messages() throws InterruptedException, AWTException  {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		message patient = PageFactory.initElements(driver,message.class);
		Thread.sleep(3000);
		patient.msg();
		Thread.sleep(3000);
		patient.inbox();
}
}