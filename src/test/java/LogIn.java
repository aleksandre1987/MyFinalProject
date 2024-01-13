
import StepObject.LoginSteps;
import WebBrowser.BrowserUrl;
import org.junit.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginData.*;


public class LogIn extends BrowserUrl {

    @Test()

   public void CorrectLoginData() throws InterruptedException {

        LoginSteps steps = new LoginSteps(driver);

        steps.UserName(correctUserName);
        steps.Password(correctPassword);
        steps.Loginbutton();


    }
    @Test()

    public void InCorrectLoginData() throws InterruptedException {
        LoginSteps steps1 = new LoginSteps(driver);

        steps1.UserName(inCorrectUserName);
        steps1.Password(inCorrectPassword);
        steps1.Loginbutton();

        String
                expectedUrl = "http://www.ezhrs.com/project1/potdb/fail.asp?Redirect=",
                actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }







}
