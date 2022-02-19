package HULU_Page_Object;

import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify extends Reusable_Annotations {
    ExtentTest logger;

    public Verify(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    } //end of constructor method
    @FindBy(xpath = "//*[text()='Ariful Islam']")
    WebElement Verify;

    public void Verify(){
        String username = Reusable_Actions_Loggers_POM.getTextMethod(driver, Verify,logger,"Verify");
        System.out.println("The username is " + username);
    }
}
