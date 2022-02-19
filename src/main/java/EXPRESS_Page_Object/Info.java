package EXPRESS_Page_Object;

import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Info extends Reusable_Annotations {
    ExtentTest logger;

    public Info(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method


    //define all the WebElement we need for this page per use case

    @FindBy(xpath = "//*[@name='firstname']")
    WebElement firstName;
    @FindBy(xpath = "//*[@name='lastname']")
    WebElement lastName;
    @FindBy(xpath = "//*[@name='email']")
    WebElement email;
    @FindBy(xpath = "//*[@name='confirmEmail']")
    WebElement confirmEmail;
    @FindBy(xpath = "//*[@name='phone']")
    WebElement phoneNumber;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue1;
    @FindBy(xpath = "//*[@name='shipping.line1']")
    WebElement Address;
    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement zipcode;
    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement city;
    @FindBy(xpath = "//*[@name='shipping.state']")
    WebElement state;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue3;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue4;
    @FindBy(xpath = "//*[@name='creditCardNumber']")
    WebElement cardNumber;
    @FindBy(xpath = "//*[@name='expMonth']")
    WebElement expMonth;
    @FindBy(xpath = "//*[@name='expYear']")
    WebElement expYear;
    @FindBy(xpath = "//*[@name='cvv']")
    WebElement cvv;
    @FindBy(xpath = "//*[text()='Place Order']")
    WebElement PlaceOrder;
    @FindBy(xpath = "//*[@class='_2paT8dZ2 _1gNCYBQ3']")
    WebElement Error;


    public void firstName(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, firstName, UserData, logger, "firstName");

    }//end of clicking on ship tab

    public void lastName(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, lastName, UserData, logger, "lastName");

    }

    public void email(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, email, UserData, logger, "email");
    }

    public void confirmEmail(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, confirmEmail, UserData, logger, "confirmemail");
    }

    public void phoneNumber(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, phoneNumber, UserData, logger, "phoneNumber");

    }

    public void Continue() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Continue, logger, "Continue");

    }

    public void Continue1() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Continue1, logger, "Continue");

    }

    public void Address(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, Address, UserData, logger, "Address");

    }

    public void zipcode(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, zipcode, UserData, logger, "zipcode");

    }

    public void city(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, city, UserData, logger, "city");

    }

    public void state(String UserData) {
        Reusable_Actions_Loggers_POM.selectByVisibleText(driver, state, UserData, logger, "state");
    }

    public void Continue3() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Continue3, logger, "Continue");

    }

    public void Continue4() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Continue4, logger, "Continue");

    }

    public void cardNumber(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, cardNumber, UserData, logger, "cardNumber");

    }

    public void expMonth(String UserData) {
        Reusable_Actions_Loggers_POM.selectByVisibleText(driver, expMonth, UserData, logger, "expMonth");

    }

    public void expYear(String UserData) {
        Reusable_Actions_Loggers_POM.selectByVisibleText(driver, expYear, UserData, logger, "expYear");

    }

    public void cvv(String UserData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, cvv, UserData, logger, "SecCode");

    }

    public void PlaceOrder() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, PlaceOrder, logger, "Continue");

    }

    public String Error() {
        Reusable_Actions_Loggers_POM.getTextMethod(driver, Error, logger, "Error");
        return null;
    }
}