package Bootcamp.HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy (id = "headerMyAccount")
	WebElement myaccountbutton;
	@FindBy(xpath = "//span[contains(text(),'Register')]")
	WebElement registerbutton;
	
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void accountbuttonclick() {
	   myaccountbutton.click();	
	}
	public void registerbuttonclick() {
		registerbutton.click();
	}
	

}
