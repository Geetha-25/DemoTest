package com.settings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Settings1 {
	WebDriver driver;
	public Settings1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 @FindBy(how = How.CSS, using = "#menu-application")
		public WebElement applicationSetting;
	 @FindBy(how = How.XPATH, using = "//div[@id='menu-date-format']")
		public WebElement otherPreference;
	 @FindBy(how = How.XPATH, using = "//div[@id='menu-manage-account']")
		public WebElement manageAccount;
	 @FindBy(how = How.XPATH, using = "//div[@id='menu-change-password']")
		public WebElement changePassword;
	 @FindBy(how = How.XPATH, using = "//div[@id='menu-authorized-user']")
		public WebElement authorisedUser;
	 @FindBy(how = How.XPATH, using = "//div[@id='menu-auto-logout']")
		public WebElement autoLogout;
	 @FindBy(how = How.XPATH, using = "//div[@id='menu-account']")
		public WebElement accountSetting;
	 @FindBy(how = How.XPATH, using = "//button[contains(text(),'Manage your Account')]")
		public WebElement manageyourAccount;
	 @FindBy(how = How.XPATH, using = "//button[contains(text(),'Change Your Password')]")
		public WebElement password;
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Provide authorization to users*')]")
		public WebElement provideAuthorizedUser;
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[4]/div[1]/div[1]/div[1]/div[4]/div[9]/div[1]/div[3]/span[1]")
		public WebElement authorizedUserCheckbox;
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[4]/div[1]/div[1]/div[1]/div[4]/div[9]/div[1]/div[4]/div[1]/div[2]/textarea[1]")
		public WebElement rf;
	 @FindBy(how = How.XPATH, using = "//div[@id='date-format-head']")
		public WebElement dateformat;
	@FindBy(how = How.XPATH, using = "//button[@id='date-format']")
		public WebElement formatdropdown;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'yyyy-MM-dd')]")
		public WebElement format1;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'dd-MM-yyyy')]")
		public WebElement format2;
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'MM-dd-yyyy')]")
		public WebElement format3;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'yyyy/MM/dd')]")
		public WebElement format4;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'dd/MM/yyyy')]")
		public WebElement format5;
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'MM/dd/yyyy')]")
		public WebElement format6;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'yyyy.MM.dd')]")
		public WebElement format7;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'dd.MM.yyyy')]")
		public WebElement format8;
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'MM.dd.yyyy')]")
		public WebElement format9;
	 
	
	 
}
