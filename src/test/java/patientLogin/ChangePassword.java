package com.patientLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChangePassword {
	 WebDriver driver;
	 public ChangePassword(WebDriver driver) {
			this.driver = driver;
		}
	 @FindBy(how = How.XPATH, using = "//button[contains(text(),'Change Your Password')]")
		public WebElement settingchange;
	 @FindBy(how = How.XPATH, using = "//div[@class='col-xs-6']//input[@id='currentPassword']")
		public WebElement old;
	 @FindBy(how = How.XPATH, using = "//input[@id='newPassword']")
		public WebElement newpass;
	 @FindBy(how = How.XPATH, using = "//input[@id='confirmNewPassword']")
		public WebElement confirm;
	 @FindBy(how = How.XPATH, using = "//div[@class='col-xs-12']//button[@id='go-back']")
		public WebElement cancel;
	 @FindBy(how = How.XPATH, using = "//button[@id='save']//span[contains(text(),'Change')]")
		public WebElement change;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'Current password can not be empty')]")
		public WebElement empty;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'Please Enter the valid current password')]")
		public WebElement validPassword;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'Passwords do not match')]")
		public WebElement donotMatch;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'Password updated')]")
		public WebElement updated;
	 
	 public WebElement changeYourPassword()
		{
			return settingchange;
		}
	 public WebElement oldPassword()
		{
			return  old;
		}
	 public WebElement newPassword()
		{
			return newpass;
		}
	 public WebElement confirmPassword()
		{
			return confirm;
		}
	 public WebElement cancel()
		{
			return cancel;
		}
	 public WebElement change()
		{
			return change ;
		}
	 public void alert1()
	 {
		 empty.isDisplayed();
		 System.out.println(empty.getText());
		 
	 }
	 public void alert2()
	 {
		 validPassword.isDisplayed();
		 System.out.println(validPassword.getText());
		 
	 }
	 public void alert3()
	 {
		 donotMatch.isDisplayed();
		 System.out.println(donotMatch.getText());
		 
	 }
	 public void alert4()
	 {
		 updated.isDisplayed();
		 System.out.println(updated.getText());
		 
	 }
}
