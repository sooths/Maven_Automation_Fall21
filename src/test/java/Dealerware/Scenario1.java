package Dealerware;

import Reusable_Library.Reusable_Actions_Logger;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class Scenario1 extends Reusable_Annotations {

    @Test()
    public void Scenario1() {
        logger.log(LogStatus.INFO, "Navigate to Automation Practice");
        driver.navigate().to("http://automationpractice.com");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@class='login']",logger,"Login");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='email_create']","ariful.islam3245@gmail.com",logger,"Email");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='SubmitCreate']",logger,"Create An Account");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='id_gender1']",logger,"Select Male");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='customer_firstname']","Ariful",logger,"FirstName");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='customer_lastname']","Islam",logger,"LastName");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='passwd']","Camry2020!",logger,"Password");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='days']/option[4]",logger,"3rd Day");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='months']/option[7]",logger,"June");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='years']/option[25]",logger,"1999");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='firstname']","Ariful",logger,"FirstName");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='lastname']","Islam",logger,"LastName");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='address1']","8926 184st",logger,"Address");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='city']","Jamaica",logger,"City");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='id_state']/option[34]",logger,"State");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='postcode']","11423",logger,"Zipcode");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='id_country']/option[2]",logger,"United States");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='phone_mobile']","3479402303",logger,"Number");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='alias']","8926 184st",logger,"Address");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='submitAccount']",logger,"Register");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@class='logout']",logger,"Logout");

        //Scenario 1: (Create an account)
        //using your browser open : http://automationpractice.com
        //Tap on SignIn
        //In create account enter email
        //fill out all the necessary details and tap on Register
        //once Registered, tap on username and tap on YOUR PERSONAL INFORMATION
        //Now Verify the First Name and Last Name and then sign out

    }
}