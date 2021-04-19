package com.patientLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Patient_Personal {
	
	 WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div[@id='p-personal']//div[@class='col-xs-12']//div//div[@id='val']")
	public WebElement edit;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-xs-6 col-xs-offset-right-2']//select[@id='gender']")
	public WebElement gender;
	
	@FindBy(how = How.ID, using = "birthDate1")
	public WebElement birthDate;
	
	@FindBy(how = How.CSS, using = "#occupation")
	public WebElement occupation;
	
	@FindBy(how = How.XPATH, using = "//select[@id='bloodGroupId'][1]")
	public WebElement bloodGroup;
	
	@FindBy(how = How.ID, using = "maritalStatus")
	public WebElement status;
	
	@FindBy(how = How.XPATH, using = "//div[@id='p-personal']//div[@class='btn-group dropup']")
	public WebElement more;
	
	@FindBy(how = How.XPATH, using = "//a[@id='a-gender-identity']")
	public WebElement identity;
	
	@FindBy(how = How.XPATH, using = "//a[@id='a-sexual-orientation']")
	public WebElement sexualorientation;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='personal_race']//button[@class='multiselect dropdown-toggle btn btn-default']")
	public WebElement race;
	
	@FindBy(how = How.XPATH, using = "//a[@id='p-ethnicity']//span[contains(text(),'Ethnicity')]")
	public WebElement ethnicity;
	
	@FindBy(how = How.XPATH, using = "//a[@id='p-preferlanguage']")
	public WebElement preferredlan;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Time of Death')]")
	public WebElement deathdate;
	
	@FindBy(how = How.XPATH, using = "//select[@id='gender_identity']")
	public WebElement selectGender;
	@FindBy(how = How.XPATH, using = "//select[@id='sexual_orientation']")
	public WebElement selectSexualOri;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Asian')]")
	public WebElement selectRace;
	@FindBy(how = How.XPATH, using = "//div[@id='personal_ethnicity']//button[@class='multiselect dropdown-toggle btn btn-default']")
	public WebElement selectEthnicity;
	@FindBy(how = How.XPATH, using = "//select[@id='preferlanguage']")
	public WebElement selectLang;
	@FindBy(how = How.XPATH, using = "//input[@id='deathDate1']")
	public WebElement deathDate2;
	@FindBy(how = How.XPATH, using = "//input[@id='deathTime1']")
	public WebElement deathTime1;
	@FindBy(how = How.XPATH, using = "//button[@class='settings-heading1 settings-buttonColor1 settings-button']")
	public WebElement record;
	@FindBy(how = How.XPATH, using = "//div[@id='p-personal']//div[@class='form-pop-body']//div[@id='save-btn']")
	public WebElement save;
	@FindBy(how = How.XPATH, using = "//a[@id='p-race']//span[contains(text(),'Race')]")
	public WebElement race1;
	@FindBy(how = How.XPATH, using = "//div[@id='personal_race']//label[@id='label']")
	public WebElement outerClick;
	@FindBy(how = How.XPATH, using = "//div[@class='btn-group open']//label[@class='checkbox'][contains(text(),'Declined to provide')]")
	public WebElement ethnicity1;
	@FindBy(how = How.XPATH, using = "//div[@id='personal_g_identity']//div[@id='remove-field']")
	public WebElement removefield1;
	@FindBy(how = How.XPATH, using = "//div[@id='personal_s_orientation']//div[@id='remove-field']")
	public WebElement removefield2;
	@FindBy(how = How.XPATH, using = "//div[@id='personal_race']//div[@id='remove-field']")
	public WebElement removefield3;
	@FindBy(how = How.XPATH, using = "//div[@id='personal_ethnicity']//div[@id='remove-field']")
	public WebElement removefield4;
	@FindBy(how = How.XPATH, using = "//div[@id='personal_language']//div[@id='remove-field']")
	public WebElement removefield5;
	@FindBy(how = How.XPATH, using = "//div[@id='p-personal']//div[@class='col-xs-12']//div//span[@class='icon-color fa fa-edit hidden-print']")
	public WebElement edit1;

	
	public Patient_Personal(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement Edit()
	{
		return edit;
	}
	
	public void personlAction(String gender1, String DOB,String occupation1)
	{
	
	
		Select gen = new Select(gender);
		gen.selectByValue(gender1);
		birthDate.clear();
		birthDate.sendKeys(DOB);
		occupation.sendKeys(occupation1);
		
		
	}
	public void personlAction1(String Group,String maritalStatus1) 
	{
	
	
		
		Select blood= new Select(bloodGroup);
		blood.selectByValue(Group);
		Select maritalStatus= new Select(status);
		maritalStatus.selectByValue(maritalStatus1);
		
	}

	public WebElement MoreButton()
	{
		return more;
	}
	public void identity(String str2)
	{
		identity.click();
		Select s=new Select(selectGender);
		s.selectByVisibleText(str2);
	}
	
	public void sexualorientation(String str3)
	{
		sexualorientation.click();
		Select s=new Select(selectSexualOri);
		s.selectByVisibleText(str3);
	}
	
	public void race(String str4)
	{
		race1.click();
		 race.click();
		selectRace.click();
		outerClick.click();
		
	}
	public void ethnicity(String str5)
	{
		ethnicity.click();
		selectEthnicity.click();
		ethnicity1.click();
		outerClick.click();
	}
	
	public void preferredlanguage(String str6)
	{
		 preferredlan.click();
		Select s=new Select(selectLang);
		s.selectByVisibleText(str6);
	}

	public void deathDate(String str7)
	{
		deathdate.click();
		 record.click();
	}
	
	public WebElement saveButton()
	{
		return save;
	}
	public WebElement Edit1()
	{
		return edit1;
	}
	
	public void removeField()
	{
		Actions actions = new Actions(driver);
		WebElement elementLocator = removefield1;
		actions.doubleClick(elementLocator).perform();
		
		Actions actions1 = new Actions(driver);
		WebElement elementLocator1 = removefield2;
		actions.doubleClick(elementLocator1).perform();
		
		
		Actions actions2= new Actions(driver);
		WebElement elementLocator2 = removefield3;
		actions.doubleClick(elementLocator2).perform();
		
		Actions actions3= new Actions(driver);
		WebElement elementLocator3 = removefield4;
		actions.doubleClick(elementLocator3).perform();
		
		Actions actions4 = new Actions(driver);
		WebElement elementLocator4
	= removefield5;
		actions.doubleClick(elementLocator4).perform();
	}
	

}
