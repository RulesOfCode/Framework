package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Training2 {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\E_1_D\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.navigate().to("https://www.pizzahut.com");
		
		driver.manage().window().maximize();
		
		/*driver.navigate().back();
		Thread.sleep(3000); 
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String ur1= driver.getCurrentUrl();
		System.out.println(ur1);
		
		String WindowHandle= driver.getWindowHandle();
		System.out.println(WindowHandle);
		
		driver.close();
		
		WebElement Searchfieldtxt= driver.findElement(By.name("field-keywords"));
		Searchfieldtxt.sendKeys("Men Cloths");
		
		WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
		Searchicon.click();
		
		WebElement Linkyd= driver.findElement(By.linkText("Registry"));
		Linkyd.click();
		
		WebElement PartialL= driver.findElement(By.partialLinkText("Every day is Earth Day"));
		PartialL.click();
		Thread.sleep(3000);
		
		WebElement Searchclick= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
		Searchclick.sendKeys("Cell Phones");
		
		WebElement Searchoe= driver.findElement(By.xpath("//input[@aria-label='Search']"));
		Searchoe.sendKeys("toys");
		
		WebElement Searchicon= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		Searchicon.click();
		Thread.sleep(3000);
		
		WebElement CreateAnAccount= driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAnAccount.click();
		Thread.sleep(3000);
		
		WebElement Month= driver.findElement(By.name("birthday_month"));
		
		Select ob=new Select(Month);
		ob.selectByValue("11");
		
		WebElement Day= driver.findElement(By.name("birthday_day"));
		
		Select ob1=new Select(Day);
		ob1.selectByVisibleText("29");
		Thread.sleep(3000);
		
		WebElement Year= driver.findElement(By.name("birthday_year"));
		
		Select ob2=new Select(Year);
		ob2.selectByValue("1985");
		Thread.sleep(3000);
		
		WebElement Alert= driver.findElement(By.name("alert"));
		Alert.click();
		driver.switchTo().alert().accept();
		
		WebElement prompting= driver.findElement(By.name("prompt"));
		prompting.click();
		driver.switchTo().alert().sendKeys("Testing");
		driver.switchTo().alert().dismiss();
		Actions ob=new Actions(driver);
		WebElement hovers= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(hovers).build().perform();
		
		//Using "DragAndDrop" with the help of "Iframe"!!!
		WebElement droppable= driver.findElement(By.linkText("Droppable"));
		droppable.click();
		driver.switchTo().frame(0);
		
		WebElement ElementToDrag= driver.findElement(By.id("draggable"));
		WebElement ElementToDrop= driver.findElement(By.id("droppable"));
		
		Actions ob=new Actions(driver);
		ob.dragAndDrop(ElementToDrag, ElementToDrop).build().perform();
		
		//Using "parentFrame" to perform the Element that it's outside "Iframe"!!!
		driver.switchTo().parentFrame();
		WebElement Sorting= driver.findElement(By.linkText("Sortable"));
		Sorting.click();
		
		Thread.sleep(3000);
		//Using "Right click" with help of "contextClick"!!!!!
		WebElement Picture= driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
		Actions ob=new Actions(driver);
		ob.contextClick(Picture);
		
		//How to use "ctrl and c" and "ctrl and v" with the help of "KeyDown and KeyUp"!!!
		WebElement SearchToField= driver.findElement(By.id("twotabsearchtextbox"));
		SearchToField.sendKeys("Cell phones");
		Actions ob=new Actions(driver);
		Thread.sleep(6000);
		
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		SearchToField.clear();
		SearchToField.click();
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		//How to select the date from the calendar!!!!!
		WebElement Departure= driver.findElement(By.id("d1-btn"));
		Departure.click();
		Thread.sleep(3000);
		WebElement TravelDate= driver.findElement(By.xpath("//*[@aria-label='May 7, 2022']"));
		TravelDate.click();
		WebElement ReturnDate= driver.findElement(By.xpath("//*[@aria-label='Jun 30, 2022']"));
		ReturnDate.click();
		
		//HomeDepot Assignment
		WebElement CreateAnAccount= driver.findElement(By.linkText("My Account"));
		CreateAnAccount.click();
		Thread.sleep(3000);
		WebElement Registration= driver.findElement(By.linkText("Register"));
		Registration.click();
		WebElement PersonalAccount= driver.findElement(By.xpath("//*[@class='bttn__content'][1]"));
		PersonalAccount.click();
		Thread.sleep(3000);
		
		WebElement AccountEmail= driver.findElement(By.id("email"));
		AccountEmail.sendKeys("AmmarIbra911@gmail.com");
		
		WebElement Password= driver.findElement(By.id("password-input-field"));
		Password.sendKeys("Ammar1985");
		
		WebElement ZipCode= driver.findElement(By.id("zipCode"));
		ZipCode.sendKeys("22304");
		
		WebElement PhoneNumber= driver.findElement(By.id("phone"));
		PhoneNumber.sendKeys("2025434567");
		Thread.sleep(3000);
		
		WebElement Register= driver.findElement(By.linkText("Create an Account"));
		Register.click();*/
		
		
		WebElement OrderMenu= driver.findElement(By.xpath("//*[@class='MuiButton-label']"));
		OrderMenu.click();
		
		WebElement SelectPizza= driver.findElement(By.linkText("Pizza"));
		SelectPizza.click();
		
		WebElement PopularPizza= driver.findElement(By.linkText("Popular Pizzas"));
		PopularPizza.click();
		Thread.sleep(3000);
		
		WebElement CheesePizza= driver.findElement(By.xpath("//a[@class='btn btn-primary btnModal'][1]"));
		CheesePizza.click();
		
		WebElement Delivery= driver.findElement(By.xpath("//*[@class='center-block icon-delivery-default']"));
		Delivery.click();
		
		WebElement Address= driver.findElement(By.id("syo-address1"));
		Address.sendKeys("5375 Oaks Street");
		
		WebElement Address2= driver.findElement(By.id("address2"));
		Address2.sendKeys("Apt. 409");
		
		WebElement City= driver.findElement(By.id("city"));
		City.sendKeys("Alexandria");
		
		WebElement State= driver.findElement(By.id("state"));
		State.sendKeys("VA");
		
		WebElement ZipCode= driver.findElement(By.id("zip-input"));
		ZipCode.sendKeys("22304");
		
		
		
		
		
		
		
		

	}

}
