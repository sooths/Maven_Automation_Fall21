package EXPRESS_Page_Object;

import Reusable_Library.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Reusable_Actions {
    //constructor is helper method that allows you to identify objects in your pom
    //so later you can class those methods in your test class
    //because your pom class is not static
    //declare a local logger to your pom class
    ExtentTest logger;

    public Homepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Actions.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy (xpath ="//*[@id='onetrust-accept-btn-handler']")
    WebElement ClosePopUp;
    @FindBy(xpath = "//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')]")
    WebElement HoverWomen;
    @FindBy(xpath = "//*[contains(@href,'womens-clothing/dresses/cat550007')]")
    WebElement ClickDresses;
    public void ClosePopUp(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ClosePopUp,logger,"ClosePopUp");
    }

    public void HoverWomen() {
Reusable_Actions_Loggers_POM.mouseHover(driver,HoverWomen,logger,"WomenHover");
    }//end of clicking on ship tab
    public void ClickDresses() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,ClickDresses,logger,"ClickWomanTab");
    }
}

