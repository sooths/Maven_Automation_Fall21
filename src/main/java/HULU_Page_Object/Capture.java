package HULU_Page_Object;

import Reusable_Library.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Capture extends Reusable_Actions {
    ExtentTest logger;

    public Capture(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Actions.logger;
    }//end of the constructor method
    @FindBy (xpath = "//*[@class= 'ledger__price']")
    WebElement Capture;
    @FindBy (xpath = "//*[@class= 'summary__price']")
    WebElement Capture2;

    public void Capture(){
        String result = Reusable_Actions_Loggers_POM.getTextMethod(driver,Capture,logger,"Capture");
        System.out.println("The amount is " + result);
    }
    public void Capture2(){
        String result = Reusable_Actions_Loggers_POM.getTextMethod(driver,Capture2,logger,"Capture2");
        System.out.println("The amount is " + result);

    }

}
