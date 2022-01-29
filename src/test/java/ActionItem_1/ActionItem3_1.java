package ActionItem_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionItem3_1 {

    public static void main(String[] args) throws InterruptedException {
    //search multiple cities and each time capture the search number from the result

        //set an array
        String[] hobbies = new String[6];
        hobbies[0] = "Kayaking";
        hobbies[1] = "Shooting";
        hobbies[2] = "Hunting";
        hobbies[3] = "Fishing";
        hobbies[4] = "Sailing";
        hobbies[5] = "Flying";

        //define the webdriver outside of the for loop
        //set the property of the chromedriver we are using

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        //define the web driver you are using
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < hobbies.length; i++) {
            driver.navigate().to("https://www.bing.com/");
            //maximize my browser
            //driver.manage().window().fullscreen(); //for mac
            //driver.manage().window().maximize(); //for windows

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //searching for hobbies on bing search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobbies[i]);

            //hit submit on bing search button
            driver.findElement(By.xpath("//*[@value='QBLH']")).submit();

            //another wait statement since we came to a new page (result page)
            Thread.sleep(3000);

            //capture the search result and store it as a variable
            String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();

            //declaring the array variable to split the result
            String[] arrayResult = result.split(" ");

            //now print the search number only
            System.out.println("My search result is " + hobbies [i] + arrayResult [0]);

            //close it
        } //end of loop
        driver.quit();
    } //end of main
    } //end of java



