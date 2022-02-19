package EXPRESS_Page_Object;

import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Reusable_Library.Reusable_Actions_Loggers_POM.getScreenShot;

public class Size extends Reusable_Annotations {
    ExtentTest logger;

    public Size(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method


    //define all the WebElement we need for this page per use case

    @FindBy(xpath = "//*[text()='+size+']")
    WebElement Size;
    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement AddtoBag;
    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement View;

    public void Size(String Size) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element Size");
        logger.log(LogStatus.INFO, "Clicking on element size");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='"+Size+"']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on size " + e);
            logger.log(LogStatus.FAIL, "Unable to click on size. Error " + e);
            getScreenShot(driver, "size", logger);
        }//End of catch
    }//End of Size

    public void AddtoBag() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, AddtoBag, logger, "Add to Bag");
    }

        public void View () {
            Reusable_Actions_Loggers_POM.clickMethod(driver,View, logger, "View Bag");

        }
    }
