package EXPRESS_Page_Object;

import Reusable_Library.ReusableActions;
import Reusable_Library.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Logger;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.jsoup.Connection;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExpressPOM extends Reusable_Actions {
    @Test
    public void Express_POMs() throws BiffException, IOException, WriteException {
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearch.xls"));
        Sheet readableSheet = readableFile.getSheet(1);
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Results.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(1);
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);
        for(int i = 1; i < rowCount2;i++) {
            String size = writableSheet.getCell(0, i).getContents();
            System.out.println("My values are " + size);
            String quantity = writableSheet.getCell(1, i).getContents();
            System.out.println("My values are " + quantity);
            String firstName = writableSheet.getCell(2, i).getContents();
            System.out.println("My values are " + firstName);
            String lastName = writableSheet.getCell(3, i).getContents();
            System.out.println("My values are " + lastName);
            String email = writableSheet.getCell(4, i).getContents();
            System.out.println("My values are " + email);
            String phoneNumber = writableSheet.getCell(5, i).getContents();
            System.out.println("My values are " + phoneNumber);
            String address = writableSheet.getCell(6, i).getContents();
            System.out.println("My values are " + address);
            String zipcode = writableSheet.getCell(7, i).getContents();
            System.out.println("My values are " + zipcode);
            String city = writableSheet.getCell(8, i).getContents();
            System.out.println("My values are " + city);
            String state = writableSheet.getCell(9, i).getContents();
            System.out.println("My values are " + state);
            String cardNumber = writableSheet.getCell(10, i).getContents();
            System.out.println("My values are " + cardNumber);
            String ExpMo = writableSheet.getCell(11, i).getContents();
            System.out.println("My values are " + ExpMo);
            String ExpYear = writableSheet.getCell(12, i).getContents();
            System.out.println("My values are " + ExpYear);
            String SecCode = writableSheet.getCell(13, i).getContents();
            System.out.println("My values are " + SecCode);
            String ErrorCode = writableSheet.getCell(14, i).getContents();
            System.out.println("My values are " + ErrorCode);
            logger.log(LogStatus.INFO, "Navigate to Express Home Page");
            driver.navigate().to("https://www.express.com");
            driver.manage().window().fullscreen();
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Express - Men's & Women's Clothing ")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }
            BaseClass.homepage().ClosePopUp();
            BaseClass.homepage().HoverWomen();
            BaseClass.homepage().ClickDresses();
            ReusableActions.scrollByPixelMethod(driver, "0", "450", "scroll");
            //BaseClass.dresses().SecondDressPicture();
            Reusable_Actions_Logger.clickByIndex(driver,"//*[@class='JOmERbbC974crOskZ2A3DA==']",2,logger,"Second Image");
            BaseClass.sizes().Size(size);
            BaseClass.sizes().AddtoBag();
            BaseClass.sizes().View();
            BaseClass.quantities().Quantity();
            BaseClass.quantities().Checkout();
            BaseClass.quantities().CheckoutasGuest();
            BaseClass.infos().firstName(firstName);
            BaseClass.infos().lastName(lastName);
            BaseClass.infos().email(email);
            BaseClass.infos().confirmEmail(email);
            BaseClass.infos().phoneNumber(phoneNumber);
            BaseClass.infos().Continue();
            BaseClass.infos().Continue1();
            BaseClass.infos().Address(address);
            BaseClass.infos().zipcode(zipcode);
            BaseClass.infos().city(city);
            BaseClass.infos().state(state);
            BaseClass.infos().Continue3();
            BaseClass.infos().Continue4();
            BaseClass.infos().cardNumber(cardNumber);
            BaseClass.infos().expMonth(ExpMo);
            BaseClass.infos().expYear(ExpYear);
            BaseClass.infos().cvv(SecCode);
            BaseClass.infos().PlaceOrder();
            //Step 5: storing the values to the writable excel sheet
            String result =  BaseClass.infos().Error();
            System.out.println("The error is "+result);
            Label label = new Label(14,i,result);
            //I need to write back to the writable sheet
            writableSheet.addCell(label);

            //delete cookies
            driver.manage().deleteAllCookies();
        }//end of loop

        //Step 6: writing back to the writable file to see
        writableFile.write();
        writableFile.close();

        //increment
    }//end of test

}//end of java class
