package Gemini_Page_Object_Model;

import Reusable_Library.Reusable_Annotations;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class GeminiPOM extends Reusable_Annotations {
    @Test()
    public void Geminis() throws BiffException, IOException, WriteException {

        //datadriventesting via excel
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearch.xls"));
        Sheet readableSheet = readableFile.getSheet(2);
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Results.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(2);
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);
        for(int i = 1; i < rowCount2;i++) {
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
            BaseClass.newAccount().NewAccounts();
            BaseClass.businessAccount().BusinessAccounts();
            BaseClass.businessAccount().CompanyName(CompanyName);
            BaseClass.businessAccount().Company(Company);
            BaseClass.businessAccount().Country(Country);
            BaseClass.businessAccount().State(State);
            BaseClass.businessAccount().Legal(Legal);
            BaseClass.businessAccount().Middle(Middle);
            BaseClass.businessAccount().Last(Last);
            BaseClass.businessAccount().Email(Email);
            BaseClass.businessAccount().Accept();
            BaseClass.businessAccount().Continue();
            String result =  BaseClass.businessAccount().Error();
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
