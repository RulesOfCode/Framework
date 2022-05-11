package piit.AutomationTrainingProgram;



import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


@SuppressWarnings("deprecation")
public class Signout extends Utility{
	WebDriver driver; 
	@Test(priority= 1)
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.email();
	  ob.pass();
	  Thread.sleep(6000);
	  ob.login();
	  
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	  id.ids();
	  id.search();
	  Thread.sleep(6000);
  }
  
  @Test(priority= 2)
  
  public void TextVerificationMethod() throws InterruptedException {
	driver.navigate().back();
	Thread.sleep(6000);
	ForgotPasswordPage id=new ForgotPasswordPage(driver);
	String Questions= id.QuestionsOfText();
	Assert.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
}
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\E_1_D\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
