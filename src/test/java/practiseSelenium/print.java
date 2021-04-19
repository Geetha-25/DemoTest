package com.practiseSelenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.patientLogin.patientLogin;

public class print  extends patientLogin {
	
@Test
public void gg()
{
	driver.findElement(By.xpath("//div[@id='menuPatient'] //tr[4]")).click();
	driver.findElement(By.xpath("//div[@id='bill_report_needHelp'] //i[1]")).click();
}
}
