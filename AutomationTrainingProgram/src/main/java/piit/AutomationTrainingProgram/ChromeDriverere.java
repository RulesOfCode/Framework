package piit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverere {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E_1_D\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
		driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		Thread.sleep(6000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//Get the current url!!
		String ur= driver.getCurrentUrl();
		System.out.println(ur);
		
		//Example of "Window handle"!!
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		
		//How to close the window browser!!!
		driver.close();
		
		
	}

}
