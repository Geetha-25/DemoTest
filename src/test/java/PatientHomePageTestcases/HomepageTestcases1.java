package com.PatientHomePageTestcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.PatientHomepage.LoginPage;
import com.patientLogin.Billing;

public class HomepageTestcases1 {
	protected WebDriver driver;
	
	String url="https://192.168.43.252:8443/";
	
	 @Test(priority=0)
	
	public void login1() throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/home/raju/Documents/Chrome driver/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		Thread.sleep(3000);
		LoginPage patient = PageFactory.initElements(driver, LoginPage.class);
		Thread.sleep(3000);
		patient.loginid.isDisplayed();
		patient.password.isDisplayed();
		patient.signin.isDisplayed();
		patient.signup.isDisplayed();
		patient.rememberme.isDisplayed();
		patient.forgotpassword.isDisplayed();

	 }
	 
}
