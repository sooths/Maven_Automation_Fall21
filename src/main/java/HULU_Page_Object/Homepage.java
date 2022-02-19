package HULU_Page_Object;

import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Reusable_Annotations {

    ExtentTest logger;

    public Homepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
@FindBy(xpath = "//*[@aria-label= 'Get Hulu plan']")
    WebElement GetHuluPlan;

    public void GetHuluPlan(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,GetHuluPlan,logger,"GetHuluPlan");
    }

}
