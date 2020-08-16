package Bootcamp.HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public WebDriver driver;
	
	@FindBy (className = "col__12-12")
	WebElement personnalaccount;
	@FindBy(xpath = "//span[contains(text(),'Select & Continue')]")
	WebElement continuebutton;
	
	public RegisterPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void personnalaccountclick() {
		personnalaccount.click();
	}
	public void continuebuttonclick() {
		continuebutton.click();
	}

}
