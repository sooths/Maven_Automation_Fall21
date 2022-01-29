package ActionItem_1;

import Reusable_Library.Reusable_Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ActionItem7AetnaOptional extends Reusable_Actions {

    @Test
    public void huluSearchLoop() {
        //create following ArrayList:  zipCode, milesRange(this is int ArrayList not String)
        ArrayList<String> Zipcodes = new ArrayList<>();
        Zipcodes.add("10467");
        Zipcodes.add("11435");
        Zipcodes.add("10594");

        ArrayList<String> milesRange = new ArrayList<>();
        milesRange.add("10");
        milesRange.add("20");
        milesRange.add("30");
        //Set the web driver Manager
        WebDriverManager.chromedriver().setup();
        //Set the chromeoptions
        ChromeOptions options = new ChromeOptions();
        //Maximize my screen
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //Set my web driver
        WebDriver driver = new ChromeDriver(options);
        for (int i = 0; i < Zipcodes.size(); i++) {
            //navigate to weight-watchers
            driver.navigate().to("https://www.aetna.com");
            driver.manage().window().fullscreen();
            //entering a unique keyword from array list
            //verify the welcome page title appears as expected
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Health Insurance Plans | Aetna")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }
            //click on Shop for a plan
            try {
                WebElement Shop = driver.findElement(By.xpath("//*[text()= 'Shop for a plan']"));
                Shop.click();
            } catch (Exception e) {
                System.out.println("unable to click Shop for a plan " + e);
            }//end of Show advanced options exception

            //click on Medicare Link
            try {
                WebElement Medicare = driver.findElement(By.xpath("//*[text()= 'Medicare']"));
                Medicare.click();
            } catch (Exception e) {
                System.out.println("unable to click Shop for a plan " + e);
            }
            //on the right side click on Find a doctor
            try {
                WebElement Doctor = driver.findElement(By.xpath("//*[@name= ‘Find a doctor ’]"));
                Doctor.click();
            } catch (Exception e) {
                System.out.println("unable to click Shop for a plan " + e);
            }
            //on guest section click on 2020 Medicare plans you purchase yourself
            try {
                WebElement Medicare = driver.findElement(By.xpath("//*[text()= '2022 Medicare plans you purchase yourself']"));
                Medicare.click();
            } catch (Exception e) {
                System.out.println("unable to click Shop for a plan " + e);
            }

            //7. clear and enter a zipcode(this is where you pass zipCode variable)
            //8. wait few seconds then zipcode drop down suggestion will appear and then click on the appropriate matching zipcode link
            //9. now there is a Slider bar under zipcode which has 25 miles selected as default.. I want you to go to google and research how to automate range slider using selenium and java and choose the example that you understand and try to use that example on a try catch for this step and see if you can figure it out. I already have working code but this is where i wanna see how your critical thinking knowledge and challenge yourself to figure out a solution which you haven't used yet
            //9. once you select the range based on your array list then click on Skip plan selection*
            //10. on next page click on Medical Doctors & Specialists
            //11. click on Doctors(Primary Care)
            //12. click on All Primary care physicians
            //13. under Provider/Facility Information   print out the first result for doctor's name and clinic address in a try catch exception
            //good luck

            //delete cookies
            driver.manage().deleteAllCookies();
        }
    }
}
