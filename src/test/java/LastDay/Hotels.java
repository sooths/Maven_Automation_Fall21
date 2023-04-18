package LastDay;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hotels {
    public static void main(String[] args) throws InterruptedException {
//set up your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        ChromeOptions options = new ChromeOptions();
        //start maximized for windows
        options.addArguments("start-maximized");
        //    options.addArguments("incognito");
//       options.addArguments("headless");
        //for mac users use the below line of code
//        options.addArguments("start-fullscreen");
        //or you can use below
        options.addArguments("--kiosk");
        //define the webdriver and pass the options
        WebDriver driver = new ChromeDriver(options);
        //go to google home page
        driver.navigate().to("https://www.hotels.com");
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("//*[@class='uitk-fake-input uitk-form-field-trigger']")).click();
        } catch (Exception e) {
            System.out.println("Unable to enter down payment value because of error: " + e);
        }
        driver.findElement(By.xpath("//*[@id='destination_form_field']")).sendKeys("Miami");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@class, 'rapid-nonanchor')]")).click();
        Thread.sleep(2000);
//quit driver
        driver.quit();
    }
}
