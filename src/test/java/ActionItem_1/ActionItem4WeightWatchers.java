package ActionItem_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class ActionItem4WeightWatchers {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> Zipcodes = new ArrayList<>();
        Zipcodes.add("10467");
        Zipcodes.add("11435");
        Zipcodes.add("10594");

//Set the web driver Manager

        WebDriverManager.chromedriver().setup();
//Set the chromeoptions
        ChromeOptions options = new ChromeOptions();
//Maximize my screen
        options.addArguments("start-maximized");
        options.addArguments("incognito");

//Set my web driver

        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i< Zipcodes.size(); i++) {

            //navigate to weight-watchers
            driver.navigate().to("https://www.weightwatchers.com");

            // Thread.sleep(4000);
            //Click on dropdown
            try{
                driver.findElement(By.xpath("//*[@class='MenuItem_menu-item__angle-wrapper__1XaUv']")).click();
            }catch (Exception e){
                System.out.println("Unable to click attend dropdown "+e);
            }//end of Attend dropdown exception

            //Click on Unlimited Workshops
            try {
                driver.findElement(By.xpath("//*[@class='MenuItem_subtitle__3LoiE']")).click();
            }catch (Exception e){
                System.out.println("Unable to click on unlimited workshops "+e);
            }//end of unlimited workshop exceptions

            //set a wait time for new page
            Thread.sleep(1000);

            //Click on find a studio link
            try {
                driver.findElement(By.xpath("//*[@class='buttonWrapper-QK2gi']")).click();
            }catch (Exception e){
                System.out.println("Unable to click on studio link "+e);
            }//end of studio link exceptions

            //set a time for new page
            Thread.sleep(2000);
            //Enter Zipcodes
            try {
                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(Zipcodes.get(i));
            }catch (Exception e) {
                System.out.println("Unable to enter zipcodes " + e);
            }//end of zipcode exception

            // Click on search arrow
            try {
                driver.findElement(By.xpath("//*[@id='location-search-cta']")).submit();
            }catch (Exception e) {
                System.out.println("Unable to click on search arrow "+e);
            }//end of search arrow exception

            //set a time for new page
            Thread.sleep(2000);

            //click on specific links for the studios
            // storing WebElement as list for find elements
            try {
                List<WebElement> links = driver.findElements(By.xpath("//*[@class='container-3SE46']"));
                //set conditions
                if (i == 0) {
                    links.get(2).click();
                } else if (i == 1) {
                    links.get(1).click();
                } else if (i == 2) {
                    links.get(0).click();
                }//end of conditions
            }catch (Exception e){
                System.out.println("Unable to click on specific links "+e);
            }//end of links for studios exception

            Thread.sleep(2000);

            //Capture the address and store it as a variable
            try {
                String address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                System.out.println("My studio address near " + Zipcodes.get(i) + " is " + address);

            }catch (Exception e){
                System.out.println("Unable to capture the address " +e);
            }//End of try

            //Scroll to the studio hours
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            //Scroll to the view by pixels
            jse.executeScript("scroll(0,450)");

            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[text()='Business hours']")).click();
            }catch (Exception e){
                System.out.println("Unable to click on business hours" +e);
            }//End of try
            Thread.sleep(2000);

            try {
                String Schedule = driver.findElement(By.xpath("//*[@class='hoursWrapper-1KHIv show-1db4o']")).getText();
                System.out.println("The schedule timings for " + Zipcodes.get(i) + " is " + Schedule);
            }catch (Exception e){
                System.out.println("Unable to capture schedule " +e);
            }//End of try
        }//End of for loop

    }
}
