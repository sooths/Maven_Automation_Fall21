package HULU_Page_Object;

import Reusable_Library.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Info extends Reusable_Actions {

    ExtentTest logger;

    public Info(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Actions.logger;
    }//end of the constructor method{


    @FindBy(xpath = "//*[@id= 'email']")
    WebElement Email;

    @FindBy(xpath = "//*[@id= 'password']")
    WebElement Password;

    @FindBy(xpath = "//*[@id= 'firstName']")
    WebElement FirstName;

    @FindBy(xpath = "//*[@class = 'selector-selected input__text placeholder']")
    WebElement Birthmonth;

    @FindBy(xpath = "//*[@id = 'birthdayMonth-menu']")
    WebElement Birthmonths;

    @FindBy (xpath = "//*[@class= 'selector-selected input__text placeholder']")
    WebElement Birthday;

    @FindBy (xpath = "//*[@id= 'birthdayDay-menu']")
    WebElement Birthdays;

    @FindBy (xpath = "//*[@class= 'selector-selected input__text placeholder']")
    WebElement Birthyear;

    @FindBy (xpath = "//*[@id = 'birthdayYear-menu']")
    WebElement Birthyears;

    @FindBy (xpath = "//*[@class= 'selector-selected input__text placeholder']")
    WebElement Gender;

    @FindBy (xpath = "//*[@id ='gender-menu']")
    WebElement Genders;

    @FindBy (xpath = "//*[@class='button button--continue ']")
    WebElement Continue;


    public void Email(String UserData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Email,UserData,logger,"Email");
    }
    public void Password(String UserData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Password,UserData,logger,"Password");
    }
    public void FirstName(String UserData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,FirstName,UserData,logger,"FirstName");
    }
    public void Birthmonth(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Birthmonth,logger,"Birthmonth");
    }
    public void Birthmonths(String UserData){
        Reusable_Actions_Loggers_POM.selectMethod(driver,Birthmonths,logger,UserData,"Birthmonths");
    }
    public void Birthday(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Birthday,logger,"Birthday");
    }
    public void Birthdays(String UserData){
        Reusable_Actions_Loggers_POM.selectMethod(driver,Birthdays,logger,UserData,"Birthdays");
    }
    public void Birthyear(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Birthyear,logger,"Birthyear");
    }
    public void Birthyears(String UserData){
        Reusable_Actions_Loggers_POM.selectMethod(driver,Birthyears,logger,UserData,"Birthyears");
    }
    public void Gender(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Gender,logger,"Gender");
    }
    public void Genders(String UserData){
        Reusable_Actions_Loggers_POM.selectMethod(driver,Genders,logger,UserData,"Genders");
    }
    public void Continue (){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue,logger,"Continue");
    }
        
}

