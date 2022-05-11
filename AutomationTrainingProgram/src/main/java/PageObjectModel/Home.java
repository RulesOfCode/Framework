package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	//Page Object Model
	
	//1) Locate the element from the page
	@FindBy(name = "email") WebElement mail;
	
	@FindBy(name = "pass") WebElement word;
	
	@FindBy(name = "login") WebElement log;

    //2) Create Page Factory Constructor
public Home(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
    //3) Create Methods according to the action for each element
public void email() {
	mail.sendKeys("Nagat");
	
}

public void pass() {
	word.sendKeys("Simsim85");
}

public void login() {
	log.click();
}
}
