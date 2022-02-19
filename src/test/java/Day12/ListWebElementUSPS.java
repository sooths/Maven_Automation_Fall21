package Day12;

import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Actions_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class ListWebElementUSPS extends Reusable_Annotations {
    @Test
    public void uspsTest() {
        //navigate to usps
        driver.navigate().to("https://www.usps.com");
        //using explicit wait to get the count of elements within same class group
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            List<WebElement> uspsTabs = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
            System.out.println("My Nav list count is " + uspsTabs.size());
            logger.log(LogStatus.PASS,"Successfully got the count " + uspsTabs.size());
        } catch (Exception e) {
            System.out.println("unable to locate links " + e);
            logger.log(LogStatus.FAIL,"Unable to locate Links " + e);
            Reusable_Actions_Logger.getScreenShot(driver,"Links count",logger);
        }

    }//end of test
}

