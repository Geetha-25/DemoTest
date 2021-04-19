package com.patientLogin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Billing {
	WebDriver driver;
	 public Billing(WebDriver driver) {
			this.driver = driver;
		}
	 
	 @FindBy(how = How.XPATH, using = "//td[contains(text(),'Billing')]")
		public WebElement bill;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'3020-854')]")
		public WebElement invoiceno;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'demo')]")
		public WebElement name;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'3076780')]")
		public WebElement kpid;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'207')]")
		public WebElement amount;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'5')]")
		public WebElement paid;
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[39]/div[1]/div[2]/i[1]")
		public WebElement print; 
	 
	 @FindBy(how = How.XPATH, using = "//div[contains(@class,'col-xs-6 text-right hidden-print')]//button[@id='print']//span[contains(text(),'Print')]")
		public WebElement print1; 
	 
	 
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'Health Insurance')]")
		public WebElement insuranceDescription;
	 @FindBy(how = How.XPATH, using = "//div//span[contains(text(),'Claim Submitted')]")
		public WebElement insuranceStatus;
	 @FindBy(how = How.XPATH, using = "//div[@id = 'text-all-amount'][contains(text(),'41.40')]")
		public WebElement insuranceAmount;
	 
	 @FindBy(how = How.XPATH, using = "//div[@id='bill_report_pagination']//button[@id='more-btn']")
		public WebElement more;
	 public void billingButton()
		{
			bill.click(); 
		}
	 
	 
	 public void bill() throws InterruptedException
	 
		{
		 Thread.sleep(3000);
			invoiceno.isDisplayed();
			System.out.println("invoice number displayed");
			name.isDisplayed();
			System.out.println("patient name displayed");

			kpid.isDisplayed();
			System.out.println("kpid is displayed");

			amount.isDisplayed();
			System.out.println("total amount displayed");

			paid.isDisplayed();
			System.out.println("paid amount is displayed");

			
		}
	 public void billing() throws AWTException, InterruptedException
		{
			invoiceno.click(); 
			Thread.sleep(3000);
		Assert.assertTrue(insuranceDescription.isDisplayed());
		System.out.println("insurance description displayed");
		Assert.assertTrue(	insuranceStatus.isDisplayed());
		System.out.println("insurance status is displayed");
		Assert.assertTrue(	insuranceAmount.isDisplayed());
		System.out.println("insurance amount is displayed");
			
			print1.click();
			Thread.sleep(3000);
			Robot r1 = new Robot();

			 r1.keyPress(KeyEvent.VK_ESCAPE);

			 r1.keyRelease(KeyEvent.VK_ESCAPE);
			 System.out.println("Billing Print window closed");
		}
	 public void printing() throws InterruptedException, AWTException
	 {
		 print.click();
		 Thread.sleep(3000);
		 Robot r = new Robot();

		 r.keyPress(KeyEvent.VK_ESCAPE);

		 r.keyRelease(KeyEvent.VK_ESCAPE);
		 System.out.println("List bill Print window closed");
		 Thread.sleep(3000);
		 more.click();
		 Thread.sleep(3000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		
	 }
	 }

