package com.patientLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class patientContact {

	WebDriver driver;
	
	public patientContact (WebDriver driver)
	{
		this.driver=driver;
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	By settings=By.xpath("//td[contains(text(),'Settings')]");
	//By settings=By.xpath("//div[@id='menuPatient']//td[@class='menu2'][contains(text(),'Settings')]");
	By Gomanageaccount=By.xpath("//button[contains(text(),'Manage your Account')]");
	By Add=By.xpath("//div[@id='add-btn']//span[contains(text(),'Add')]");
	By address1=By.xpath("//div[@class='col-xs-8']//input[@id='address1']");
	By address2=By.xpath("//div[@class='col-xs-8']//input[@id='address2']");
	By city=By.xpath("//div[@class='col-xs-8']//input[@id='city']");
	By country=By.xpath("//div[@class='col-xs-8']//select[@id='countryGeoId']");
	By state=By.xpath("//div[@class='col-xs-8']//select[@id='stateProvinceGeoId']");
	By postalcode=By.xpath("//div[@class='col-xs-8']//input[@id='postalCode']");
	By phonenum1=By.xpath("//div[@class='intl-tel-input allow-dropdown']//input[@id='phone1']");
	By phonenum2=By.xpath("//input[@id='phone2']");
	By notes=By.xpath("//div[@class='col-xs-8']//textarea[@id='notes']");
	By save=By.xpath("//div[@id='p-address-phone']//div[@id='save-btn']");
	By edit=By.xpath("//div[contains(text(),'Califonia')]");
	By countryUS=By.xpath("//option[contains(text(),'United States')]");
	By Australia=By.xpath("//select[@id='countryGeoId']//option[contains(text(),'Australia')]");
	By Georgia=By.xpath("//select[@id='stateProvinceGeoId']//option[contains(text(),'Georgia')]");
	By southWales=By.xpath("//option[contains(text(),'New South Wales')]");
	
	
	
	public void call_settings() throws InterruptedException
	{
		driver.findElement(settings).click();
		Thread.sleep(3000);
	
	}
	public WebElement  call_manageaccount()
	{
	return	driver.findElement(Gomanageaccount);
	}
	public void add1() throws InterruptedException
	{
		driver.findElement(Add).click();
		Thread.sleep(3000);
		
	}
	
	public WebElement Enteraddress1()
	{
	return	driver.findElement(address1);
	}
	public WebElement Enteraddress2()
	{
	return	driver.findElement(address2);
	}
	public WebElement City()
	{
	return	driver.findElement(city);
	}
	public WebElement Country()
	{
	return	driver.findElement(country);
	}
	public WebElement US()
	{
	return	driver.findElement(countryUS);
	}
	public WebElement State()
	{
	return	driver.findElement(state);
	}
	public WebElement  Georgia()
	{
	return	driver.findElement( Georgia);
	}
	public WebElement PostalCode()
	{
	return	driver.findElement(postalcode);
	}
	public WebElement phonenum1()
	{
	return	driver.findElement(phonenum1);
	}
	public WebElement phonenum2()
	{
	return	driver.findElement(phonenum2);
	}
	public WebElement notes()
	{
	return	driver.findElement(notes);
	}
	public WebElement save()
	{
	return	driver.findElement(save);
	}
	public void Edit()
	{
		driver.findElement(edit).click();
		
	}
}
