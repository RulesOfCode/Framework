package piit.AutomationTrainingProgram;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Windowk {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\E_1_D\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.navigate().to("https://www.ebay.com");
		
		driver.manage().window().maximize();
		
		/*Actions ob=new Actions(driver);
		
		WebElement NewReleases= driver.findElement(By.linkText("New Releases"));
		
		ob.keyDown(Keys.SHIFT).build().perform();
		NewReleases.click();
		ob.keyUp(Keys.SHIFT).build().perform();
	//getWindowHandle: will get us the a unique ID for the current window.
	//getWindowHandles: will get us the unique ID for multiple or all the windows that we open.	
		driver.getWindowHandle();
	Set<String> Windowhandle= driver.getWindowHandles();
	Iterator<String> iterators= Windowhandle.iterator();
	
	String Parent= iterators.next();
	String SecondWindow= iterators.next();
	
	System.out.println("This is Parent window ="+Parent);
	System.out.println("This is SecondWindow ="+SecondWindow);
	
	driver.switchTo().window(SecondWindow);
	
	WebElement Cells= driver.findElement(By.linkText("Cell Phones & Accessories"));
	Cells.click();
	Thread.sleep(3000);*/
		
		
		/*Actions ob=new Actions(driver);
		
		WebElement releasesLinks= driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		releasesLinks.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		driver.getWindowHandle();
	Set<String> windowHandles= driver.getWindowHandles();	
	Iterator<String> iterators= windowHandles.iterator();
	String Parent= iterators.next();
	String secondwindow= iterators.next();
	System.out.println("This is Parent window "+Parent);
	System.out.println("This is secondwindow "+secondwindow);
	driver.switchTo().window(secondwindow);
	WebElement games= driver.findElement(By.linkText("Video Games"));
	Thread.sleep(3000);
	games.click();*/
		
	/*Actions ob=new Actions(driver);
	
	WebElement twoLinks= driver.findElement(By.linkText("Books"));
	ob.keyDown(Keys.SHIFT).build().perform();
	twoLinks.click();
	ob.keyUp(Keys.SHIFT).build().perform();
	driver.getWindowHandle();
Set<String> bookSide= driver.getWindowHandles();
Iterator<String> bookSide2= bookSide.iterator();
String Parent= bookSide2.next();
String Secondwindow= bookSide2.next();
System.out.println("This is Parent "+Parent);
System.out.println("This is Secondwindow "+Secondwindow);
driver.switchTo().window(Secondwindow);
WebElement stories= driver.findElement(By.linkText("Children's Books"));
Thread.sleep(6000);
stories.click();*/
		
		/*Actions ob=new Actions(driver);

		WebElement products= driver.findElement(By.linkText("Sporting Goods"));
		ob.keyDown(Keys.SHIFT).build().perform();
		products.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		driver.getWindowHandle();
	Set<String> sports= driver.getWindowHandles();
	Iterator<String> goods= sports.iterator();
	String Parent= goods.next();
	String Secondwindow= goods.next();
	System.out.println("This is Parent "+Parent);
	System.out.println("This is Secondwindow "+Secondwindow);
	driver.switchTo().window(Secondwindow);
	WebElement deals= driver.findElement(By.linkText("Sporting Goods Deals"));
	deals.click();*/
		
		WebElement sportShoes= driver.findElement(By.xpath("//*[@aria-label='Search for anything']"));
		sportShoes.sendKeys("Shimano Biking Shoes");
		Thread.sleep(3000);
		WebElement browse= driver.findElement(By.id("gh-btn"));
		browse.click();
		
	
		
		
	


	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
