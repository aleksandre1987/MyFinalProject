package StepObject;

import PageObject.PO_Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PO_Steps extends PO_Object {

    WebDriver driver;

    public PO_Steps(WebDriver driver1){
        driver = driver1;
    }
    public void UserName(String username){
        driver.findElement(UserNameField).sendKeys(username);
    }
    public void Password(String password){
        driver.findElement(PasswordField).sendKeys(password);
    }
    public void LoginButton(){
        driver.findElement(LoginButton).click();
    }
    public void CreatPoButton() throws InterruptedException {
        driver.findElement(CreatePoButton).click();
        Thread.sleep(1000);
    }
    public void PoNoDropDownList() throws InterruptedException {
        Select dropDown = new Select(driver.findElement(PoNo_DDL));
        dropDown.selectByIndex(9);
        Thread.sleep(1000);
    }
    public void PurchasedField(String Purchased) throws InterruptedException {
        driver.findElement(PurchasedForField).sendKeys(Purchased);
        Thread.sleep(1000);
    }
    public void OpCoDropDownList() throws InterruptedException {
        Select OpCodropDown = new Select(driver.findElement(OpCoDDL));
        OpCodropDown.selectByIndex(4);
        Thread.sleep(1000);
    }
    public void ReasonPurchase(String Reason) throws InterruptedException {
        driver.findElement(ReasonforPurchaseField).sendKeys(Reason);
        Thread.sleep(1000);
    }
    public void DateOfPurchase(String Date) throws InterruptedException {
        driver.findElement(DateOfPurchaseField).sendKeys(Date);
        Thread.sleep(1000);
    }
    public void Supplierddl() throws InterruptedException {
        Select SupplierDropDown = new Select(driver.findElement(supplierDDL));
        SupplierDropDown.selectByValue("2");
        Thread.sleep(1000);
    }
    public void ShippingAddressDDL() throws InterruptedException {
        Select ShippingDropDown = new Select(driver.findElement(ShippingAddress));
        ShippingDropDown.selectByValue("160 Bloor Street East, Suite 600, Toronto, Ontario, M4W 0A2");
        Thread.sleep(1000);
    }
    public void BillingAddressddl() throws InterruptedException {
        Select BillingDropDownList = new Select(driver.findElement(BillingAddress));
        BillingDropDownList.selectByValue("250 Yonge St. Suite 1602, Toronto, Ontario, M5B 2L7");
        Thread.sleep(1000);
    }
    public void ItemField(String item) throws InterruptedException {
        driver.findElement(ItemField).sendKeys(item);
        Thread.sleep(1000);
    }
    public void PartField(String part) throws InterruptedException {
        driver.findElement(PartNoField).sendKeys(part);
        Thread.sleep(1000);
    }
    public void ModelField(String model) throws InterruptedException {
        driver.findElement(ModelNoField).sendKeys(model);
        Thread.sleep(1000);
    }
    public void qualityfield(String quality) throws InterruptedException {
        driver.findElement(QualityField).sendKeys(quality);
        Thread.sleep(1000);
    }
    public void pricefield(String price) throws InterruptedException {
        driver.findElement(PriceField).sendKeys(price);
        Thread.sleep(1000);
    }
    public void notesfield(String notes) throws InterruptedException {
        driver.findElement(NotesField).sendKeys(notes);
        Thread.sleep(1000);
    }
    public void PoCreateButton() throws InterruptedException {
        driver.findElement(CreatePO).click();
        Thread.sleep(4000);
    }









}
