package Reusable_Library;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableActions {
    //create a reusable method for WebDriver and chromeoptions
    public static WebDriver setDriver() {
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        //options.addArguments("start-maximized");
        options.addArguments("fullscreen"); //for mac users
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of webdriver method

    //creating void click method for any web element
    public static void clickMethod(WebDriver driver, String xpath, String elementName) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " Error:" + e);
        }
    }

    //creating void sendkeys method for any web element
    public static void sendKeysMethod(WebDriver driver, String xpath, String userData, String elementName) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Typing on element " + elementName);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //clear first
            element.clear();
            //enter user data
            element.sendKeys(userData);
        } catch (Exception e) {
            System.out.println("Unable to type on " + elementName + " Error:" + e);
        }
    }//end of click sendKeysMethod

    //creating return getText method for any text web element
    public static String getTextMethod(WebDriver driver, String xpath, String elementName) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Capturing text on element " + elementName);
        //declare a global variable to capture the text so I can return it
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //capture text
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text on " + elementName + " Error:" + e);
        }
        return result;

    }//end of click getTextMethod

    //creating void submit method for any web element
    public static void submitMethod(WebDriver driver, String xpath, String elementName) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Submitting on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on " + elementName + " Error:" + e);
        }
        //create a reusable method for javascript executor for scrollingByPixel and pass driver
    }

    public static void scrollByPixelMethod(WebDriver driver, String x, String y, String scroll) {
        System.out.println("Able to " + scroll);
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeAsyncScript("scroll" + x + "," + y + ")");
        } catch (Exception e) {
            System.out.println("Unable to " + scroll + "Error:" + e);
        }
    }

        public static void selectMethod (WebDriver driver, String xpath, String userData, String elementName){
            WebDriverWait wait = new WebDriverWait(driver, 15);
            System.out.println("Selecting element " + elementName);
            try {
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
                element.sendKeys(userData);
            } catch (Exception e) {
                System.out.println("Unable to select " + elementName + " Error" + e);
            }//End of try
        }//end of Select by text method
    }
