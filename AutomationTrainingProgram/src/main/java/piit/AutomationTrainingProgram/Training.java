package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Training {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E_1_D\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		
		//This code for press "Back" on the page!!!!
		/*driver.navigate().back();
		
		//This code is function on Java that giving "Wait Time". "3000 is 3 seconds in millis second"!!!!!
		Thread.sleep(3000);
		
		//This code press "Forward" on the page!!!!1
		driver.navigate().forward();*
		Thread.sleep(3000);
		
		//This code is to "Refresh" the page!!!!!
		driver.navigate().refresh();
		
		//This code is to get the "Current Url" and "String is helpful for allowing to store Numbers and Alphabetic"!!!!!
		String ur= driver.getCurrentUrl();
		System.out.println(ur);
		
		//This code for how to get "Setion ID for Window Handle/Page"!!!!!! 
		String windowhandle= driver.getWindowHandle();
		System.out.println(windowhandle);
		
		//Those two code is to close the Browser/Page!!!!!!
		driver.close();
		driver.quit();*/
		Thread.sleep(3000);
		
		//When to find the locator with the help of "ID".
		//The interface "WebElement" is to help us save the locator into some variable which is "Searchicon"!!!!
		/*WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
		//Now call the variable which is "Searchicon" and then call Action which is "Click"!!!!
		Searchicon.click();
		
		//When we need to type in the search box with the locator help "Name"!!!!
		WebElement Searchfieldtxt= driver.findElement(By.name("field-keywords"));
		Searchfieldtxt.sendKeys("Computer");
		//We can use "Sendkeys" function and it will help fill any field!!!!
		//We have to write "WebElement Searchicon1= driver.findElement(By.id("nav-search-submit-button"));
		//Searchicon1.click();" To Press the button for the search box!!!!!!!
		WebElement Searchicon1= driver.findElement(By.id("nav-search-submit-button"));
		Searchicon1.click();
		
		//"Link Text" is always come with "a"tag and "href" and every "Link" have a text!!!!!!!
		WebElement linktx= driver.findElement(By.linkText("Registry"));
		linktx.click();*/
		
		//This is the "Absolute Xpath" 
		/*WebElement Searchtoclick= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		Searchtoclick.click();
		//Another Example of "Absolute Xpath"
		WebElement SearchPnp= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		SearchPnp.click();*/
		
		//Example and code of the "Relative Xpath"
		/*WebElement Searchtofield= driver.findElement(By.xpath("//input[@aria-label='Search']"));
		Searchtofield.sendKeys("desktop");*/
		
		/*WebElement CreateAnAccount= driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAnAccount.click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select ob=new Select(month);
		ob.selectByValue("6");
		
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select ob6= new Select(day);
		ob6.selectByValue("6");*/
		
		
		WebElement Alert= driver.findElement(By.name("alert"));
		Alert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement prompting= driver.findElement(By.name("prompt"));
		prompting.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("tested");
		driver.switchTo().alert().dismiss();
		
		

	}

}
