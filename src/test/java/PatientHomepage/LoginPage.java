package PatientHomepage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	 public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
	 @FindBy(how = How.XPATH, using = "//input[@id='userLoginId']")
		public WebElement loginid;
	 @FindBy(how = How.XPATH, using = "//input[@id='currentPassword']")
		public WebElement password;
	 @FindBy(how = How.XPATH, using = "//span[@id='remember_me_label']")
		public WebElement rememberme;
	 @FindBy(how = How.XPATH, using = "//h3[@id='signin_button']")
		public WebElement signin;
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign Up')]")
		public WebElement signup;
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Forgot password?')]")
		public WebElement forgotpassword;
	 @FindBys( @FindBy(how = How.CSS, using = "#row-data"))
	 List<WebElement> ehr;
	 @FindBy(how = How.XPATH, using = "//i[@class='hover fa fa-print icon-md']")
		public WebElement print;
	 @FindBy(how = How.XPATH, using = "")
		public WebElement amount;
	 @FindBy(how = How.XPATH, using = "")
		public WebElement paid;
	 
	 public WebElement login()
		{
		return loginid;
		}
	 public void setDateformat() throws InterruptedException
		{
		
		 List<WebElement> li=ehr;
		 int count=li.size();
		 System.out.println("count is " +count);
		 for(int i=0;i<count;i++)
		 {
			
			 if(i>3)
			 {
			System.out.println("EHR list is present");
			break;
			 
		 }	 }
		} 
}
