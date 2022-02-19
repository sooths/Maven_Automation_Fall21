package HULU_Page_Object;

import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Info2 extends Reusable_Annotations {
    ExtentTest logger;

    public Info2(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    } //end of constructor method
    @FindBy(xpath = "//*[text()='Log In']")
    WebElement Login;
    @FindBy (xpath = "//*[@id='email_id']")
    WebElement Email;
    @FindBy (xpath = "//*[@id='password_id']")
    WebElement Password;
    @FindBy (xpath = "//*[@class='jsx-4282396490 button-dark login-button']")
    WebElement ClickLogin;


    public void Login(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Login,logger,"Login");
    }
    public void Email(String UserData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Email,UserData,logger,"Email");
    }
    public void Password (String UserData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Password,UserData,logger,"Password");
    }
    public void ClickLogin(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ClickLogin,logger,"Login");
    }

}

