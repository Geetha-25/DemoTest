package com.patientLogin;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Alternatecontact {

	WebDriver driver;

	public Alternatecontact(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//div[@id='family-health-patient']//div[@class='col-xs-12']//div[@id='FormPopHeading']//div[@class='hCl1']//div//div[@id='add-btn']")
	public WebElement alternateContact;

	@FindBy(how = How.XPATH, using = "//div[@id='row-data']//input[@id='fullname']")
	public WebElement fullname;

	@FindBy(how = How.XPATH, using = "//div[@class='col-xs-7']//div[@class='intl-tel-input allow-dropdown']//input[@id='phone']")
	public WebElement phoneNum;

	@FindBy(how = How.XPATH, using = "//div[@id='row-data']//select[@id='relationship']")
	public WebElement relationship;

	@FindBy(how = How.XPATH, using = "//div[@id='row-data']//div[@id='save-btn']")
	public WebElement save;

	@FindBy(how = How.XPATH, using = "//div[@id='row-data']//span[@id='edit-btn']")
	public WebElement edit;

	@FindBy(how = How.XPATH, using = "//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")
	public WebElement delete;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Incorrect Full Name')]")
	public WebElement alert;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Please enter phone number')]")
	public WebElement alert1;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Please Enter a valid phone number')]")
	public WebElement alert2;

	public WebElement alternateContact() {
		return alternateContact;
	}

	public WebElement fullName() {
		return fullname;
	}

	public WebElement phoneNumber() {
		return phoneNum;
	}

	public WebElement Save() {
		return save;
	}

	public WebElement Edit() {
		return edit;
	}

	public WebElement deleteDetails() {
		return delete;
	}

	public void incorrect1() {
		alert.isDisplayed();
		System.out.println(alert.getText());
	}

	public void incorrect2() {
		alert1.isDisplayed();
		System.out.println(alert1.getText());
	}

	public void incorrect3() {
		alert2.isDisplayed();
		System.out.println(alert2.getText());
	}

	public void relation() {

		Select oSelect = new Select(relationship);
		List<WebElement> elementCount = oSelect.getOptions();
		int iSize = elementCount.size();

		for (int i = 0; i < iSize; i++) {
			elementCount.get(i).click();

		}

	}
}
