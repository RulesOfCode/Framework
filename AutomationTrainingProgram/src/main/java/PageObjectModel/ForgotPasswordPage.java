package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	WebDriver driver;
	
	@FindBy(xpath = "(//*[@name= 'email'])[2]") WebElement ids;
	
	@FindBy(name = "did_submit") WebElement search;
	
	@FindBy(xpath = "//*[contains(text(),'Please enter your email')]") WebElement Question;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void ids() {
		ids.sendKeys("Nagat@hotmail.com");
	}
	
	public void search() {
		search.click();
	}
	
	public String QuestionsOfText() {
		String Questions= Question.getText();
		return Questions;
	}

}
