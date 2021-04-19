package com.patientmessage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class message {
	
		WebDriver driver;
		 public message(WebDriver driver) {
				this.driver = driver;
			}
		 
		 
		 @FindBy(how = How.XPATH, using = "//td[contains(text(),'Message')]")
			public WebElement mesg;
		 @FindBy(how = How.XPATH, using = "//a[@id='compose-btn']")
			public WebElement compose;
		 @FindBy(how = How.XPATH, using = "//span[contains(text(),'SENT')]")
			public WebElement sent;
		 @FindBy(how = How.XPATH, using = "//span[contains(text(),'INBOX')]")
			public WebElement inbox;
		 @FindBy(how = How.XPATH, using = "//div[@id='row-comp']//div[@id='form']//textarea[@id='message']")
			public WebElement description;
		 @FindBy(how = How.XPATH, using = "//div[@id='row-comp']//div[@id='form']//input[@id='subject']")
			public WebElement sub;
		 @FindBy(how = How.XPATH, using = "//div[@id='row-comp']//div[@id='form']//div[@class='form-group']//div//input[@id='emailSearch']")
			public WebElement to;
		 @FindBy(how = How.XPATH, using = "//td[contains(text(),'geethanjali.5432@yahoo.com')]")
			public WebElement toId;
		 @FindBy(how = How.XPATH, using = "//div[@id='row-comp']//div[@id='form']//div[@class='form-group']//div[@id='send-btn']")
			public WebElement send;
		 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[46]/div[1]/div[4]/div[1]/div[1]/div[4]")
			public WebElement view;
		
		 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[46]/div[1]/div[4]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[2]/span[5]")
			public WebElement del;
		 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[46]/div[1]/div[4]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[2]/span[4]")
			public WebElement print;
		 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[46]/div[1]/div[4]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[2]/span[2]")
			public WebElement rep;
		 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[46]/div[1]/div[4]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[6]/div[1]/textarea[1]")
			public WebElement reply;
		 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[46]/div[1]/div[4]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[6]/div[1]/span[1]")
			public WebElement send1;
		 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[46]/div[1]/div[4]/div[1]/div[1]/div[4]")
			public WebElement viewmesg;
		 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[46]/div[1]/div[4]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[2]/span[4]")
			public WebElement printmesg;
		 @FindBy(how = How.XPATH, using = "//span[@id='message_list_needHelp']")
			public WebElement help;
		 @FindBy(how = How.XPATH, using = "//span[@id='message_list_needHelp']//li[@role='presentation']//a[@id='help-btn']")
			public WebElement openHelp;
		 @FindBy(how = How.XPATH, using = "//a[contains(text(),'×')]")
			public WebElement close;
		 @FindBy(how = How.CSS, using = "cr-button.cancel-button")
			public WebElement mesg1;
		 public void msg()
			{
				mesg.click(); 
			}
		 public void composeMsg() throws InterruptedException
		 {
			 compose.click();
			 Thread.sleep(3000);
			 sub.sendKeys("demo");
			 Thread.sleep(3000);
			 description.sendKeys("demo");
			 to.sendKeys("demo");
			 Thread.sleep(3000);
			 toId.click();
			 send.click();
		 }
		 public void sent() throws InterruptedException
			{
				
		   sent.click(); 
		   Thread.sleep(3000);
		   view.click();
		   rep.click();
		   reply.sendKeys("hi");
		   send1.click();
			}
		 public void inbox() throws InterruptedException, AWTException
			{
		    sent.click();
		   inbox.click(); 
		   Thread.sleep(3000);
		   viewmesg.click();
		   printmesg.click();
		   Thread.sleep(3000);
		   
}
		 public void help() throws InterruptedException
		 {
			 help.click();
			 Thread.sleep(3000);
			 openHelp.click();
			 Thread.sleep(3000);
			 close.click();
		 }
		 
		 
}
