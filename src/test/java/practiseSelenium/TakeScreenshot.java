package com.practiseSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	
	  WebDriver driver;
	public void mi() throws IOException
	{
	 System.setProperty("webdriver.chrome.driver", "/home/raju/Documents/Chrome driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("/home/raju/Desktop/Screenshot/gee.png"));
		driver.close();
	}
		
	public static void main(String[] args) throws IOException 
	{
	
		TakeScreenshot gh= new TakeScreenshot();
		gh.mi();
		
	
	


	}		
	
	
}



