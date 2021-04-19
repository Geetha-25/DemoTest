package com.patientLogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Autologout {
	 WebDriver driver;
	 public Autologout(WebDriver driver) {
			this.driver = driver;
		}

	 @FindBy(how = How.XPATH, using = "//button[@id='auto-logout-time']")
		public WebElement logout;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'1 Hour')]")
     public WebElement one;
	 
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'2 Hour')]")
     public WebElement two;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'4 Hour')]")
     public WebElement four;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'8 Hour')]")
     public WebElement eight;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'1 Day')]")
     public WebElement oneDay;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'Never Logout')]")
     public WebElement neverLogout;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'30 Minutes')]")
     public WebElement thirtyMinutes;
	 
	 public WebElement logoutTime()
		{
			return logout;
		}
	 
	 
	 
	 
	 public void setTime1() throws InterruptedException
		{
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 one.click();
		 Thread.sleep(3000);
		 logout.click();
		 Thread.sleep(3000);
		 two.click();
		 
		 logout.click();
		 four.click();
		 driver.switchTo().alert().dismiss();
		 
		 logout.click();
		 four.click();
		 driver.switchTo().alert().accept();
		 
		 logout.click();
		 eight.click();
		 driver.switchTo().alert().dismiss();
		 
		 logout.click();
		 eight.click();
		 driver.switchTo().alert().accept();
		 
		 logout.click();
		 neverLogout.click();
		 driver.switchTo().alert().dismiss();
		 
		 logout.click();
		 oneDay.click();
		 driver.switchTo().alert().accept();
		 
		 logout.click();
		 neverLogout.click();
		 driver.switchTo().alert().dismiss();
		 
		 logout.click();
		 neverLogout.click();
		 driver.switchTo().alert().accept();
		 
		 logout.click();
		 thirtyMinutes.click();
		
		
		}
}
