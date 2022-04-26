package Dealerware;

import Reusable_Library.Reusable_Actions_Logger;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Scenario2 extends Reusable_Annotations {

    @Test()
    public void Scenario2() throws InterruptedException {
        logger.log(LogStatus.INFO, "Navigate to Automation Practice");
        driver.navigate().to("http://automationpractice.com");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='block_top_menu']/ul/li[3]/a",logger,"T-Shirts");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll to the view by pixels
        jse.executeScript("scroll(0,750)");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@class='button ajax_add_to_cart_button btn btn-default']",logger,"Add To Cart");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@class='btn btn-default button button-medium']",logger,"Proceed To Checkout");
        //open : http://automationpractice.com
        //Tap T-Shirts
        //Tap Add to Cart
        //Proceed to Checkout
        //Verify the count and delete the Item
    }
}