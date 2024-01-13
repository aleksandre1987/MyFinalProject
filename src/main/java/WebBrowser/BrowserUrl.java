package WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BrowserUrl {
   protected WebDriver driver = new ChromeDriver();


  @BeforeMethod

    public void openBrowser(){
        driver.manage().window().maximize();
        driver.get("http://www.ezhrs.com/project1/potdb/login.asp");
    }

    @AfterSuite

       public void closeBrowser(){
      driver.quit();
    }


}
