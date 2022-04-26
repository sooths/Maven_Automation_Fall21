package Gemini_Page_Object_Model;

import Reusable_Library.Reusable_Actions_Logger;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessAccount extends Reusable_Annotations {
    //constructor is helper method that allows you to identify objects in your pom
    //so later you can class those methods in your test class
    //because your pom class is not static
    //declare a local logger to your pom class
    ExtentTest logger;

    public BusinessAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@class='e15a1iq30 css-bqdaix e1czpx482']")
    WebElement BusinessAccounts;

    @FindBy(xpath = "//*[@name='company.legalName']")
    String CompanyName;

    @FindBy(xpath = "//*[@id='companyTypeDropdown']")
    String Company;

    @FindBy(xpath = "//*[@id='countryTypeDropdown']")
    String Country;

    @FindBy(xpath = "//*[@id='stateDropdown']")
    String State;

    @FindBy(xpath = "//*[@name='personal.legalName.firstName']")
    String Legal;

    @FindBy(xpath = "//*[@name='personal.legalName.middleName']")
    String Middle;

    @FindBy(xpath = "//*[@name='personal.legalName.lastName']")
    String Last;

    @FindBy(xpath = "//*[@name='personal.email']")
    String Email;

    @FindBy(xpath = "(//SPAN)[13]")
    String Accept;

    @FindBy(xpath = "//*[text()='Continue']")
    String Continue;

    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Error;

    public void BusinessAccounts() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, BusinessAccounts, logger, "BusinessAccounts");
    }

    public void CompanyName(String UserData) {
        Reusable_Actions_Logger.sendKeysMethod(driver, CompanyName, UserData, logger, "company legal name");
    }

    public void Company(String UserData) {
        Reusable_Actions_Logger.sendKeysMethod(driver, Company, UserData, logger, "company type");
    }

    public void Country(String UserData) {
        Reusable_Actions_Logger.sendKeysMethod(driver, Country, UserData, logger, "country of business");
    }

    public void State(String UserData) {
        Reusable_Actions_Logger.sendKeysMethod(driver, State, UserData, logger, "state");

    }

    public void Legal(String UserData) {
        Reusable_Actions_Logger.sendKeysMethod(driver, Legal, UserData, logger, "firstname");
    }

    public void Middle(String UserData) {

        Reusable_Actions_Logger.sendKeysMethod(driver, Middle, UserData, logger, "middlename");

    }

    public void Last(String UserData) {

        Reusable_Actions_Logger.sendKeysMethod(driver, Last, UserData, logger, "middlename");
    }

    public void Email(String UserData) {

        Reusable_Actions_Logger.sendKeysMethod(driver, Email, UserData, logger, "email");
    }

    public void Accept() {

        Reusable_Actions_Logger.clickMethod(driver, Accept, logger, "Accept");
    }

    public void Continue() {

        Reusable_Actions_Logger.clickMethod(driver, Continue, logger, "click Continue");
    }

    public String Error() {
        Reusable_Actions_Loggers_POM.getTextMethod(driver, Error, logger, "Error");
        return null;
    }
}

