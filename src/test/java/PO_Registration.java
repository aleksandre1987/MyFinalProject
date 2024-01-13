import StepObject.PO_Steps;
import WebBrowser.BrowserUrl;
import org.testng.annotations.Test;

import static DataObject.PO_Data.*;

public class PO_Registration extends BrowserUrl {



    @Test()

  public void RequestorInfo() throws InterruptedException {


        PO_Steps steps = new PO_Steps(driver);



        steps.UserName(correctUserName);
        steps.Password(correctPassword);
        steps.LoginButton();
        steps.CreatPoButton();
        steps.PoNoDropDownList();
        steps.PurchasedField(PurchasedFor);
        steps.OpCoDropDownList();
        steps.ReasonPurchase(ReasonforPurchase);
        steps.DateOfPurchase(AnticpatedDateOfPurchase);
        steps.Supplierddl();
        steps.ShippingAddressDDL();
        steps.BillingAddressddl();
        steps.ItemField(item1);
        steps.PartField(PartNo);
        steps.ModelField(ModelNo);
        steps.qualityfield(Quality);
        steps.pricefield(UnitPrice);
        steps.notesfield(Notes);
        steps.PoCreateButton();







    }



}
