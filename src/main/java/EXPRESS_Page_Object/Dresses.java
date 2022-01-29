package EXPRESS_Page_Object;

import Reusable_Library.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dresses extends Reusable_Actions {
    ExtentTest logger;

    public Dresses(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Actions.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[contains(@href'/clothing/women/puff-sleeve-button-sweater-dress/pro/07806523/color/Pitch Black']")
    WebElement SecondDressPicture;

    public void SecondDressPicture() {
        Reusable_Actions_Loggers_POM.clickByIndex(driver, SecondDressPicture, 2, logger, "SecondDressPicture");
    }//end of clicking on ship tab
}





