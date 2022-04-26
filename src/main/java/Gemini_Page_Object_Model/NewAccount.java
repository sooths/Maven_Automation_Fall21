package Gemini_Page_Object_Model;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount extends Reusable_Annotations {
    //constructor is helper method that allows you to identify objects in your pom
    //so later you can class those methods in your test class
    //because your pom class is not static
    //declare a local logger to your pom class
    ExtentTest logger;

    public NewAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@class='e15a1iq30 css-13jyjfw e1czpx482']")
    WebElement NewAccounts;

    public void NewAccounts() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, NewAccounts, logger, "NewAccounts");

    }

}