package ActionItem_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ActionItem3Yahoo {
    public static void main(String[] args) throws InterruptedException {
                //search multiple cities and each time capture the search number from the result

                //set an array
                String[] hobbies = new String[6];
                hobbies[0] = "Kayaking";
                hobbies[1] = "Shoot";
                hobbies[2] = "Hunting";
                hobbies[3] = "Fishing";
                hobbies[4] = "Sailing";
                hobbies[5] = "Flying";

                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                ChromeOptions options = new ChromeOptions();
                //declare all the arguments you need
                //set as incognito mode
                options.addArguments("incognito");
                //define the web driver you are using
                //set as headless(running the driver on background)
                options.addArguments("headless");
                WebDriver driver = new ChromeDriver();
                for (int i = 0; i < hobbies.length; i++) {
                    driver.navigate().to("https://www.yahoo.com/");
                    //maximize my browser
                    //driver.manage().window().fullscreen(); //for mac
                    //driver.manage().window().maximize(); //for windows
                    //anytime when you go to a new page you should put some wait statement
                    Thread.sleep(2000);
                    //searching for cities on bing search field
                    driver.findElement(By.xpath("//*[@name='p']")).sendKeys(hobbies[i]);
                    //hit submit on yahoo search button
                    driver.findElement(By.xpath("//*[@value='Search']")).submit();
                    //another wait statement since we came to a new page (result page)
                    Thread.sleep(3000);
                    //capture the search result and store it as a variable
                    String result = driver.findElement(By.xpath("//*[@id='results']")).getText();
                    //declaring the array variable to split the result
                    String [] arrayResult = result.split(" ");
                    //now print the search number only
                    System.out.println("My search result is " + hobbies[i] + arrayResult[1]);
                    //close it
                } //end of loop
        driver.quit();
    } //end of main
} //end of java