package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Browser {
	WebDriver driver; 
	
  @Test
  public void f() throws InterruptedException {
	  WebElement Create= driver.findElement(By.name("email"));
	  Create.sendKeys("amar@gmail.com");
	  WebElement Password= driver.findElement(By.name("pass"));
	  Password.sendKeys("simsim11");
	  WebElement Register= driver.findElement(By.name("login"));
	  Register.click();
	  Thread.sleep(3000);
  }
  @BeforeClass
  public void beforeClass() {
	  //System.setProperty("webdriver.edge.driver", "C:\\Users\\E_1_D\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
	  /*System.setProperty("webdriver.gecko.driver", "C:\\Users\\E_1_D\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
	  
	  driver= new FirefoxDriver();
	  
	  driver.navigate().to("https://www.facebook.com");
	  
	  driver.manage().window().maximize();
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\E_1_D\\Downloads\\chromedriver_win32\\chromedriver.exe");*/
		
	
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  public void Browser(String window) {
	  if(window.equalsIgnoreCase("Chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\E_1_D\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com");
	  driver.manage().window().maximize();
  
	  
  }else if(window.equalsIgnoreCase("Edge")) {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\E_1_D\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
	  driver= new EdgeDriver();
	  driver.navigate().to("https://www.facebook.com");
	  driver.manage().window().maximize();
	  
  }else if(window.equalsIgnoreCase("Firefox")) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\E_1_D\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  driver.navigate().to("https://www.facebook.com");
	  driver.manage().window().maximize();
	  
	  
  }
	 
  }
  public void Pictures() throws IOException{
	  Date dt=new Date();
	  String sk= dt.toString().replace(" ","_").replaceAll(":","_");
	  System.out.println(sk);
	  System.out.println(dt);
	  File screenshots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	  FileHandler.copy(screenshots, new File("C:\\Users\\E_1_D\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\Photos\\"+sk+"ARFotos.jpg"));
  }

}
