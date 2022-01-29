package Day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
    public static void main(String[] args) {

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //define the web driver you are using
        ChromeDriver driver = new ChromeDriver();

        //simply open the google web site
        driver.navigate().to("https://www.facebook.com");

        //maximize my browser
        // driver.manage().window().fullscreen(); //for mac
        driver.manage().window().maximize(); //for windows

        //close it
        //driver.close();
    }  //end of main
} //end of java class



