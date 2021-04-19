package com.PatientRateus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RateUs {
	 WebDriver driver;
	 public RateUs(WebDriver driver) {
			this.driver = driver;
		}
	 @FindBy(how = How.CSS, using = "#option-setting .hover-grow.dropdown-toggle #person-image")
		public WebElement patientProfile;
	 @FindBy(how = How.XPATH, using = "//div[@style='width: 100%; margin: 0 auto;']//table[@id='__logo_menu__']//tbody//tr//td[@id='menu']//div//div[@style='display: inline-block;']//div[@id='option-setting']//ul[@class='dropdown-menu dropdown-menu-right profile-menu']//span[@style='padding-left: 1em;'][contains(text(),'Sign out')]")
		public WebElement signOut;
	 @FindBy(how = How.XPATH, using = "//p[contains(text(),'User Experience')]")
		public WebElement userExperience;
	 @FindBy(how = How.XPATH, using = "//p[contains(text(),'User Interface')]")
		public WebElement userInterface;
	 @FindBy(how = How.XPATH, using = "//p[contains(text(),'Ease Of Use')]")
		public WebElement easyofuse;
	 @FindBy(how = How.XPATH, using = "//p[contains(text(),'Features Value')]")
		public WebElement featurevalue;
	 @FindBy(how = How.XPATH, using = "//textarea[@id='comment']")
		public WebElement comment;
	 @FindBy(how = How.XPATH, using = "//body/div[@id='rate']/div[@id='rateusdiv']/div[@id='rateMod']/div[1]/div[6]/div[1]/form[1]/div[2]/input[1]")
		public WebElement submit;
	 @FindBy(how = How.XPATH, using = "//input[@id='signIn']")
		public WebElement signin;
	 @FindBy(how = How.XPATH, using = "//body/div[@id='rate']/div[@id='rateusdiv']/div[@id='rateMod']//div[6]/div[1]/h2[1]/div[1]/div[1]/a[4]")
		public WebElement ratings;
	 @FindBy(how = How.XPATH, using = "//b[contains(text(),'Thank You for Your valuable feedback')]")
		public WebElement thanks;
	 @FindBy(how = How.XPATH, using = "//body/div[@id='rate']/div[@id='rateusdiv']/div[@id='rateMod']/div[1]/div[6]/div[2]/input[1]")
		public WebElement sign;
	 @FindBy(how = How.XPATH, using = "//a[@href='https://www.facebook.com/75health']")
		public WebElement facebook;
	 @FindBy(how = How.XPATH, using = "//a[@href='https://www.instagram.com/75health/']")
		public WebElement instagram ;
	 @FindBy(how = How.XPATH, using = "//a[@href='https://www.linkedin.com/in/75health']")
		public WebElement linkedin;
	 @FindBy(how = How.XPATH, using = "//a[@href='https://twitter.com/75Health']")
		public WebElement twitter;
	 @FindBy(how = How.XPATH, using = "//a[@href='https://www.youtube.com/channel/UCu31SqFSvmBvDyoR7Tf_mnA']")
		public WebElement youtube;
	 @FindBy(how = How.XPATH, using = "//p[contains(text(),'Thank you for using 75health')]")
		public WebElement ThanksForUsing;
	 
	 
	 @FindBy(how = How.XPATH, using = "//p[contains(text(),'What Did You Like The Best?')]")
		public WebElement WhatDidYouLikeTheBest;
	 @FindBy(how = How.XPATH, using = "//p[contains(text(),'How was your experience?')]")
		public WebElement HowWasexperience;
	 @FindBy(how = How.XPATH, using = "//div[contains(text(),'Please give us a rating or feedback or what you li')]")
		public WebElement feedback;
	
}
