package com.practiseSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import com.patientLogin.patientLogin;

public class SslCertificate {
	public static WebDriver driver;

	static String url="https://192.168.43.251:8443/";
	 

	public static void main(String[] args) throws InterruptedException  {
			
		
		//	driver.manage().window().maximize();
		//	driver.manage().deleteAllCookies();
		//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			DesiredCapabilities ch=DesiredCapabilities.chrome();
			//ch.acceptInsecureCerts();
			ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			
		//	ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//	ChromeOptions c=new ChromeOptions();
		//	c.merge(ch);
			System.setProperty("webdriver.chrome.driver", "/home/raju/Documents/Chrome driver/chromedriver");
			driver = new ChromeDriver(ch);

			driver.get(url);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		
		    Thread.sleep(3000);
			WebElement obj = driver.findElement(By.id("userLoginId"));
			obj.sendKeys("geethanjali.5432@outlook.com");
			WebElement obj1 = driver.findElement(By.id("currentPassword"));

			obj1.sendKeys("1");

			driver.findElement(By.xpath("//div[@class='col-xs-10 center-cont']")).click();
			Thread.sleep(4000);

		} 
	
	
	

}
