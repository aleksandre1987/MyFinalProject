package StepObject;

import PageObject.LogInObject;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends LogInObject {

  WebDriver driver;

  public LoginSteps(WebDriver driver1){
  driver = driver1;

  }

  public void UserName(String Username){
      driver.findElement(UserNameField).sendKeys(Username);
  }
  public void Password(String Password) throws InterruptedException {
      driver.findElement(PasswordField).sendKeys(Password);
      Thread.sleep(2000);
  }
  public void Loginbutton() throws InterruptedException {
     driver.findElement(LoginButton).click();
     Thread.sleep(2000);
  }



}
