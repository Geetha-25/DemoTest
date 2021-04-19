package com.practiseSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.patientLogin.patientLogin;

public class Brokenlink {
	protected WebDriver driver;

	String url="https://192.168.43.251:8443/";
	 @BeforeSuite
	
	public void login1() throws InterruptedException {

		 
			
			driver.get(url);
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			DesiredCapabilities ch=DesiredCapabilities.chrome();
			ch.acceptInsecureCerts();
			
			ChromeOptions c=new ChromeOptions();
			c.merge(ch);
			System.setProperty("webdriver.chrome.driver", "/home/raju/Documents/Chrome driver/chromedriver");
			driver = new ChromeDriver(c);

		 
			Thread.sleep(3000);
			

		} 
	
	public static void main(String[] args) throws InterruptedException {
		Brokenlink  kaaspro=new Brokenlink ();
		kaaspro.login1();
		kaaspro.Aftersuite();
	}
	
	@AfterSuite 
	public void Aftersuite() {
		
		driver.close();
	}

}
