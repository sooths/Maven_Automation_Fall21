package EXPRESS_Page_Object;

import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantity extends Reusable_Annotations {
    ExtentTest logger;

    public Quantity(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method


    //define all the WebElement we need for this page per use case

    @FindBy(xpath = "//*[text()='+quantity+']")
    WebElement Quantity;
    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement Checkout;
    @FindBy(xpath = "//*[text()='Checkout as Guest']")
    WebElement CheckoutasGuest;


    public void Quantity() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Quantity, logger, "Quantity");

    }//end of clicking on ship tab

    public void Checkout() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Checkout, logger, "Close Popup");

    }

    public void CheckoutasGuest() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, CheckoutasGuest, logger, "CheckoutasGuest");
    }

}


