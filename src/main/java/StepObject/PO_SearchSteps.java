package StepObject;

import PageObject.PO_Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PO_SearchSteps extends PO_Search {

    WebDriver driver;

    public PO_SearchSteps(WebDriver driver1){
        driver = driver1;
    }
    public void usernamefield(String username){
        driver.findElement(UserNameField).sendKeys(username);
    }
    public void passwordfield(String password){
        driver.findElement(PasswordField).sendKeys(password);
    }
    public void loginbutton(){
        driver.findElement(LoginButton).click();
    }

    public void PoSearchButton(){
        driver.findElement(SearchPoButton).click();
    }
    public void Requestorddl(){
        driver.findElement(RequestorDDL).click();

    }
    public void RequestorDropDownList(){
        Select RequestDropDown = new Select(driver.findElement(RequestorDDL));
        int RequestorddlList = RequestDropDown.getOptions().size();
        RequestDropDown.selectByValue("ALEKSANDRE");
    }
    public void Searchbutton(){
        driver.findElement(SearchButton).click();
    }
    public void POnumberbutton(){
        driver.findElement(PoNumberButton).click();
    }







}
