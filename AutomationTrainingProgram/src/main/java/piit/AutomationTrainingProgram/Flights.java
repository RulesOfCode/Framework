package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flights {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\E_1_D\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.navigate().to("https://www.expedia.com/");
		
		driver.manage().window().maximize();
		
		WebElement departure= driver.findElement(By.id("d1-btn"));
		departure.click();
		WebElement Departuretodate= driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
		Departuretodate.click();
		
		WebElement depart= driver.findElement(By.id("d1-btn"));
		depart.click();
		
		WebElement DepToFly= driver.findElement(By.xpath("//*//*[@aria-label='Jun 30, 2022']"));
		DepToFly.click();

	}

}
