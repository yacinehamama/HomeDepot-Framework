package Bootcamp.HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
	public WebDriver driver;
	
	@FindBy (xpath = "//input[@id='email']")
	WebElement emailfield;
	@FindBy (id = "password-input-field")
	WebElement passwordfield;
	@FindBy (id = "zipCode")
	WebElement zipcodefield;
	@FindBy (id = "phone")
	WebElement phonefield;
	@FindBy (xpath = "//span[contains(text(),'Create an Account')]")
	WebElement createaccountbutton;
	
	public ContactInformationPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	public void emailfieldinput() {
	emailfield.sendKeys("hamama-yacine@hotmail.fr");
	}
	public void passwordfieldinput () {
		passwordfield.sendKeys("yacine90");
	}
	public void zipcodefieldinput() {
		zipcodefield.sendKeys("19111");
	}
	public void phonefieldinput() {
		phonefield.sendKeys("3172246832");
	}
	public void createaccountclick() {
		createaccountbutton.click();
	}
}
