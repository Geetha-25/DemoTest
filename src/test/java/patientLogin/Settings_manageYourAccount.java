package com.patientLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Settings_manageYourAccount {

	
	WebDriver driver;
	By settings=By.xpath("//td[contains(text(),'Settings')]");
//	By settings=By.xpath("//div[@id='menuPatient']//td[@class='menu2'][contains(text(),'Settings')]");
	By Gomanageaccount=By.xpath("//button[contains(text(),'Manage your Account')]");
	By firstname=By.xpath("//input[@id='firstName']");
	By lastname=By.xpath("//input[@id='lastName']");
	By phone=By.xpath("//div[@class='intl-tel-input allow-dropdown']//input[@id='phone']");
	By nid=By.xpath("//input[@id='national-id']");
	By insurances=By.xpath("//textarea[@id='insurance-info']");
	By more=By.xpath("//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[2]//div[14]//div[2]//div[1]//button[2]");
	By tit=By.xpath("//a[@id='a-title']");
	By mn=By.xpath("//span[contains(text(),'Middle Name')]");
	By mn1=By.xpath("//input[@id='middleName']");
	By suff=By.xpath("//span[contains(text(),'Suffix')]");
	By prev=By.xpath("//span[contains(text(),'Previous Name')]");
	By prev1=By.xpath("//input[@id='previousName']");
	By save=By.xpath("//div[@id='person-name-email']//div[@class='col-xs-12']//div//div[@id='save-btn']");
	By edit=By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[6]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[7]/span[1]");
	By titselect=By.xpath("//select[@id='title']");
	By titdropdown1=By.xpath("//option[contains(text(),'Ms')]");
	By titdropdown2=By.xpath("//option[contains(text(),'Capt')]");
	By suffselect=By.xpath("//select[@id='suffix']");
	By suffdropdown1=By.xpath("//option[contains(text(),'Jr')]");
	By suffdropdown2=By.xpath("//option[contains(text(),'III')]");
	
	By removetit=By.xpath("//div[@id='p_title']//div[@id='remove-field']");
	By removemid=By.xpath("//div[@id='p_middlename']//div[@id='remove-field']");
	By removetsuf=By.xpath("//div[@id='p_suffix']//div[@id='remove-field']");
	By removeprev=By.xpath("//div[@id='p_previousname']//div[@id='remove-field']");
	
	public Settings_manageYourAccount (WebDriver driver)
	{
		this.driver=driver;
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void call_settings() throws InterruptedException
	{
		driver.findElement(settings).click();
		Thread.sleep(3000);
	
	}
	public WebElement  call_manageaccount()
	{
	return	driver.findElement(Gomanageaccount);
	}

	public void name(String str1, String str2) throws InterruptedException
	{
		driver.findElement(edit).click();
		Thread.sleep(1000);
		driver.findElement(firstname).clear();
		Thread.sleep(1000);
		driver.findElement(firstname).sendKeys(str1);
		driver.findElement(lastname).clear();
		Thread.sleep(1000);
		driver.findElement(lastname).sendKeys(str2);
	}
	public WebElement  phonenum()
	{
	return	driver.findElement(phone);
	}
	public WebElement  ID()
	{
	return	driver.findElement(nid);
	
	}
	public WebElement Insurance()
	{
	return	driver.findElement(insurances);
	}
	public WebElement  MoreButton()
	{
	return	driver.findElement(more);
	}
	public void  title(String str3)
	{
	driver.findElement(tit).click();
	driver.findElement(titselect).click();
	driver.findElement(titdropdown1).click();
	}
	public void middlename(String str4)
	{
		driver.findElement(mn).click();
		driver.findElement(mn1).sendKeys(str4);
	}
	public void  suffix(String str5)
	{
	driver.findElement(suff).click();
	driver.findElement(suffselect).click();
	driver.findElement(suffdropdown1).click();
	
	}
	public void previousname(String str6)
	{
		driver.findElement(prev).click();
		driver.findElement(prev1).sendKeys(str6);
	}
	
	public WebElement  saveButton()
	{
	return	driver.findElement(save);
	}
	public WebElement  editButton()
	{
	return	driver.findElement(edit);
	}
	public void removefield() throws InterruptedException
	{
		
		Actions a = new Actions(driver);
	      a.moveToElement(driver.findElement(removetit)).doubleClick().build().perform();
	      Thread.sleep(3000);
	   Actions a1 = new Actions(driver);
	      a1.moveToElement(driver.findElement(removemid)).doubleClick().build().perform();
	      Thread.sleep(3000);
	    Actions a2 = new Actions(driver);
	      a2.moveToElement(driver.findElement(removetsuf)).doubleClick().build().perform();
	      Thread.sleep(3000);
	    Actions a3 = new Actions(driver);
	      a3.moveToElement(driver.findElement(removeprev)).doubleClick().build().perform();
	         
	}
	
	
	}
	
	

