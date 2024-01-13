package PageObject;

import DataObject.PO_Data;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static com.codeborne.selenide.Selectors.*;

public class PO_Object {

     protected By
     UserNameField = By.name("username"),

     PasswordField = By.name("password"),

     LoginButton = By.name("SUBMIT"),

     CreatePoButton = By.xpath("/html/body/table[1]/tbody/tr[3]/td/table/" +
            "tbody/tr/td/table/tbody/tr/td/div/table/tbody[1]/tr[2]/td/div/" +
            "table[1]/tbody/tr/td/table[3]/tbody/tr/td/div/table/tbody/tr/" +
            "td[2]/div/table/tbody/tr/td/table/tbody/tr/td/div/a/b"),
     PoNo_DDL = By.name("POopco"),
     PurchasedForField = By.name("Orderedby"),
     OpCoDDL = By.name("OpCo"),
     ReasonforPurchaseField = By.name("up_reason"),
     DateOfPurchaseField = By.name("firstinput"),
     supplierDDL = By.name("Supplier"),
     ShippingAddress = By.name("shipping"),
     BillingAddress = By.name("billing"),
     ItemField = By.name("Item1"),
     PartNoField = By.name("PartNo1"),
     ModelNoField = By.name("ModelNo1"),
     QualityField = By.name("Quantity1"),
     PriceField = By.name("Uprice1"),
     NotesField = By.name("Description"),
     CreatePO = By.name("submit");







}
