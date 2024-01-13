import StepObject.PO_SearchSteps;
import WebBrowser.BrowserUrl;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.PO_Data.correctPassword;
import static DataObject.PO_Data.correctUserName;

public class Search_PO extends BrowserUrl {

    @Test()

    public void SearchPO() throws InterruptedException {

        PO_SearchSteps steps = new PO_SearchSteps(driver);

        steps.usernamefield(correctUserName);
        steps.passwordfield(correctPassword);
        steps.loginbutton();
        steps.PoSearchButton();
        steps.Requestorddl();
        steps.RequestorDropDownList();
        steps.Requestorddl();
        Thread.sleep(2000);
        steps.Searchbutton();
        Thread.sleep(1000);
        steps.POnumberbutton();
        Thread.sleep(3000);

        String
                expectedURL = "http://www.ezhrs.com/project1/potdb/POTDB.asp?cmd=info&Rec=515",
                actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);






    }

}
