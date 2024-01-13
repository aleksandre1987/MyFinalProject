package PageObject;

import org.openqa.selenium.By;

public class PO_Search {

    protected By
    UserNameField = By.name("username"),
    PasswordField = By.name("password"),
    LoginButton = By.name("SUBMIT"),
    SearchPoButton = By.xpath("/html/body/table[1]/tbody/tr[3]/td/table/tbody/tr/" +
            "td/table/tbody/tr/td/div/table/tbody[1]/tr[2]/td/div/table[1]/" +
            "tbody/tr/td/table[3]/tbody/tr/td/div/table/tbody/tr/td[3]/div/" +
            "table/tbody/tr/td/table/tbody/tr/td/div/a/b"),
    RequestorDDL = By.name("Orderedby"),
    SearchButton = By.name("submit2"),
    PoNumberButton = By.xpath("/html/body/table[1]/tbody/tr[3]/td/table/" +
            "tbody/tr/td/table/tbody/tr/td/div/table/tbody[1]/tr[2]/td/" +
            "div/table[2]/tbody/tr/td/table/tbody/tr/td/div/table/tbody[2]" +
            "/tr[9]/td[2]/div/a");










}
