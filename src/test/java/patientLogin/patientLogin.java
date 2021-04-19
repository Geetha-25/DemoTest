package patientLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.qa.test.Login;

public class patientLogin {
	protected WebDriver driver;
	//JavascriptExecutor jse;

	//192.168.43.251
	String url="https://192.168.17.10:8443/";
	
	 @BeforeSuite
	
	public void login1() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkr26\\Documents\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		  driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		
		    Thread.sleep(3000);
			WebElement obj = driver.findElement(By.id("userLoginId"));
			obj.sendKeys("geethanjali.5432@outlook.com");
			WebElement obj1 = driver.findElement(By.id("currentPassword"));

			obj1.sendKeys("1");

			driver.findElement(By.xpath("//div[@class='col-xs-10 center-cont']")).click();
			Thread.sleep(4000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		patientLogin kaaspro=new patientLogin();
		kaaspro.login1();
		kaaspro.Aftersuite();
	}
	
	@AfterSuite 
	public void Aftersuite() {
		
		driver.close();
	}
	
	
	
	
	
}


