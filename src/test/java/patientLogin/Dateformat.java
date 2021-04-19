package com.patientLogin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class Dateformat {
	 WebDriver driver;
	 public Dateformat(WebDriver driver) {
			this.driver = driver;
		}

	 @FindBy(how = How.XPATH, using = "//button[@id='date-format']")
		public WebElement date1;
	 @FindBy(how = How.XPATH, using = "//div[@id='date-format-head']")
		public WebElement date2;
	 public WebElement date()
		{
			return date1;
		}

	 @FindBys( @FindBy(how = How.XPATH, using = "//ul[@id='Dateformatscroll'] //li //a"))
	 List<WebElement> date3;
	 
	 
	 public void setDateformat() throws InterruptedException
		{
		
		 List<WebElement> li=date3;
		 int count=li.size();
		 for(int i=0;i<count;i++)
		 {
			
			 date3.get(i).click();
			 Thread.sleep(3000);
			 date1.click();
			
			 
		 }
		 date2.click(); 
		}
		} 

