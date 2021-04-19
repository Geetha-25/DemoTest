package com.patientLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthorizedUser {
	 WebDriver driver;
	 public AuthorizedUser(WebDriver driver) {
			this.driver = driver;
		}
	 @FindBy(how = How.XPATH, using = "//div[@id='authorized_user']//div[@class='checkbox-button']//span[@class='checkbox-button__control']")
		public WebElement checkbox;
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[4]/div[1]/div[1]/div[1]/div[4]/div[9]/div[1]/div[4]/div[1]/div[2]/textarea[1]")
		public WebElement search;
	@FindBy(how = How.XPATH, using = "//td[@style='padding-left: 1em; text-align: right; white-space: nowrap;']")
		public WebElement searched;
 @FindBy(how = How.XPATH, using = "//div[@id='authorized_user']//div[@id='addUser']//div[@class='col-xs-12']//div[@class='col-xs-12']//button[@class='settings-heading settings-buttonColor settings-button'][contains(text(),'Add User')]")
		public WebElement add;
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Provide authorization to users*')]")
		public WebElement click;
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[4]/div[1]/div[1]/div[1]/div[4]/div[9]/div[1]/div[4]/div[1]/div[3]/textarea[1]")
		public WebElement second;
	 @FindBy(how = How.XPATH, using = "//td[contains(text(),'3072049')]")
		public WebElement searched1;
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[4]/div[1]/div[1]/div[1]/div[4]/div[9]/div[1]/div[4]/div[1]/div[3]/span[1]/span[1]")
		public WebElement searched2;
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[4]/div[1]/div[1]/div[1]/div[4]/div[9]/div[1]/div[4]/div[1]/div[2]/span[1]/span[1]")
		public WebElement third;
	
	 public WebElement authorized()
		{
			return checkbox;
		}
	 public WebElement authorized1()
		{
			return search;
		}
	 public WebElement authorized2()
		{
			return searched;
		}
	 public WebElement authorized3()
		{
			return add;
		}
	 public WebElement authorized4()
		{
			return click;
		}
	 public WebElement authorized5()
		{
			return second;
		}
	 public WebElement authorized6()
		{
			return searched1;
		}
	 public WebElement authorized7()
		{
			return third;
		}
	 public WebElement authorized8()
		{
			return searched2;
		}
}
