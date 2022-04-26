package LastDay;

import Reusable_Library.Reusable_Actions_Logger;
import Reusable_Library.Reusable_Annotations;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Gemini extends Reusable_Annotations {

    @Test()
    public void Gemini() throws BiffException, IOException, WriteException, InterruptedException {

        //datadriventesting via excel
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearch.xls"));
        Sheet readableSheet = readableFile.getSheet(2);
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Results.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(2);
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);
        int i = 1;
        while (i < rowCount2) {
            String CompanyName = writableSheet.getCell(0, i).getContents();
            System.out.println("My values are " + CompanyName);
            String Company = writableSheet.getCell(1, i).getContents();
            System.out.println("My values are " + Company);
            String Country = writableSheet.getCell(2, i).getContents();
            System.out.println("My values are " + Country);
            String State = writableSheet.getCell(3, i).getContents();
            System.out.println("My values are " + State);
            String Legal = writableSheet.getCell(4, i).getContents();
            System.out.println("My values are " + Legal);
            String Middle = writableSheet.getCell(5, i).getContents();
            System.out.println("My values are " + Middle);
            String Last = writableSheet.getCell(6, i).getContents();
            System.out.println("My values are " + Last);
            String Email = writableSheet.getCell(7, i).getContents();
            System.out.println("My values are " + Email);
            String Result = writableSheet.getCell(8, i).getContents();
            System.out.println("My values are " + Result);


            driver.navigate().to("https://exchange.sandbox.gemini.com/");
            //go to sandbox
            driver.manage().window().fullscreen();
            //for mac users
            Reusable_Actions_Logger.clickMethod(driver, "//*[@class='e15a1iq30 css-13jyjfw e1czpx482']", logger, "new account");
            //The automation should click the ‘Create new account’ link

            Reusable_Actions_Logger.clickMethod(driver, "//*[@class='e15a1iq30 css-bqdaix e1czpx482']", logger, "business account");
            //The automation should click the ‘Create a business account’ link, with the resulting page of https://exchange.sandbox.gemini.com/register/institution

            Reusable_Actions_Logger.sendKeysMethod(driver, "//*[@name='company.legalName']", CompanyName, logger, "company legal name");
            //Enter Company Name

            Reusable_Actions_Logger.sendKeysMethod(driver, "//*[@id='companyTypeDropdown']", Company, logger, "company type");
            //Select Company Type

            Reusable_Actions_Logger.sendKeysMethod(driver, "//*[@id='countryDropdown']", Country, logger, "country of business");
            //Select Country

            Reusable_Actions_Logger.sendKeysMethod(driver, "//*[@id='stateDropdown']", State, logger, "state");
            //Select State

            Reusable_Actions_Logger.sendKeysMethod(driver, "//*[@name='personal.legalName.firstName']", Legal, logger, "firstname");
            //Enter First Name

            Reusable_Actions_Logger.sendKeysMethod(driver, "//*[@name='personal.legalName.middleName']", Middle, logger, "firstname");
            //Enter Middle Name

            Reusable_Actions_Logger.sendKeysMethod(driver, "//*[@name='personal.legalName.lastName']", Last, logger, "middlename");
            //Enter Last Name

            Reusable_Actions_Logger.sendKeysMethod(driver, "//*[@name='personal.email']", Email, logger, "email");
            //Enter Email

            Reusable_Actions_Logger.clickMethod(driver,"(//SPAN)[13]", logger,"Accept");
            //Click Accept

            Reusable_Actions_Logger.clickMethod(driver, "//*[text()='Continue']", logger, "click Continue");
            //Click Continue

            //It will capture the error and it will post in the excel readable sheet

            //The automation should perform happy path and negative testing, demonstrating that the form works with good test data, and prevents users from entering bad data.

            //Step 5: storing the values to the writable excel sheet
            Label label = new Label(8, i, Result);

            //I need to write back to the writable sheet
            writableSheet.addCell(label);
            driver.manage().deleteAllCookies();

            //increment
            i = i + 1;
        }//end of
        //end the logger
        writableFile.write();
        writableFile.close();
    }
}


