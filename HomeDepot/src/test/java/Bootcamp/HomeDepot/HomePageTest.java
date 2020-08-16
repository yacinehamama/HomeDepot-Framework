package Bootcamp.HomeDepot;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTest extends Base{
	

  @Test(priority = 1)
  public void HomePageVerification() {
	  HomePage home = new HomePage(driver);
	  home.accountbuttonclick();
	  home.registerbuttonclick();
	  }
  
  @Test(priority = 2)
  public void RegisterPageVerification() {
	  RegisterPage page = new RegisterPage(driver);
	  page.personnalaccountclick();
	  page.continuebuttonclick();
  }
   @Test(priority = 3)
   public void ContactInformationPageVerification() {
	   ContactInformationPage info = new ContactInformationPage(driver);
	   info.emailfieldinput();
	   info.passwordfieldinput();
	   info.zipcodefieldinput();
	   info.phonefieldinput();
	   info.createaccountclick();
   }
}
