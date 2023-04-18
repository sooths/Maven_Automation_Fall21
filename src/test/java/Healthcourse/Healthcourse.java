package Healthcourse;

import Day9.ReusableActions;
import Reusable_Library.Reusable_Actions_Logger;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class Healthcourse extends Reusable_Annotations {

    @Test()
    public void Scenario1() throws InterruptedException {
        logger.log(LogStatus.INFO, "Navigate to Google");
        driver.navigate().to("https://www.google.com");
        Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@name='q']","GrubHub",logger,"GrubHub");
        ReusableActions.submitMethod(driver, "//*[@name='btnK']", "Google Search Button");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@href='https://twitter.com/Grubhub?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor']",logger,"Second Link");
        //Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='et_pb_contact_company_0']","realcme",logger,"realcme");
        //Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='et_pb_contact_email_0']","winie@tryninja.io",logger,"winie@tryninja.io");
        //Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='et_pb_contact_phone_number_0']","999 999 9999",logger,"999 999 9999");
        //Reusable_Actions_Logger.sendKeysMethod(driver,"//*[@id='et_pb_contact_message_0']","This is an assignment for the QA position. Please ignore.",logger,"This is an assignment for the QA position. Please ignore.");
        //1. Go to https://www.healthcourse.com/contact
        // Write 3 example test scenarios that would test this module.
        //2. Pick one of the test scenarios that you created above. What approach would you take to automate this test scenario?
        //3. Create a simple automation maven project and automate the test scenarios from 1a on GitHub and provide us with the link.
        //Use the following data for your automation:
        //i. Name: qainterview
        //ii. Company: realcme
        //iii. Email Address: winie@tryninja.io
        //iv. Phone Number: 999 999 9999
        //v. Message: "This is an assignment for the QA position. Please ignore."


    }
}
