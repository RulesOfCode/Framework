package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgTraining {
  private TakesScreenshot driver;
@Test
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method method annotation");
  }
  
 File screenshots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
 FileHandler.copy(screenshots, new File("C:\\Users\\E_1_D\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\Photos\\ARFotos.jpg"));
  @Test
  public void Test2() {
	  System.out.println("This is test2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite annotation");
  }

}
